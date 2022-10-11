package pgm.poolp.infinity.repository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import kotlinx.coroutines.delay
import pgm.poolp.infinity.game.builders.GameFactory
import pgm.poolp.infinity.game.interfaces.Player
import kotlin.math.max

private const val STARTING_KEY = 0
private const val LOAD_DELAY_MILLIS = 2_000L

class PlayerSource(private val gameFactory: GameFactory) : PagingSource<Int, Player>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Player> {
        // If params.key is null, it is the first load, so we start loading with STARTING_KEY
        val startKey = params.key ?: STARTING_KEY

        // We fetch as many articles as hinted to by params.loadSize
        val range = startKey.until(startKey + params.loadSize)

        // Simulate a delay for loads adter the initial load
        if (startKey != STARTING_KEY) delay(LOAD_DELAY_MILLIS)

        return LoadResult.Page(
            data = range.map {
                gameFactory.randomPlayer()
            },
            prevKey = when (startKey) {
                STARTING_KEY -> null
                else -> when (val prevKey = ensureValidKey(key = range.first - params.loadSize)) {
                    // We're at the start, there's nothing more to load
                    STARTING_KEY -> null
                    else -> prevKey
                }
            },
            nextKey = range.last + 1
        )
    }
    
    override fun getRefreshKey(state: PagingState<Int, Player>): Int? {
        // In our case we grab the item closest to the anchor position
        // then return its id - (state.config.pageSize / 2) as a buffer
        /*
        val anchorPosition = state.anchorPosition ?: return null
        val article = state.closestItemToPosition(anchorPosition) ?: return null
        return ensureValidKey(key = article.id - (state.config.pageSize / 2))
        */
        TODO("Not yet implemented")
    }

    private fun ensureValidKey(key: Int) = max(STARTING_KEY, key)
}