package pgm.poolp.infinity.game.players.undead

import pgm.poolp.infinity.game.interfaces.Undead
import pgm.poolp.infinity.game.interfaces.WoodElf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class SkeletonUndead : Undead {
    override val name: String
        get() = Utils.job(JobsEnum.SKELETON)
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 5
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = null
}
