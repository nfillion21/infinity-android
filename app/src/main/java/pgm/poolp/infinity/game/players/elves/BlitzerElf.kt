package pgm.poolp.infinity.game.players.elves

import pgm.poolp.infinity.game.interfaces.Elf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class BlitzerElf : Elf {
    override val name: String
        get() = Utils.job(JobsEnum.BLITZER)
    override val move : Int
        get() = 6
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.OFFENSIVE_SPECIALIST)
}