package com.example.rickandmortywiki.domen

import androidx.lifecycle.LiveData

interface PersonInfoRepository {

    fun getAllPersonUseCase(): LiveData<List<PersonInfo>>

    fun getPersonUseCase(id: String): LiveData<PersonInfo>

    fun loadDataUseCase()
}