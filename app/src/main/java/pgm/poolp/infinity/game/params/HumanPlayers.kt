package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class HumanPlayers {
    BLITZER,
    CATCHER,
    LINEMAN,
    THROWER
}
interface Human : Player {
    override val icon: Int
        get() = R.drawable.humans

    override val race: String
        get() = "Human"
}
