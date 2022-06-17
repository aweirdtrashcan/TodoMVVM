package com.aweirdtrashcan.todomvvm.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.aweirdtrashcan.todomvvm.models.Todo
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Query("SELECT * FROM todo_table")
    fun getAllTodos() : Flow<List<Todo>>

    @Delete
    suspend fun deleteSingleTodo(todo: Todo)

    @Query("DELETE FROM todo_table")
    suspend fun deleteAllTodos()

    @Insert
    suspend fun addTodo(todo: Todo)

}