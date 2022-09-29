package pgm.poolp.infinity.game.players.woodelves

import pgm.poolp.infinity.game.params.WoodElf
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class WardancerWoodElf : WoodElf {
    override val name: String
        get() = JobsEnum.WARDANCER.description
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = CapacitiesEnum.HANDLING_SKILLS.description
}