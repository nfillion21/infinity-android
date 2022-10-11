package pgm.poolp.infinity.game.players.skaven

import pgm.poolp.infinity.game.params.Skaven
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class GutterRunnerSkaven : Skaven {
    override val name: String
        get() = Jobs.GUTTER_RUNNER.description
    override val move: Int
        get() = 9
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 6
    override val capacity: String?
        get() = Capacities.SNEAKY_STABBER.description
    override val cardUrl: String
        get() = "gutterrunnerskaven.png"
}