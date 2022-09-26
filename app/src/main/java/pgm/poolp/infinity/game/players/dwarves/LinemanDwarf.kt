package pgm.poolp.infinity.game.players.dwarves

import pgm.poolp.infinity.game.interfaces.Dwarf
import pgm.poolp.infinity.game.utils.JobsEnum
import pgm.poolp.infinity.game.utils.Utils

class LinemanDwarf : Dwarf {
    override val name: String
        get() = Utils.job(JobsEnum.LINEMAN)
    override val move: Int
        get() = 4
    override val throwBall: Int
        get() = 5
    override val armour: Int
        get() = 2
    override val capacity: String?
        get() = null
}
