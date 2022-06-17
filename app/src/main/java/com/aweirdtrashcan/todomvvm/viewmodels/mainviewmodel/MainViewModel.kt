package com.aweirdtrashcan.todomvvm.viewmodels.mainviewmodel

import androidx.lifecycle.*
import com.aweirdtrashcan.todomvvm.models.Todo
import com.aweirdtrashcan.todomvvm.repository.MainRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainViewModel(private val repository: MainRepository) : ViewModel() {

    val allTodos : LiveData<List<Todo>> = repository.getAllTodos().asLiveData()

    fun insertTodo(todo: Todo) = viewModelScope.launch {
            repository.insertTodo(todo)
    }

    fun deleteSingleTodo(todo: Todo) = viewModelScope.launch {
            repository.deleteSingleTodo(todo)
    }
}