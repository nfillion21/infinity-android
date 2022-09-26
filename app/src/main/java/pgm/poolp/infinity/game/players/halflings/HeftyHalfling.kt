package pgm.poolp.infinity.game.players.halflings

import pgm.poolp.infinity.game.interfaces.Halfling
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum
import pgm.poolp.infinity.game.utils.Utils

class HeftyHalfling : Halfling {
    override val name: String
        get() = Utils.job(JobsEnum.HEFTY)
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.VERY_WELL_FED)
}
