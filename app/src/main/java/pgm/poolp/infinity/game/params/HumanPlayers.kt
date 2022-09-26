package pgm.poolp.infinity.game.params

import pgm.poolp.infinity.game.interfaces.Player

enum class HumanPlayers {
    BLITZER,
    CATCHER,
    LINEMAN,
    THROWER
}
interface Human : Player
