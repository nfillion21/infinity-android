package pgm.poolp.infinity.game.players.undead

import pgm.poolp.infinity.game.params.Undead
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class MummyUndead : Undead {
    override val name: String
        get() = JobsEnum.MUMMY.description
    override val move: Int
        get() = 3
    override val throwBall: Int
        get() = 6
    override val armour: Int
        get() = 2
    override val capacity: String?
        get() = CapacitiesEnum.UNDEAD_JUGGERNAUT.description
}
