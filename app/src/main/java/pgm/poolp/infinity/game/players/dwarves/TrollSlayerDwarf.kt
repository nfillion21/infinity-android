package pgm.poolp.infinity.game.players.dwarves

import pgm.poolp.infinity.game.interfaces.Dwarf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class TrollSlayerDwarf : Dwarf {
    override val name: String
        get() = "Troll slayer"
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 5
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.FRENZIED)
}
