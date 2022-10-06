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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
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
    val lazyMovieItems = movies.collectAsLazyPagingItems()

    //CircularProgressIndicator(LocalContext.current)
    LazyColumn(
        contentPadding = WindowInsets.systemBars.asPaddingValues()) {

        items(lazyMovieItems) { movie ->
            MovieItem(movie = movie!!)
        }

        item {
            LinearProgressIndicator()
        }
        //CircularProgressIndicator()
    }

    //LinearProgressIndicator()

    /*
    LinearProgressIndicator(
        modifier = Modifier
            .fillMaxWidth()
            .height(15.dp),
        backgroundColor = Color.LightGray,
        color = Color.Red //progress color
    )
    */

    /*
    LinearProgressIndicator(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp)), // Rounded edges
        progress = progressAnimation
    )
    */
}

/*
@Composable
fun FeaturesLinearProgressIndicator() {
    LinearProgressIndicator(
        progress = 0.2f,
        modifier = Modifier.padding(8.dp),
        color = Color.Green,
        backgroundColor = Color.Red
    )
}
*/


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