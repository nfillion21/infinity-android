package pgm.poolp.infinity.game.players.elves

import pgm.poolp.infinity.game.interfaces.Elf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class ThrowerElf : Elf {
    override val name: String
        get() = "Thrower"
    override val move : Int
        get() = 6
    override val throwBall: Int
        get() = 2
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.HANDLING_SKILLS)
}