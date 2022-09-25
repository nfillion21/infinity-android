package pgm.poolp.infinity.game.builders

import pgm.poolp.infinity.game.enums.DwarfPlayers
import pgm.poolp.infinity.game.interfaces.Dwarf
import pgm.poolp.infinity.game.interfaces.PlayersFactory
import pgm.poolp.infinity.game.players.Grombrindal

class DwarvesFactory : PlayersFactory<DwarfPlayers, Dwarf> {
    override fun build(type: DwarfPlayers): Dwarf {
        return when (type) {
            DwarfPlayers.GROMBRINDAL -> Grombrindal()
        }
    }

    override fun random(): Dwarf {
        return build(DwarfPlayers.values().random())
    }
}