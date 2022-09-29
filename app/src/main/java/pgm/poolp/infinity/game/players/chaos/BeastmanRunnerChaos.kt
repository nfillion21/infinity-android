package pgm.poolp.infinity.game.players.chaos

import pgm.poolp.infinity.game.params.Chaos
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class BeastmanRunnerChaos : Chaos {
    override val name: String
        get() = JobsEnum.BEASTMAN_RUNNER.description
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = CapacitiesEnum.HEADBUTT.description
}
