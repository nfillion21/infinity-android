package pgm.poolp.infinity.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import pgm.poolp.infinity.game.builders.GameFactory
import pgm.poolp.infinity.game.interfaces.Player
import pgm.poolp.infinity.repository.PlayerSource
import javax.inject.Inject

@HiltViewModel
class PlayerViewModel @Inject internal constructor(
) : ViewModel()
{
    val players: Flow<PagingData<Player>> = Pager(
        config = PagingConfig(pageSize = 1, initialLoadSize = 1),
        pagingSourceFactory = { PlayerSource(GameFactory()) })
        .flow.cachedIn(viewModelScope)

    private val _isLoading = MutableStateFlow<Boolean>(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    fun setLoading(value:Boolean) {
        _isLoading.value = value
    }
}