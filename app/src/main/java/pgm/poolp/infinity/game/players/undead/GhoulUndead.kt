package pgm.poolp.infinity.game.players.undead

import pgm.poolp.infinity.game.params.Undead
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class GhoulUndead : Undead {
    override val name: String
        get() = JobsEnum.GHOUL.description
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = CapacitiesEnum.FLESH_HUNGRY_HORROR.description
}
