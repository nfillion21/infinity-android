package pgm.poolp.infinity.game.builders

import pgm.poolp.infinity.game.enums.ElfPlayers
import pgm.poolp.infinity.game.interfaces.Elf
import pgm.poolp.infinity.game.interfaces.TeamFactory
import pgm.poolp.infinity.game.players.Eldril

class ElvesFactory : TeamFactory<ElfPlayers, Elf> {
    override fun build(type: ElfPlayers): Elf {
        return when (type) {
            ElfPlayers.ELDRIL -> Eldril()
        }
    }
}