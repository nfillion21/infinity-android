package pgm.poolp.infinity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.DirectionsRun
import androidx.compose.material.icons.rounded.Shield
import androidx.compose.material.icons.rounded.SportsFootball
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import androidx.paging.compose.itemsIndexed
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import pgm.poolp.infinity.game.interfaces.Player
import pgm.poolp.infinity.ui.theme.InfinityTheme
import pgm.poolp.infinity.viewmodels.PlayerViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            InfinityTheme {
                androidx.compose.material3.Surface{
                    val playerViewModel: PlayerViewModel = hiltViewModel()
                    PlayersList(playerViewModel)
                }
            }
        }
    }
}


@Composable
fun PlayersList(viewModel: PlayerViewModel) {

    val lazyMovieItems = viewModel.players.collectAsLazyPagingItems()
    val displayLoading by viewModel.isLoading.collectAsState(initial = false)

    Box {

        /*
        val listState = rememberLazyListState()
        val coroutineScope = rememberCoroutineScope()
         */

        LazyColumn(
            //state = listState,
            contentPadding = WindowInsets.systemBars.asPaddingValues()

        ) {
            itemsIndexed(lazyMovieItems) { index, movie ->
                EpisodeListItem(
                    player = movie!!,
                    key = index,
                    itemCount = lazyMovieItems.itemCount,
                    modifier = Modifier.fillParentMaxWidth()
                )
            }

            lazyMovieItems.apply {
                when {
                    /*
                    loadState.refresh is LoadState.NotLoading -> {
                        lazyMovieItems.itemCount.takeIf { it >= 0 }?.let {
                            coroutineScope.launch {
                                listState.animateScrollToItem(it-1 )
                            }
                        }
                    }
                    */

                    loadState.refresh is LoadState.Loading -> {
                        viewModel.setLoading(true)
                    }
                    loadState.append is LoadState.Loading -> {
                        viewModel.setLoading(true)
                    }
                    else -> {
                        viewModel.setLoading(false)
                    }
                }
            }
        }

        if (displayLoading) {
            Column {
                Spacer(modifier = Modifier.weight(1f))
                LinearProgressIndicator(
                    color = androidx.compose.material3.MaterialTheme.colorScheme.tertiary,
                    //backgroundColor = androidx.compose.material3.MaterialTheme.colorScheme.secondary,
                    modifier = Modifier
                        .fillMaxWidth()
                        .navigationBarsPadding()
                )
            }
        }
    }

}

@Composable
fun EpisodeListItem(
    player: Player,
    key: Int,
    itemCount: Int,
    modifier: Modifier = Modifier
) {
    ConstraintLayout(modifier = modifier.clickable { /*onClick(episode.uri) */ }) {
        val (
            divider,
            logoImage, episodeTitle,
            podcastTitle, moveIcon, moveText,
            throwBallIcon, throwBallText,
            armourIcon, armourText,
            counter

        ) = createRefs()

        val keyline1 = 24.dp

        Divider(
            color = androidx.compose.material3.MaterialTheme.colorScheme.tertiary.copy(alpha = 0.25f),
            modifier = Modifier.constrainAs(divider)
            {
                top.linkTo(parent.top)
                centerHorizontallyTo(parent)

                width = Dimension.fillToConstraints
            }
        )

        Image(
            painterResource(player.icon),
            contentDescription = stringResource(R.string.app_name),
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(92.dp)
                .clip(RoundedCornerShape(10.dp))
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
            style = androidx.compose.material3.MaterialTheme.typography.labelMedium,
            modifier = Modifier.constrainAs(episodeTitle) {
                linkTo(
                    start = parent.start,
                    end = logoImage.start,
                    startMargin = keyline1,
                    endMargin = 16.dp,
                    bias = 0f
                )
                top.linkTo(parent.top, 16.dp)
                height = Dimension.preferredWrapContent
                width = Dimension.preferredWrapContent
            }
        )

        val titleImageBarrier = createBottomBarrier(podcastTitle, logoImage)

        Text(
            text = player.race,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            style = androidx.compose.material3.MaterialTheme.typography.labelSmall,
            modifier = Modifier.constrainAs(podcastTitle) {
                linkTo(
                    start = parent.start,
                    end = logoImage.start,
                    startMargin = keyline1,
                    endMargin = 16.dp,
                    bias = 0f
                )
                top.linkTo(episodeTitle.bottom, 6.dp)
                height = Dimension.preferredWrapContent
                width = Dimension.preferredWrapContent
            }
        )

        Icon(
            imageVector = Icons.Rounded.DirectionsRun,
            contentDescription = stringResource(R.string.app_name),
            tint = androidx.compose.material3.MaterialTheme.colorScheme.onSurface,
            modifier = Modifier
                .size(48.dp)
                .padding(6.dp)
                .semantics { role = Role.Image }
                .constrainAs(moveIcon) {
                    start.linkTo(parent.start, keyline1)
                    top.linkTo(podcastTitle.bottom, margin = 10.dp)
                }
        )

        Text(
            text = player.move.toString(),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = androidx.compose.material3.MaterialTheme.typography.bodyMedium,
            modifier = Modifier.constrainAs(moveText) {
                centerVerticallyTo(moveIcon)
                start.linkTo(moveIcon.end, 12.dp)
                width = Dimension.preferredWrapContent
            }
        )

        val runBarrier = createBottomBarrier(moveText, moveIcon)

        Icon(
            imageVector = Icons.Rounded.SportsFootball,
            contentDescription = stringResource(R.string.app_name),
            tint = androidx.compose.material3.MaterialTheme.colorScheme.onSurface,
            modifier = Modifier
                .size(48.dp)
                .padding(6.dp)
                .semantics { role = Role.Image }
                .constrainAs(throwBallIcon) {
                    start.linkTo(parent.start, keyline1)
                    top.linkTo(runBarrier, margin = 0.dp)
                }
        )

        Text(
            text = player.throwBall.toString() + " +",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = androidx.compose.material3.MaterialTheme.typography.bodyMedium,
            modifier = Modifier.constrainAs(throwBallText) {
                centerVerticallyTo(throwBallIcon)
                start.linkTo(moveIcon.end, 12.dp)
                width = Dimension.preferredWrapContent
            }
        )

        val armourBarrier = createBottomBarrier(throwBallText, throwBallIcon)

        Icon(
            imageVector = Icons.Rounded.Shield,
            contentDescription = stringResource(R.string.app_name),
            tint = androidx.compose.material3.MaterialTheme.colorScheme.onSurface,
            modifier = Modifier
                .size(48.dp)
                .padding(6.dp)
                .semantics { role = Role.Image }
                .constrainAs(armourIcon) {
                    start.linkTo(parent.start, keyline1)
                    top.linkTo(armourBarrier, margin = 0.dp)
                    bottom.linkTo(parent.bottom, 10.dp)
                }
        )

        Text(
            text = player.armour.toString() + " +",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = androidx.compose.material3.MaterialTheme.typography.bodyMedium,
            modifier = Modifier.constrainAs(armourText) {
                centerVerticallyTo(armourIcon)
                start.linkTo(moveIcon.end, 12.dp)
                width = Dimension.preferredWrapContent
            }
        )

        Text(
            text = "${key+1}/$itemCount",
            style = androidx.compose.material3.MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .constrainAs(counter) {
                    end.linkTo(parent.end, 16.dp)
                    bottom.linkTo(parent.bottom, 16.dp)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InfinityTheme {
    }
}