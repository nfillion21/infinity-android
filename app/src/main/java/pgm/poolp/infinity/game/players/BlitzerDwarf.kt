package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Dwarf

class BlitzerDwarf : Dwarf {
    override val name: String
        get() = "Blitzer"
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 5
    override val armour: Int
        get() = 2
    override val capacity: String?
        get() = "Offensive Specialist. Whenever this player makes a Block action, their coach can choose to re-roll the Block dice."
}
