package pgm.poolp.infinity.game.utils

class Capacities {
    companion object {
        fun capacity(capability: CapacitiesEnum) : String {
            return when (capability) {
                CapacitiesEnum.CATCHERS_INSTINCT -> "Catcher's instincts. If this player catches a thrown ball (not a hand-off or bouncing ball), roll a six-sided dice. This player can make a free Run action up to that many squares."
                CapacitiesEnum.HEADBUTT -> "Headbutt. If this player makes a Mark action and they have already made a Run action this turn, they can immediately make a free Block action."
                CapacitiesEnum.INDOMITABLE -> "Indomitable. This player cannot be Knocked Down. If this player would be, and this player is carrying the ball, the ball bounces. Then, make an Armour check for this player - if it is passed, there is no further effect. If it is failed, this player is injured."
                CapacitiesEnum.OFFENSIVE_SPECIALIST -> "Offensive specialist. Whenever this player makes a Block action, their coach can choose to re-roll the dice."
                CapacitiesEnum.SAFE_HANDS -> "Safe hands. If this player is Knocked Down while holding the ball, you can choose which adjacent square the ball bounces into instead of rolling the eight-sided dice."
                CapacitiesEnum.FRENZIED -> "Frenzied. After this player makes a Mark action, they can immediately make a free Block action."
                CapacitiesEnum.HANDLING_SKILLS -> "Handling skills. Whenever this player moves into a square containing the ball, they pick it up as though they were making a Run action."
                CapacitiesEnum.WARDANCE -> "Wardance. When this player makes a Run action, they can move adjacent to opponents, but doing so ends the action."
            }
        }
    }
}

enum class CapacitiesEnum {
    CATCHERS_INSTINCT,
    HEADBUTT,
    INDOMITABLE,
    OFFENSIVE_SPECIALIST,
    SAFE_HANDS,
    FRENZIED,
    HANDLING_SKILLS,
    WARDANCE
}
