package pgm.poolp.infinity.game.players.darkelves

import pgm.poolp.infinity.game.interfaces.DarkElf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.CapacitiesEnum

class WitchElfDarkElf : DarkElf {
    override val name: String
        get() = "Witch elf"
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = Capacities.capacity(CapacitiesEnum.FRENZIED)
}
