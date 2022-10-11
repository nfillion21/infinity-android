package pgm.poolp.infinity.game.players.nurgle

import pgm.poolp.infinity.game.params.Nurgle
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class PestigorNurgle : Nurgle {
    override val name: String
        get() = Jobs.PESTIGOR.description
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = Capacities.HEADBUTT.description
    override val cardUrl: String
        get() = "pestigornurgle.png"
}