package pgm.poolp.infinity.game.params

import android.graphics.drawable.Drawable
import pgm.poolp.infinity.R
import pgm.poolp.infinity.game.interfaces.Player

enum class ChaosPlayers {
    BEASTMAN_RUNNER,
    BLOCKER
}
interface Chaos : Player {
    override val icon: Int
        get() = R.drawable.chaos

    override val race: String
        get() = "Chaos"
}
