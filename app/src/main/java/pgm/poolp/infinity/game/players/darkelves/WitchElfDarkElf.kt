package pgm.poolp.infinity.game.players.darkelves

import pgm.poolp.infinity.game.interfaces.DarkElf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class WitchElfDarkElf : DarkElf {
    override val name: String
        get() = Utils.job(JobsEnum.WITCH_ELF)
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.FRENZIED)
}