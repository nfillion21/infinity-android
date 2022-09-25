package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Elf

class Eldril : Elf {
    override val name: String
        get() = "Eldril"
    override val movement : Int
        get() = 5
}