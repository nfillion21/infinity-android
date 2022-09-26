package pgm.poolp.infinity.game.builders

import pgm.poolp.infinity.game.enums.DwarfPlayers
import pgm.poolp.infinity.game.enums.ElfPlayers
import pgm.poolp.infinity.game.interfaces.Dwarf
import pgm.poolp.infinity.game.interfaces.Elf
import pgm.poolp.infinity.game.interfaces.Player
import pgm.poolp.infinity.game.interfaces.PlayersFactory
import pgm.poolp.infinity.game.players.*

class GameFactory {

    private val playersFactories: List<PlayersFactory<*, Player>> =
        listOf(

            // DWARVES PLAYERS
            object : PlayersFactory<DwarfPlayers, Dwarf> {
                override fun build(type: DwarfPlayers): Dwarf {
                    return when (type) {
                        DwarfPlayers.BLITZER -> BlitzerDwarf()
                        DwarfPlayers.LINEMAN -> LinemanDwarf()
                        DwarfPlayers.RUNNER -> RunnerDwarf()
                        DwarfPlayers.TROLL_SLAYER -> TrollSlayerDwarf()
                    }
                }

                override fun randomPlayer(): Dwarf {
                    return build(DwarfPlayers.values().random())
                }
            },

            // ELVES PLAYERS
            object : PlayersFactory<ElfPlayers, Elf> {
                override fun build(type: ElfPlayers): Elf {
                    return when (type) {
                        ElfPlayers.BLITZER -> BlitzerElf()
                        ElfPlayers.CATCHER -> CatcherElf()
                        ElfPlayers.LINEMAN -> LinemanElf()
                        ElfPlayers.THROWER -> ThrowerElf()
                    }
                }

                override fun randomPlayer(): Elf {
                    return build(ElfPlayers.values().random())
                }
            }
        )

    fun randomPlayer() : Player {
        return playersFactories.random().randomPlayer()
    }
}