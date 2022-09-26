package pgm.poolp.infinity.game.players.undead

import pgm.poolp.infinity.game.interfaces.Undead
import pgm.poolp.infinity.game.interfaces.WoodElf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class WightBlitzerUndead : Undead {
    override val name: String
        get() = Utils.job(JobsEnum.WIGHT_BLITZER)
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.OFFENSIVE_SPECIALIST)
}
