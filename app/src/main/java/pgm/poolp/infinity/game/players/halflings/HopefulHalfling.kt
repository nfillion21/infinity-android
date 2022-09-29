package pgm.poolp.infinity.game.players.halflings

import pgm.poolp.infinity.game.params.Halfling
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class HopefulHalfling : Halfling {
    override val name: String
        get() = JobsEnum.HOPEFUL.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = CapacitiesEnum.QUANTITY_OVER_QUALITY.description
}