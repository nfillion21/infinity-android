package pgm.poolp.infinity.game.players.halflings

import pgm.poolp.infinity.game.params.Halfling
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class RunnerHalfling : Halfling {
    override val name: String
        get() = JobsEnum.RUNNER.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = CapacitiesEnum.SLIPPERY_LITTLE_RUNT.description
}