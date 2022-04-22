package br.edu.ifsp.scl.ads.pdm.apirequest3.network

import retrofit2.http.GET

interface UserAPI {
    //@GET("posts/1")
    @GET("lol/summoner/v4/summoners/by-name/AsumaSarutobi?api_key=RGAPI-2cbf52cd-f4da-4a04-9215-fd161f40de3f")

    suspend fun getPost(): User
    //RGAPI-db9ba3e4-68b8-4e1a-9e3e-fa29cae4154d
    @GET("posts")
    suspend fun getPosts(): List<User>
}