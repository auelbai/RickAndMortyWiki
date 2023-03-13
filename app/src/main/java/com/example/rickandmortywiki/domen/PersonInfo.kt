package com.example.rickandmortywiki.domen

data class PersonInfo(
    val id: Int,
    val name: String,
    val gender: String,
    val status: String,
    val bornLocation: String,
    val nowLocation: String,
    val imageUrl: String
) {
}