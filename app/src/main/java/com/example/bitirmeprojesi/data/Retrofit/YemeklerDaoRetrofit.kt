package com.example.bitirmeprojesi.data.remote

import com.example.bitirmeprojesi.data.entity.CRUDCevap
import com.example.bitirmeprojesi.data.entity.SepetYemeklerCevap
import com.example.bitirmeprojesi.data.entity.YemeklerCevap
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface YemeklerDaoRetrofit {

    @GET("tumYemekleriGetir.php")
    suspend fun tumYemekleriYukle(): YemeklerCevap

}