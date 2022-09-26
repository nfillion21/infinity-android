package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Elf

class ThrowerElf : Elf {
    override val name: String
        get() = "Thrower"
    override val move : Int
        get() = 6
    override val throwBall: Int
        get() = 2
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = "Handling skills. Whenever this player moves into a square containing the ball, they pick it up as though they were making a Run action."
}