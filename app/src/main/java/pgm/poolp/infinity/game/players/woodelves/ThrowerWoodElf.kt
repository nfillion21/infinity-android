package pgm.poolp.infinity.game.players.woodelves

import pgm.poolp.infinity.game.params.WoodElf
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class ThrowerWoodElf : WoodElf {
    override val name: String
        get() = JobsEnum.THROWER.description
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 2
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = CapacitiesEnum.HANDLING_SKILLS.description
}