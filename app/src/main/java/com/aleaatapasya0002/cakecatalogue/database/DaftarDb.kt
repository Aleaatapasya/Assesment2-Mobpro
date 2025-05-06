package com.aleaatapasya0002.cakecatalogue.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.aleaatapasya0002.cakecatalogue.model.Daftar

@Database(entities = [Daftar::class], version = 2, exportSchema = false)
abstract class DaftarDb : RoomDatabase(){

    abstract val dao: DaftarDao

    companion object{
        @Volatile
        private var INSTANCE: DaftarDb? = null
        fun getInstance(context: Context): DaftarDb{
            kotlin.synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        DaftarDb::class.java,
                        "daftar.db"
                    ).fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}