package pgm.poolp.infinity.game.players.elves

import pgm.poolp.infinity.game.interfaces.Elf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class CatcherElf : Elf {
    override val name: String
        get() = "Catcher"
    override val move : Int
        get() = 7
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.CATCHERS_INSTINCT)
}