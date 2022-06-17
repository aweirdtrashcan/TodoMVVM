package com.aweirdtrashcan.todomvvm.viewmodels.mainviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aweirdtrashcan.todomvvm.repository.MainRepository

class MainViewModelFactory(private val repository: MainRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            MainViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("Unknown ViewModel")
        }
    }
}