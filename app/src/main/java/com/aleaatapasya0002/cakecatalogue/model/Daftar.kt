package com.aleaatapasya0002.cakecatalogue.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daftar")
data class Daftar(
    @PrimaryKey(autoGenerate = true)
    val id: Long= 0L,
    val namaKue: String,
    val deskripsi: String
)
