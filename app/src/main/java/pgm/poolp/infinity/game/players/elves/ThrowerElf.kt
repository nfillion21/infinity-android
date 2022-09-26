package pgm.poolp.infinity.game.players.elves

import pgm.poolp.infinity.game.params.Elf
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum
import pgm.poolp.infinity.game.utils.Utils

class ThrowerElf : Elf {
    override val name: String
        get() = Utils.job(JobsEnum.THROWER)
    override val move : Int
        get() = 6
    override val throwBall: Int
        get() = 2
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.HANDLING_SKILLS)
}