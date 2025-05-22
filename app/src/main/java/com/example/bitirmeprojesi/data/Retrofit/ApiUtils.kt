package com.example.bitirmeprojesi.data.remote

class ApiUtils {
companion object{
    val BASE_URL = "http://kasimadalan.pe.hu/yemekler/"

    fun getYemeklerDao() : YemeklerDaoRetrofit {

        return RetrofitClient.getClient(BASE_URL).create(YemeklerDaoRetrofit::class.java)

    }

    fun getSepetApiService(): SepetApiService {
        return RetrofitClient.getClient(BASE_URL).create(SepetApiService::class.java)
    }


}
}