package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class OrcPlayers {
    BLACK_ORC_BLOCKER,
    BLITZER,
    LINEMAN,
    THROWER
}
interface Orc : Player {
    override val icon: Int
        get() = R.drawable.orcs

    override val race: String
        get() = "Orc"
}
