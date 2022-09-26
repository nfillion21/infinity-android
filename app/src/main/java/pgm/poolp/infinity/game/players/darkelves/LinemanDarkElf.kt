package pgm.poolp.infinity.game.players.darkelves

import pgm.poolp.infinity.game.interfaces.DarkElf

class LinemanDarkElf : DarkElf {
    override val name: String
        get() = "Lineman"
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = null
}
