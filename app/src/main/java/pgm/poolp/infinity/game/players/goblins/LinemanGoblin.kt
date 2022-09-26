package pgm.poolp.infinity.game.players.goblins

import pgm.poolp.infinity.game.interfaces.Goblin
import pgm.poolp.infinity.game.interfaces.WoodElf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class LinemanGoblin : Goblin {
    override val name: String
        get() = Utils.job(JobsEnum.LINEMAN)
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.SMALL_AND_SHIFTY)
}
