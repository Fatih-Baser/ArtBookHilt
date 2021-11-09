package com.fatihbaserpl.artbookhilt.roomdp

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ArtDao {

    //corutein ile birlikte kuullandığımız asekreon bir şekilde çalıştırdığımız .Gerektiğinde durdurulup devam edilebilen fonksiyonlardır

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertArt(art : Art)

        @Delete
        suspend fun deleteArt(art: Art)

        @Query("SELECT * FROM arts")
        fun observeArts(): LiveData<List<Art>>

    }