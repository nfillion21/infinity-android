package pgm.poolp.infinity.game.players.undead

import pgm.poolp.infinity.game.params.Undead
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class WightBlitzerUndead : Undead {
    override val name: String
        get() = JobsEnum.WIGHT_BLITZER.description
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = CapacitiesEnum.OFFENSIVE_SPECIALIST.description
}
