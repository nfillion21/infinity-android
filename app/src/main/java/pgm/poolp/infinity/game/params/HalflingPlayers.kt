package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class HalflingPlayers {
    HEFTY,
    HOPEFUL,
    RUNNER
}
interface Halfling : Player {
    override val icon: Int
        get() = R.drawable.halflings

    override val race: String
        get() = "Halfling"
}
