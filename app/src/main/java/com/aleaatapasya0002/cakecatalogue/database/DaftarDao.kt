package com.aleaatapasya0002.cakecatalogue.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.aleaatapasya0002.cakecatalogue.model.Daftar
import kotlinx.coroutines.flow.Flow

@Dao
interface DaftarDao {
    @Insert
    suspend fun insert(daftar: Daftar)

    @Update
    suspend fun update(daftar: Daftar)

    @Query("SELECT * FROM daftar ORDER BY id DESC")
    fun getDaftar(): Flow<List<Daftar>>

    @Query("SELECT * FROM daftar WHERE id = :id")
    suspend fun getDaftarById(id: Long):Daftar?
}