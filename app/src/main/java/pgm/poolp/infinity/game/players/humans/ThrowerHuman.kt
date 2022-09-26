package pgm.poolp.infinity.game.players.humans

import pgm.poolp.infinity.game.interfaces.Human
import pgm.poolp.infinity.game.interfaces.Lizardmen
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum
import pgm.poolp.infinity.game.utils.Utils

class ThrowerHuman : Human {
    override val name: String
        get() = Utils.job(JobsEnum.THROWER)
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.HANDLING_SKILLS)
}