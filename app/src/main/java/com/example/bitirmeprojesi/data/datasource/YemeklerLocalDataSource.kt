package com.example.bitirmeprojesi.data.datasource

import com.example.bitirmeprojesi.data.entity.Yemekler
import com.example.bitirmeprojesi.data.remote.YemeklerDao
import com.example.bitirmeprojesi.room.RoomDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YemeklerDataSource(var yemeklerDao: RoomDao) {

    suspend fun ara(aramaKelimesi: String) : List<Yemekler> = withContext(Dispatchers.IO){
        return@withContext yemeklerDao.ara(aramaKelimesi=aramaKelimesi)
    }




}