package pgm.poolp.infinity.game.players

import pgm.poolp.infinity.game.interfaces.Dwarf

class RunnerDwarf : Dwarf {
    override val name: String
        get() = "Runner"
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = "Safe hands. If this player is Knocked Down while holding the ball, you can choose which adjacent square the ball bounces into instead of rolling the eight-sided dice."
}
