package com.aweirdtrashcan.todomvvm.viewmodels.addtodoviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aweirdtrashcan.todomvvm.models.Todo
import com.aweirdtrashcan.todomvvm.repository.MainRepository
import kotlinx.coroutines.launch

class AddTodoViewModel(private val repository: MainRepository) : ViewModel() {
    fun insertTodo(todo: Todo) = viewModelScope.launch { repository.insertTodo(todo) }
}