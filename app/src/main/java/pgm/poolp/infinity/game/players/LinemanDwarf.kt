package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Dwarf

class LinemanDwarf : Dwarf {
    override val name: String
        get() = "Lineman"
    override val move: Int
        get() = 4
    override val throwBall: Int
        get() = 5
    override val armour: Int
        get() = 2
    override val capacity: String?
        get() = null
}
