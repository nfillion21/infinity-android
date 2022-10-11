package pgm.poolp.infinity.game.players.undead

import pgm.poolp.infinity.game.params.Undead
import pgm.poolp.infinity.game.utils.Jobs

class SkeletonUndead : Undead {
    override val name: String
        get() = Jobs.SKELETON.description
    override val move: Int
        get() = 5
    override val throwBall: Int
        get() = 5
    override val armour: Int
        get() = 4
    override val capacity: String?
        get() = null
    override val cardUrl: String
        get() = "skeletonundead.png"
}
