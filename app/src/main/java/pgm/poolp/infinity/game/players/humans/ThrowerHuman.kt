package pgm.poolp.infinity.game.players.humans

import pgm.poolp.infinity.game.params.Human
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class ThrowerHuman : Human {
    override val name: String
        get() = Jobs.THROWER.description
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = Capacities.HANDLING_SKILLS.description
    override val cardUrl: String
        get() = "throwerhuman.png"
}