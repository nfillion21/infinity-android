package pgm.poolp.infinity.game.players.humans

import pgm.poolp.infinity.game.params.Human
import pgm.poolp.infinity.game.utils.CapacitiesEnum
import pgm.poolp.infinity.game.utils.JobsEnum

class CatcherHuman : Human {
    override val name: String
        get() = JobsEnum.CATCHER.description
    override val move: Int
        get() = 7
    override val throwBall: Int
        get() = 4
    override val armour: Int
        get() = 5
    override val capacity: String?
        get() = CapacitiesEnum.CATCHERS_INSTINCT.description
}