package com.afk.allforkids_aos.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BirthViewModel: ViewModel() {
    private val data = MutableLiveData<String>()

    fun setData(date: String) {
        data.value = date
    }
    fun getData():LiveData<String> {
        return data
    }
}