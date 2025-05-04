package com.aleaatapasya0002.cakecatalogue.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aleaatapasya0002.cakecatalogue.database.DaftarDao
import com.aleaatapasya0002.cakecatalogue.model.Daftar
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel(dao: DaftarDao) : ViewModel(){
    val data: StateFlow<List<Daftar>> = dao.getDaftar().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )
    fun getDaftar(id: Long):Daftar? {
        return data.value.find { it.id == id }
    }
}