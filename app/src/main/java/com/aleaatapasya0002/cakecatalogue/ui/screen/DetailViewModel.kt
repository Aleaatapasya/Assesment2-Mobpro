package com.aleaatapasya0002.cakecatalogue.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aleaatapasya0002.cakecatalogue.database.DaftarDao
import com.aleaatapasya0002.cakecatalogue.model.Daftar
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val dao: DaftarDao) : ViewModel() {
    fun insert(namaKue: String, deskripsi:String){
        val daftar = Daftar(
            namaKue = namaKue,
            deskripsi = deskripsi
        )
        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(daftar)
        }
    }

    fun update(id: Long, namaKue: String, deskripsi: String){
        val daftar = Daftar(
            id = id,
            namaKue = namaKue,
            deskripsi = deskripsi
        )
        viewModelScope.launch(Dispatchers.IO){
            dao.update(daftar)
        }
    }

    fun delete(id: Long){
        viewModelScope.launch(Dispatchers.IO){
            dao.deleteById(id)
        }
    }

    suspend fun getDaftar(id: Long):Daftar? {
        return dao.getDaftarById(id)
    }

}