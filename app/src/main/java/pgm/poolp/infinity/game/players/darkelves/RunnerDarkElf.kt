package pgm.poolp.infinity.game.players.darkelves

import pgm.poolp.infinity.game.params.DarkElf
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class RunnerDarkElf : DarkElf {
    override val name: String
        get() = JobsEnum.RUNNER.description
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 3
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = CapacitiesEnum.SAFE_HANDS.description
}
