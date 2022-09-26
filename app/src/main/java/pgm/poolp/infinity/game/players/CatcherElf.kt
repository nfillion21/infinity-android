package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Elf

class CatcherElf : Elf {
    override val name: String
        get() = "Catcher"
    override val move : Int
        get() = 7
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = "Catcher's instincts. If this player catches a thrown ball (not a hand-off or bouncing ball), roll a six-sided dice. This player can make a free Run action up to that many squares."
}