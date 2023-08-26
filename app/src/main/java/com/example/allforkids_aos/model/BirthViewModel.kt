package com.example.allforkids_aos.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BirthViewModel: ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String>
        get() = _data

    fun setData(value: String) {
        _data.value = value
    }
}