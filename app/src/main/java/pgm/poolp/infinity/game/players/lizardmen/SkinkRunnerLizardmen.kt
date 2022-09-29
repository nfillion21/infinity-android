package pgm.poolp.infinity.game.players.lizardmen

import pgm.poolp.infinity.game.params.Lizardmen
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class SkinkRunnerLizardmen : Lizardmen {
    override val name: String
        get() = JobsEnum.SKINK_RUNNER.description
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = CapacitiesEnum.FLIGHTY.description
}