package pgm.poolp.infinity.game.players.lizardmen

import pgm.poolp.infinity.game.params.Lizardmen
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class SaurusBlockerLizardmen : Lizardmen {
    override val name: String
        get() = JobsEnum.SAURUS_BLOCKER.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 6
    override val armour: Int
        get() = 2
    override val capacity: String?
        get() = CapacitiesEnum.HULKING_BRUTE.description
}