package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class GoblinPlayers {
    LINEMAN
}
interface Goblin : Player {
    override val icon: Int
        get() = R.drawable.goblins

    override val race: String
        get() = "Goblin"
}
