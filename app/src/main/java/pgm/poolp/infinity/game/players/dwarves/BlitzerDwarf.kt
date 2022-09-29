package pgm.poolp.infinity.game.players.dwarves

import pgm.poolp.infinity.game.params.Dwarf
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class BlitzerDwarf : Dwarf {
    override val name: String
        get() = JobsEnum.BLITZER.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 5
    override val armour: Int
        get() = 2
    override val capacity: String?
        get() = CapacitiesEnum.OFFENSIVE_SPECIALIST.description
}
