package pgm.poolp.infinity.game.builders

import pgm.poolp.infinity.game.interfaces.Player
import pgm.poolp.infinity.game.interfaces.TeamFactory

class PlayersFactory {
    val teamFactories = mutableListOf<TeamFactory<*, Player>>()

    fun buildDwarvesFactory(): DwarvesFactory {
        val df = DwarvesFactory()
        teamFactories.add(df)
        return df
    }

    fun buildElvesFactory(): ElvesFactory {
        val ef = ElvesFactory()
        teamFactories.add(ef)
        return ef
    }
}