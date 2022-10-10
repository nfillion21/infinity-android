package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class SkavenPlayers {
    BLITZER,
    GUTTER_RUNNER,
    LINEMAN,
    THROWER
}
interface Skaven : Player {
    override val icon: Int
        get() = R.drawable.skaven

    override val race: String
        get() = "Skaven"
}
