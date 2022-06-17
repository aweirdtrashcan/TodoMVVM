package com.aweirdtrashcan.todomvvm

import android.app.Application
import com.aweirdtrashcan.todomvvm.roomdb.TodoDatabase

class TodoApplication : Application() {
    val database by lazy { TodoDatabase.databaseInstance(this) }
    val todoDao by lazy { database.getTodoDao() }
}