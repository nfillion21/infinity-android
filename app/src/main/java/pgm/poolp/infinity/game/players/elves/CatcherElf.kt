package pgm.poolp.infinity.game.players.elves

import pgm.poolp.infinity.game.params.Elf
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class CatcherElf : Elf {
    override val name: String
        get() = JobsEnum.CATCHER.description
    override val move : Int
        get() = 7
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = CapacitiesEnum.CATCHERS_INSTINCT.description
}