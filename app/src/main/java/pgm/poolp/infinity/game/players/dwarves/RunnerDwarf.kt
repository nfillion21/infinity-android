package pgm.poolp.infinity.game.players.dwarves

import pgm.poolp.infinity.game.interfaces.Dwarf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class RunnerDwarf : Dwarf {
    override val name: String
        get() = Utils.job(JobsEnum.RUNNER)
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.SAFE_HANDS)
}