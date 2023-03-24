package com.example.rickandmortywiki.domen

import androidx.lifecycle.LiveData

interface CharacterInfoRepository {

    fun getAllPersonUseCase(): LiveData<List<CharacterInfo>>

    fun getPersonUseCase(id: Int): LiveData<CharacterInfo>

    fun loadDataUseCase()
}