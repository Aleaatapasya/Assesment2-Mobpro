package com.aleaatapasya0002.cakecatalogue.util

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aleaatapasya0002.cakecatalogue.database.DaftarDb
import com.aleaatapasya0002.cakecatalogue.ui.screen.MainViewModel

class ViewModelFactory(
    private val context: Context
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T :ViewModel> create(modelClass: Class<T>): T{
        val dao = DaftarDb.getInstance(context).dao
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknwon ViewModel class")
    }
}