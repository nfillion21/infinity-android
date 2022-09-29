package pgm.poolp.infinity.game.players.woodelves

import pgm.poolp.infinity.game.params.WoodElf
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class CatcherWoodElf : WoodElf {
    override val name: String
        get() = JobsEnum.CATCHER.description
    override val move: Int
        get() = 8
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = CapacitiesEnum.CATCHERS_INSTINCT.description
}
