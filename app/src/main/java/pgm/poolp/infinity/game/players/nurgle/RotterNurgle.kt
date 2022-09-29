package pgm.poolp.infinity.game.players.nurgle

import pgm.poolp.infinity.game.params.Nurgle
import pgm.poolp.infinity.game.utils.Jobs

class RotterNurgle : Nurgle {
    override val name: String
        get() = Jobs.ROTTER.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = null
}