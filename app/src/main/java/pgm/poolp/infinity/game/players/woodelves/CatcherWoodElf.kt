package pgm.poolp.infinity.game.players.woodelves

import pgm.poolp.infinity.game.interfaces.WoodElf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class CatcherWoodElf : WoodElf {
    override val name: String
        get() = "Catcher"
    override val move: Int
        get() = 8
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.CATCHERS_INSTINCT)
}
