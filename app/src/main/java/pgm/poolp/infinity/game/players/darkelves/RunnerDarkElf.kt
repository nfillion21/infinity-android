package pgm.poolp.infinity.game.players.darkelves

import pgm.poolp.infinity.game.interfaces.DarkElf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class RunnerDarkElf : DarkElf {
    override val name: String
        get() = "Runner"
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.SAFE_HANDS)
}
