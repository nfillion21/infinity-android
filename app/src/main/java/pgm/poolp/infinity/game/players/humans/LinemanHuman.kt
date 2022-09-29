package pgm.poolp.infinity.game.players.humans

import pgm.poolp.infinity.game.params.Human
import pgm.poolp.infinity.game.utils.Jobs

class LinemanHuman : Human {
    override val name: String
        get() = Jobs.LINEMAN.description
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = null
}