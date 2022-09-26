package pgm.poolp.infinity.game.players.chaos

import pgm.poolp.infinity.game.interfaces.Chaos
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class BlockerChaos : Chaos {
    override val name: String
        get() = Utils.job(JobsEnum.BLOCKER)
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.INDOMITABLE)
}