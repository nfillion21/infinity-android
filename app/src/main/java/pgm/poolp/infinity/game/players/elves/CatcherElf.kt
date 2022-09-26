package pgm.poolp.infinity.game.players.elves

import pgm.poolp.infinity.game.interfaces.Elf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class CatcherElf : Elf {
    override val name: String
        get() = Utils.job(JobsEnum.CATCHER)
    override val move : Int
        get() = 7
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.CATCHERS_INSTINCT)
}