package pgm.poolp.infinity.game.players.woodelves

import pgm.poolp.infinity.game.interfaces.WoodElf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class CatcherWoodElf : WoodElf {
    override val name: String
        get() = Utils.job(JobsEnum.CATCHER)
    override val move: Int
        get() = 8
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.CATCHERS_INSTINCT)
}
