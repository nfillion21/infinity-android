package pgm.poolp.infinity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
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
import pgm.poolp.infinity.game.builders.GameFactory
import pgm.poolp.infinity.game.interfaces.Player
import pgm.poolp.infinity.ui.theme.InfinityTheme
import pgm.poolp.infinity.viewmodels.PlayerViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InfinityTheme {
                // A surface container using the 'background' color from the theme
                /*
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
                */

                val pf = GameFactory()
                val random1 = pf.randomPlayer()
                val random2 = pf.randomPlayer()
                val random3 = pf.randomPlayer()
                val random4 = pf.randomPlayer()
                val random5 = pf.randomPlayer()
                val random6 = pf.randomPlayer()
                val random7 = pf.randomPlayer()
                val random8 = pf.randomPlayer()
                val random9 = pf.randomPlayer()
                val random10 = pf.randomPlayer()

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
    val lazyMovieItems = movies.collectAsLazyPagingItems()

    LazyColumn {

        items(lazyMovieItems) { movie ->
            MovieItem(movie = movie!!)
        }
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
            movie.name!!,
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

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InfinityTheme {
        Greeting("Android")
    }
}