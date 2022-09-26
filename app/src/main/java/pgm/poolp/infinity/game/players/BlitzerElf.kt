package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Elf

class BlitzerElf : Elf {
    override val name: String
        get() = "Blitzer"
    override val move : Int
        get() = 6
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = "Offensive specialist. Whenever this player makes a Block action, their coach can choose to re-roll the Block dice."
}