package pgm.poolp.infinity.game.players.lizardmen

import pgm.poolp.infinity.game.params.Lizardmen
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class ChameleonSkinkLizardmen : Lizardmen {
    override val name: String
        get() = JobsEnum.CHAMELEON_SKINK.description
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = CapacitiesEnum.CANNY_TRACKER.description
}