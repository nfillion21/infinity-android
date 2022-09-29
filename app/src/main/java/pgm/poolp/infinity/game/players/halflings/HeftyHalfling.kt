package pgm.poolp.infinity.game.players.halflings

import pgm.poolp.infinity.game.params.Halfling
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class HeftyHalfling : Halfling {
    override val name: String
        get() = JobsEnum.HEFTY.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = CapacitiesEnum.VERY_WELL_FED.description
}
