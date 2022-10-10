package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class DwarfPlayers {
    BLITZER,
    LINEMAN,
    RUNNER,
    TROLL_SLAYER
}
interface Dwarf : Player {
    override val icon: Int
        get() = R.drawable.dwarves

    override val race: String
        get() = "Dwarf"
}
