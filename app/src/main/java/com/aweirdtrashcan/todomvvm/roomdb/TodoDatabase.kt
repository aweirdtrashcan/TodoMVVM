package com.aweirdtrashcan.todomvvm.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.aweirdtrashcan.todomvvm.models.Todo

@Database(entities = [Todo::class], version = 1)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun getTodoDao() : TodoDao

    companion object {

        fun databaseInstance(context: Context): TodoDatabase {
            val database by lazy {
                Room.databaseBuilder(
                    context.applicationContext,
                    TodoDatabase::class.java,
                    "todo_table").build()
            }
            return database
        }

    }
}