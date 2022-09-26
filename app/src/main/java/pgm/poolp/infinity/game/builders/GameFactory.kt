package pgm.poolp.infinity.game.builders

import pgm.poolp.infinity.game.enums.*
import pgm.poolp.infinity.game.interfaces.*
import pgm.poolp.infinity.game.players.chaos.BeastmanRunnerChaos
import pgm.poolp.infinity.game.players.chaos.BlockerChaos
import pgm.poolp.infinity.game.players.darkelves.BlitzerDarkElf
import pgm.poolp.infinity.game.players.darkelves.LinemanDarkElf
import pgm.poolp.infinity.game.players.darkelves.RunnerDarkElf
import pgm.poolp.infinity.game.players.darkelves.WitchElfDarkElf
import pgm.poolp.infinity.game.players.dwarves.BlitzerDwarf
import pgm.poolp.infinity.game.players.dwarves.LinemanDwarf
import pgm.poolp.infinity.game.players.dwarves.RunnerDwarf
import pgm.poolp.infinity.game.players.dwarves.TrollSlayerDwarf
import pgm.poolp.infinity.game.players.elves.BlitzerElf
import pgm.poolp.infinity.game.players.elves.CatcherElf
import pgm.poolp.infinity.game.players.elves.LinemanElf
import pgm.poolp.infinity.game.players.elves.ThrowerElf
import pgm.poolp.infinity.game.players.woodelves.CatcherWoodElf
import pgm.poolp.infinity.game.players.woodelves.LinemanWoodElf
import pgm.poolp.infinity.game.players.woodelves.ThrowerWoodElf
import pgm.poolp.infinity.game.players.woodelves.WardancerWoodElf

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
            },

            // CHAOS PLAYERS
            object : PlayersFactory<ChaosPlayers, Chaos> {
                override fun build(type: ChaosPlayers): Chaos {
                    return when (type) {
                        ChaosPlayers.BEASTMAN_RUNNER -> BeastmanRunnerChaos()
                        ChaosPlayers.BLOCKER -> BlockerChaos()
                    }
                }

                override fun randomPlayer(): Chaos {
                    return build(ChaosPlayers.values().random())
                }
            },

            // DARK ELVES PLAYERS
            object : PlayersFactory<DarkElfPlayers, DarkElf> {
                override fun build(type: DarkElfPlayers): DarkElf {
                    return when (type) {
                        DarkElfPlayers.BLITZER -> BlitzerDarkElf()
                        DarkElfPlayers.LINEMAN -> LinemanDarkElf()
                        DarkElfPlayers.RUNNER -> RunnerDarkElf()
                        DarkElfPlayers.WITCH_ELF -> WitchElfDarkElf()
                    }
                }

                override fun randomPlayer(): DarkElf {
                    return build(DarkElfPlayers.values().random())
                }
            },

            // WOOD ELVES PLAYERS
            object : PlayersFactory<WoodElfPlayers, WoodElf> {
                override fun build(type: WoodElfPlayers): WoodElf {
                    return when (type) {
                        WoodElfPlayers.CATCHER -> CatcherWoodElf()
                        WoodElfPlayers.LINEMAN -> LinemanWoodElf()
                        WoodElfPlayers.THROWER -> ThrowerWoodElf()
                        WoodElfPlayers.WARDANCER -> WardancerWoodElf()
                    }
                }

                override fun randomPlayer(): WoodElf {
                    return build(WoodElfPlayers.values().random())
                }
            },

        )

    fun randomPlayer() : Player {
        return playersFactories.random().randomPlayer()
    }
}