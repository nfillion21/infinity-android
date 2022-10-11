package pgm.poolp.infinity.game.players.orcs

import pgm.poolp.infinity.game.params.Orc
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class ThrowerOrc : Orc {
    override val name: String
        get() = Jobs.THROWER.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = Capacities.HANDLING_SKILLS.description
    override val cardUrl: String
        get() = "throwerorc.png"
}