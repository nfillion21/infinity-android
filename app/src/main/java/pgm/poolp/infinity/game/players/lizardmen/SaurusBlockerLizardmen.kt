package pgm.poolp.infinity.game.players.lizardmen

import pgm.poolp.infinity.game.interfaces.Lizardmen
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum
import pgm.poolp.infinity.game.utils.Utils

class SaurusBlockerLizardmen : Lizardmen {
    override val name: String
        get() = Utils.job(JobsEnum.SAURUS_BLOCKER)
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 6
    override val armour: Int
        get() = 2
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.HULKING_BRUTE)
}