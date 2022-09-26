package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Dwarf

class TrollSlayerDwarf : Dwarf {
    override val name: String
        get() = "Troll slayer"
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 5
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = "Frenzied. After this player makes a Mark action, they can immediately make a free Block action."
}
