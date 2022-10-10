package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class WoodElfPlayers {
    CATCHER,
    LINEMAN,
    THROWER,
    WARDANCER
}
interface WoodElf : Player {
    override val icon: Int
        get() = R.drawable.woodelves

    override val race: String
        get() = "Wood Elf"
}
