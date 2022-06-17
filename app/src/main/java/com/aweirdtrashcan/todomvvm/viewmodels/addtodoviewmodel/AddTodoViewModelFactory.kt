package com.aweirdtrashcan.todomvvm.viewmodels.addtodoviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aweirdtrashcan.todomvvm.repository.MainRepository

class AddTodoViewModelFactory(private val repository: MainRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(AddTodoViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            AddTodoViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("Unknown ViewModel")
        }
    }
}