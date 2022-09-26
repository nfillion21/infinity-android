package pgm.poolp.infinity.game.players.elves

import pgm.poolp.infinity.game.interfaces.Elf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class BlitzerElf : Elf {
    override val name: String
        get() = "Blitzer"
    override val move : Int
        get() = 6
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.OFFENSIVE_SPECIALIST)
}