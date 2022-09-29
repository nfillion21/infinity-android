package pgm.poolp.infinity.game.players.goblins

import pgm.poolp.infinity.game.params.Goblin
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class LinemanGoblin : Goblin {
    override val name: String
        get() = Jobs.LINEMAN.description
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = Capacities.SMALL_AND_SHIFTY.description
}
