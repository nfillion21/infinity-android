package pgm.poolp.infinity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsRun
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.SportsFootball
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.sharp.SafetyCheck
import androidx.compose.material.icons.sharp.Shield
import androidx.compose.material.icons.twotone.Shield
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.Flow
import pgm.poolp.infinity.game.interfaces.Player
import pgm.poolp.infinity.ui.theme.InfinityTheme
import pgm.poolp.infinity.viewmodels.PlayerViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //WindowCompat.setDecorFitsSystemWindows(window, true)
        setContent {
            InfinityTheme {
                val playerViewModel: PlayerViewModel = hiltViewModel()

                Scaffold {
                    PlayersList(movies = playerViewModel.players)
                }
            }
        }
    }
}


@Composable
fun PlayersList(movies: Flow<PagingData<Player>>) {

    var displayLoading = remember { mutableStateOf(false) }

    val lazyMovieItems = movies.collectAsLazyPagingItems()

    LazyColumn(
        contentPadding = WindowInsets.systemBars.asPaddingValues()) {

        item {
            LinearProgress(isVisible = displayLoading.value)
        }

        items(lazyMovieItems) { movie ->
            EpisodeListItem(
                player = movie!!,
                modifier = Modifier.fillParentMaxWidth()
            )
        }

        lazyMovieItems.apply {
            when {
                loadState.refresh is LoadState.Loading -> {
                    displayLoading.value = true
                }
                loadState.append is LoadState.Loading -> {
                    displayLoading.value = true
                }
                else -> displayLoading.value = false
            }
        }

        item {
            LinearProgress(isVisible = displayLoading.value)
        }
    }
}

@Composable
fun LinearProgress(isVisible: Boolean){
    if (isVisible) {
        LinearProgressIndicator(
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Composable
fun MovieItem(movie: Player) {
    Row(
        modifier = Modifier
            .padding(start = 16.dp, top = 16.dp, end = 16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        MovieTitle(
            movie.toString(),
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun EpisodeListItem(
    player: Player,
    modifier: Modifier = Modifier
) {
    ConstraintLayout(modifier = modifier.clickable { /*onClick(episode.uri) */ }) {
        val (
            divider,
            logoImage, episodeTitle,
            podcastTitle, moveIcon, moveText,
            throwBallIcon, throwBallText,
            armourIcon, armourText,

        ) = createRefs()

        val Keyline1 = 24.dp

        Divider(
            Modifier.constrainAs(divider) {
                top.linkTo(parent.top)
                centerHorizontallyTo(parent)

                width = Dimension.fillToConstraints
            }
        )

        Image(
            imageVector = Icons.Rounded.Add,
            contentDescription = stringResource(R.string.app_name),
            contentScale = ContentScale.Fit,
            colorFilter = ColorFilter.tint(LocalContentColor.current),
            modifier = Modifier
                .size(56.dp)
                .semantics { role = Role.Image }
                .constrainAs(logoImage) {
                    end.linkTo(parent.end, 16.dp)
                    top.linkTo(parent.top, 16.dp)
                }
        )

        Text(
            text = player.name,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            style = androidx.compose.material.MaterialTheme.typography.subtitle1,
            modifier = Modifier.constrainAs(episodeTitle) {
                linkTo(
                    start = parent.start,
                    end = logoImage.start,
                    startMargin = Keyline1,
                    endMargin = 16.dp,
                    bias = 0f
                )
                top.linkTo(parent.top, 16.dp)
                height = Dimension.preferredWrapContent
                width = Dimension.preferredWrapContent
            }
        )

        val titleImageBarrier = createBottomBarrier(podcastTitle, logoImage)

        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = player.toString(),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                style = androidx.compose.material.MaterialTheme.typography.subtitle2,
                modifier = Modifier.constrainAs(podcastTitle) {
                    linkTo(
                        start = parent.start,
                        end = logoImage.start,
                        startMargin = Keyline1,
                        endMargin = 16.dp,
                        bias = 0f
                    )
                    top.linkTo(episodeTitle.bottom, 6.dp)
                    height = Dimension.preferredWrapContent
                    width = Dimension.preferredWrapContent
                }
            )
        }

        Image(
            imageVector = Icons.Rounded.DirectionsRun,
            contentDescription = stringResource(R.string.app_name),
            contentScale = ContentScale.Fit,
            colorFilter = ColorFilter.tint(LocalContentColor.current),
            modifier = Modifier
                .size(48.dp)
                .padding(6.dp)
                .semantics { role = Role.Image }
                .constrainAs(moveIcon) {
                    start.linkTo(parent.start, Keyline1)
                    top.linkTo(titleImageBarrier, margin = 10.dp)
                }
        )

        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = player.move.toString(),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = androidx.compose.material.MaterialTheme.typography.caption,
                modifier = Modifier.constrainAs(moveText) {
                    centerVerticallyTo(moveIcon)
                    start.linkTo(moveIcon.end, 12.dp)
                    width = Dimension.preferredWrapContent
                }
            )
        }

        val runBarrier = createBottomBarrier(moveText, moveIcon)

        Image(
            imageVector = Icons.Rounded.SportsFootball,
            contentDescription = stringResource(R.string.app_name),
            contentScale = ContentScale.Fit,
            colorFilter = ColorFilter.tint(LocalContentColor.current),
            modifier = Modifier
                .size(48.dp)
                .padding(6.dp)
                .semantics { role = Role.Image }
                .constrainAs(throwBallIcon) {
                    start.linkTo(parent.start, Keyline1)
                    top.linkTo(runBarrier, margin = 0.dp)
                }
        )

        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = player.throwBall.toString(),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = androidx.compose.material.MaterialTheme.typography.caption,
                modifier = Modifier.constrainAs(throwBallText) {
                    centerVerticallyTo(throwBallIcon)
                    start.linkTo(moveIcon.end, 12.dp)
                    width = Dimension.preferredWrapContent
                }
            )
        }

        val armourBarrier = createBottomBarrier(throwBallText, throwBallIcon)

        Image(
            imageVector = Icons.Rounded.Shield,
            contentDescription = stringResource(R.string.app_name),
            contentScale = ContentScale.Fit,
            colorFilter = ColorFilter.tint(LocalContentColor.current),
            modifier = Modifier
                .size(48.dp)
                .padding(6.dp)
                .semantics { role = Role.Image }
                .constrainAs(armourIcon) {
                    start.linkTo(parent.start, Keyline1)
                    top.linkTo(armourBarrier, margin = 0.dp)
                    bottom.linkTo(parent.bottom, 10.dp)
                }
        )

        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = player.armour.toString(),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = androidx.compose.material.MaterialTheme.typography.caption,
                modifier = Modifier.constrainAs(armourText) {
                    centerVerticallyTo(armourIcon)
                    start.linkTo(moveIcon.end, 12.dp)
                    width = Dimension.preferredWrapContent
                }
            )
        }
    }
}

@Composable
fun MovieTitle(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier,
        text = title,
        maxLines = 2,
        style = MaterialTheme.typography.bodyMedium,
        overflow = TextOverflow.Ellipsis
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InfinityTheme {
    }
}