package pgm.poolp.infinity.game.utils

class Utils {
    companion object {
        fun capacity(capability: CapacitiesEnum): String {
            return when (capability) {
                CapacitiesEnum.CATCHERS_INSTINCT -> "Catcher's instincts. If this player catches a thrown ball (not a hand-off or bouncing ball), roll a six-sided dice. This player can make a free Run action up to that many squares."
                CapacitiesEnum.HEADBUTT -> "Headbutt. If this player makes a Mark action and they have already made a Run action this turn, they can immediately make a free Block action."
                CapacitiesEnum.INDOMITABLE -> "Indomitable. This player cannot be Knocked Down. If this player would be, and this player is carrying the ball, the ball bounces. Then, make an Armour check for this player - if it is passed, there is no further effect. If it is failed, this player is injured."
                CapacitiesEnum.OFFENSIVE_SPECIALIST -> "Offensive specialist. Whenever this player makes a Block action, their coach can choose to re-roll the dice."
                CapacitiesEnum.SAFE_HANDS -> "Safe hands. If this player is Knocked Down while holding the ball, you can choose which adjacent square the ball bounces into instead of rolling the eight-sided dice."
                CapacitiesEnum.FRENZIED -> "Frenzied. After this player makes a Mark action, they can immediately make a free Block action."
                CapacitiesEnum.HANDLING_SKILLS -> "Handling skills. Whenever this player moves into a square containing the ball, they pick it up as though they were making a Run action."
                CapacitiesEnum.WARDANCE -> "Wardance. When this player makes a Run action, they can move adjacent to opponents, but doing so ends the action."
                CapacitiesEnum.SMALL_AND_SHIFTY -> "Small and shifty. When this player makes a Run action they can move adjacents to opponents, but must end the action Openm not Marked."
                CapacitiesEnum.VERY_WELL_FED -> "Very well fed. In your turn, if this player is on the pitch, this player can make one free Block or Mark action."
                CapacitiesEnum.QUANTITY_OVER_QUALITY -> "Quantity over quality. In your turn, if this player is on the pitchm this player can make one free Block or Mark action."
                CapacitiesEnum.SLIPPERY_LITTLE_RUNT -> "Slippery little runt. When this player is the target of a Block action, and the result of that Block is a Miss, Shove or Tackle, their coach can choose to ignore the result and this player can make a free Sidestep action."
                CapacitiesEnum.CANNY_TRACKER -> "Canny tracker. The first time in a turn that an opponent adjacent to this player makes a Sidestep action, this player can be moved into the square that opponent moved from."
                CapacitiesEnum.HULKING_BRUTE -> "Hulking brute. All Block actions made by this player count as having an assist."
                CapacitiesEnum.FLIGHTY -> "Flighty. This player can move up to two squares instead of one when they make the Sidestep action. They must finish this move Open, not Marked."
                CapacitiesEnum.FLESH_HUNGRY_HORROR -> "Flesh-hungry horror. When this player makes a Mark action, they can move up to 3 squares instead of 2."
                CapacitiesEnum.UNDEAD_JUGGERNAUT -> "If this player makes a Mark action, treat the Shove result as the Knocked Down result for the next block this player makes this turn."
            }
        }

        fun job(job: JobsEnum): String {
            return when (job) {
                JobsEnum.BEASTMAN_RUNNER -> "Beastman runner"
                JobsEnum.BLOCKER -> "Blocker"
                JobsEnum.BLITZER -> "Blitzer"
                JobsEnum.LINEMAN -> "Lineman"
                JobsEnum.RUNNER -> "Runner"
                JobsEnum.WITCH_ELF -> "Witch elf"
                JobsEnum.TROLL_SLAYER -> "Troll slayer"
                JobsEnum.CATCHER -> "Catcher"
                JobsEnum.THROWER -> "Thrower"
                JobsEnum.WARDANCER -> "Wardancer"
                JobsEnum.HEFTY -> "Hefty"
                JobsEnum.HOPEFUL -> "Hopeful"
                JobsEnum.CHAMELEON_SKINK -> "Chameleon skink"
                JobsEnum.SAURUS_BLOCKER -> "Saurus blocker"
                JobsEnum.SKINK_RUNNER -> "Skink runner"
                JobsEnum.GHOUL -> "Ghoul"
                JobsEnum.MUMMY -> "Mummy"
                JobsEnum.SKELETON -> "Skeleton"
                JobsEnum.WIGHT_BLITZER -> "Wight blitzer"
                JobsEnum.ZOMBIE -> "Zombie"
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
    WARDANCE,
    SMALL_AND_SHIFTY,
    VERY_WELL_FED,
    QUANTITY_OVER_QUALITY,
    SLIPPERY_LITTLE_RUNT,
    CANNY_TRACKER,
    HULKING_BRUTE,
    FLIGHTY,
    FLESH_HUNGRY_HORROR,
    UNDEAD_JUGGERNAUT,
}

enum class JobsEnum {
    BEASTMAN_RUNNER,
    BLOCKER,
    BLITZER,
    LINEMAN,
    RUNNER,
    WITCH_ELF,
    TROLL_SLAYER,
    CATCHER,
    THROWER,
    WARDANCER,
    HEFTY,
    HOPEFUL,
    CHAMELEON_SKINK,
    SAURUS_BLOCKER,
    SKINK_RUNNER,
    GHOUL,
    MUMMY,
    SKELETON,
    WIGHT_BLITZER,
    ZOMBIE
}