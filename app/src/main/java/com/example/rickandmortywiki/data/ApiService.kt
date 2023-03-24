package com.example.rickandmortywiki.data

import com.example.rickandmortywiki.presentation.CharacterListFragment
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/character")
    fun getCharacters(@Query(QUERY_PAGE) page: Int): Response<CharacterListFragment>


    companion object {
        private const val QUERY_PAGE = "page"
    }
}