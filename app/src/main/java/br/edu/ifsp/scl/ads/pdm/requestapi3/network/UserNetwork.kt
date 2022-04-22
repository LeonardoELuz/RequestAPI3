package br.edu.ifsp.scl.ads.pdm.apirequest3.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UserNetwork {

    val retrofit by lazy {
        Retrofit.Builder()
            //.baseUrl("https://jsonplaceholder.typicode.com")
            .baseUrl("https://br1.api.riotgames.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserAPI::class.java)
    }
}