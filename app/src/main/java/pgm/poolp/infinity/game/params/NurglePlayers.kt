package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class NurglePlayers {
    BLOATER,
    PESTIGOR,
    ROTTER
}
interface Nurgle : Player {
    override val icon: Int
        get() = R.drawable.nurgle

    override val race: String
        get() = "Nurgle"
}
