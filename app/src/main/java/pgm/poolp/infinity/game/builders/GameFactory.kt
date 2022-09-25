package pgm.poolp.infinity.game.builders

import pgm.poolp.infinity.game.interfaces.Player
import pgm.poolp.infinity.game.interfaces.PlayersFactory

class GameFactory {

    private val playersFactories: List<PlayersFactory<*, Player>> =
        listOf(
            DwarvesFactory(),
            ElvesFactory()
        )

    fun randomPlayer() : Player {
        return playersFactories.random().random()
    }
}