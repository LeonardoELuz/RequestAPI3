package br.edu.ifsp.scl.ads.pdm.apirequest3.network

/*data class User (
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)*/

data class User(
    val id: String,
    val accountId: String,
    val puuid: String,
    val name: String,
    val profileIconId: Int,
    val revisionDate: Double,
    val summonerLevel: Int
)
