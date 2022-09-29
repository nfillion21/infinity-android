package pgm.poolp.infinity.game.players.halflings

import pgm.poolp.infinity.game.params.Halfling
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class HeftyHalfling : Halfling {
    override val name: String
        get() = Jobs.HEFTY.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = Capacities.VERY_WELL_FED.description
}
