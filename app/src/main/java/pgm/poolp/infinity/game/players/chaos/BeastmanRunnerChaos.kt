package pgm.poolp.infinity.game.players.chaos

import pgm.poolp.infinity.game.params.Chaos
import pgm.poolp.infinity.game.utils.Capacities
import pgm.poolp.infinity.game.utils.Jobs

class BeastmanRunnerChaos : Chaos {
    override val name: String
        get() = Jobs.BEASTMAN_RUNNER.description
    override val move: Int
        get() = 6
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 3
    override val capacity: String?
        get() = Capacities.HEADBUTT.description
    override val cardUrl: String
        get() = "https://www.ug-data.xyz/infinity/beastmanrunnerchaos.png"
}
