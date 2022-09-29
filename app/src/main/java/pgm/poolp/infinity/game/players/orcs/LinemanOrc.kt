package pgm.poolp.infinity.game.players.orcs

import pgm.poolp.infinity.game.params.Orc
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class LinemanOrc : Orc {
    override val name: String
        get() = Jobs.LINEMAN.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = null
}