package pgm.poolp.infinity.game.players.lizardmen

import pgm.poolp.infinity.game.interfaces.Lizardmen
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum
import pgm.poolp.infinity.game.utils.Utils

class ChameleonSkinkLizardmen : Lizardmen {
    override val name: String
        get() = Utils.job(JobsEnum.CHAMELEON_SKINK)
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.CANNY_TRACKER)
}