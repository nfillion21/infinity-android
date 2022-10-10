package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class UndeadPlayers {
    GHOUL,
    MUMMY,
    SKELETON,
    WIGHT_BLITZER,
    ZOMBIE
}
interface Undead : Player {
    override val icon: Int
        get() = R.drawable.undead

    override val race: String
        get() = "Undead"
}
