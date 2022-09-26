package pgm.poolp.infinity.game.players.dwarves

import pgm.poolp.infinity.game.interfaces.Dwarf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class RunnerDwarf : Dwarf {
    override val name: String
        get() = "Runner"
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.SAFE_HANDS)
}
