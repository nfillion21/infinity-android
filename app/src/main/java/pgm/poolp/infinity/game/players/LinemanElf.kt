package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Elf

class LinemanElf : Elf {
    override val name: String
        get() = "Lineman"
    override val move : Int
        get() = 6
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = null
}