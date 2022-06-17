package com.aweirdtrashcan.todomvvm.repository

import com.aweirdtrashcan.todomvvm.models.Todo
import com.aweirdtrashcan.todomvvm.roomdb.TodoDao
import kotlinx.coroutines.flow.Flow

class MainRepository(private val todoDao: TodoDao) {

    fun getAllTodos() : Flow<List<Todo>> = todoDao.getAllTodos()

    suspend fun deleteSingleTodo(todo : Todo) = todoDao.deleteSingleTodo(todo)

    suspend fun deleteAllTodos() = todoDao.deleteAllTodos()

    suspend fun insertTodo(todo: Todo) = todoDao.addTodo(todo)
}