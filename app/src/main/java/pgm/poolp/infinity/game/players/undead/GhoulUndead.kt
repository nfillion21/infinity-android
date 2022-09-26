package pgm.poolp.infinity.game.players.undead

import pgm.poolp.infinity.game.interfaces.Undead
import pgm.poolp.infinity.game.interfaces.WoodElf
import pgm.poolp.infinity.game.utils.Utils
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class GhoulUndead : Undead {
    override val name: String
        get() = Utils.job(JobsEnum.GHOUL)
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = Utils.capacity(CapacitiesEnum.FLESH_HUNGRY_HORROR)
}
