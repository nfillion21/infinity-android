package pgm.poolp.infinity.game.players.dwarves

import pgm.poolp.infinity.game.params.Dwarf
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class RunnerDwarf : Dwarf {
    override val name: String
        get() = Jobs.RUNNER.description
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = Capacities.SAFE_HANDS.description
}
