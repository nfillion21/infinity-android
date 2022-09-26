package pgm.poolp.infinity.game.players.dwarves

import pgm.poolp.infinity.game.interfaces.Dwarf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class BlitzerDwarf : Dwarf {
    override val name: String
        get() = "Blitzer"
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 5
    override val armour: Int
        get() = 2
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.OFFENSIVE_SPECIALIST)
}
