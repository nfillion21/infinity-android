package pgm.poolp.infinity.game.players.chaos

import pgm.poolp.infinity.game.params.Chaos
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum
import pgm.poolp.infinity.game.utils.Utils

class BeastmanRunnerChaos : Chaos {
    override val name: String
        get() = Utils.job(JobsEnum.BEASTMAN_RUNNER)
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.HEADBUTT)
}
