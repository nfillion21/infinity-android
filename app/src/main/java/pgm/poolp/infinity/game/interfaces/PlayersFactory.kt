package pgm.poolp.infinity.game.interfaces

interface PlayersFactory<in T, out P> where T : Enum<*>, P:Player {
    fun build(type: T) : P
    fun random() : P
}