package pgm.poolp.infinity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pgm.poolp.infinity.game.builders.GameFactory
import pgm.poolp.infinity.ui.theme.InfinityTheme

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
                val random4 = pf.randomPlayer()
                val random3 = pf.randomPlayer()
                val random5 = pf.randomPlayer()

                Scaffold {
                    /*
                    HomeScreen(
                        modifier = Modifier.padding(innerPaddingModifier),
                        viewModel = foodViewModel)
                    */

                    /*
                    LazyColumn {
                        items(usersData) { user ->
                            user?.let {
                                UserCard(user = it)
                            }
                        }
                        when (usersData.loadState.append) {
                            is LoadState.NotLoading -> Unit
                            LoadState.Loading -> {
                                item { LoadingItem() }
                            }
                            is LoadState.Error -> {
                                item {
                                    ErrorItem(message = (usersData.loadState.append as LoadState.Error).error.message.toString())
                                }
                            }
                        }
                    }
                    */
                }
            }
        }
    }
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