package pgm.poolp.infinity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
            MovieItem(movie = movie!!)
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