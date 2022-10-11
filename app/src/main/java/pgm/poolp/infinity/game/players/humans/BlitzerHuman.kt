package pgm.poolp.infinity.game.players.humans

import pgm.poolp.infinity.game.params.Human
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class BlitzerHuman : Human {
    override val name: String
        get() = Jobs.BLITZER.description
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = Capacities.OFFENSIVE_SPECIALIST.description
    override val cardUrl: String
        get() = "blitzerhuman.png"
}