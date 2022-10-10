package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class ElfPlayers {
    BLITZER,
    CATCHER,
    LINEMAN,
    THROWER
}
interface Elf : Player {
    override val icon: Int
        get() = R.drawable.elves

    override val race: String
        get() = "Elf"
}
