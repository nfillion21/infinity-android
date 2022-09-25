package pgm.poolp.infinity.game.builders

import pgm.poolp.infinity.game.enums.ElfPlayers
import pgm.poolp.infinity.game.interfaces.Elf
import pgm.poolp.infinity.game.interfaces.PlayersFactory
import pgm.poolp.infinity.game.players.Eldril

class ElvesFactory : PlayersFactory<ElfPlayers, Elf> {
    override fun build(type: ElfPlayers): Elf {
        return when (type) {
            ElfPlayers.ELDRIL -> Eldril()
        }
    }

    override fun random(): Elf {
        return build(ElfPlayers.values().random())
    }
}