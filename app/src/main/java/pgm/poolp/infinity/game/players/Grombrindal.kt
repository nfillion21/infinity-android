package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Dwarf

class Grombrindal : Dwarf {
    override val name: String
        get() = "Grombrindal"
    override val movement: Int
        get() = 4
}
