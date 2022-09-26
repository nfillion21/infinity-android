package pgm.poolp.infinity.game.players.undead

import pgm.poolp.infinity.game.interfaces.Undead
import pgm.poolp.infinity.game.interfaces.WoodElf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class MummyUndead : Undead {
    override val name: String
        get() = Utils.job(JobsEnum.MUMMY)
    override val move: Int
        get() = 3
    override val throwBall: Int
        get() = 6
    override val armour: Int
        get() = 2
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.UNDEAD_JUGGERNAUT)
}
