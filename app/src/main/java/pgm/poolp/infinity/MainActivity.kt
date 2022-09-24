package pgm.poolp.infinity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pgm.poolp.infinity.game.builders.PlayersFactory
import pgm.poolp.infinity.game.enums.ElfPlayers
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

                val pf = PlayersFactory()
                val elvesFactory = pf.buildElvesFactory()
                val elf = elvesFactory.build(ElfPlayers.ELDRIL)

                Scaffold {
                    /*
                    HomeScreen(
                        modifier = Modifier.padding(innerPaddingModifier),
                        viewModel = foodViewModel)
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