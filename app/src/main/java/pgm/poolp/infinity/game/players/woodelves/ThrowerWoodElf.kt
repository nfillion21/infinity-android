package pgm.poolp.infinity.game.players.woodelves

import pgm.poolp.infinity.game.interfaces.WoodElf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class ThrowerWoodElf : WoodElf {
    override val name: String
        get() = "Lineman"
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 2
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.HANDLING_SKILLS)
}