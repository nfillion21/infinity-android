package pgm.poolp.infinity.game.players.undead

import pgm.poolp.infinity.game.params.Undead
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum
import pgm.poolp.infinity.game.utils.Utils

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
