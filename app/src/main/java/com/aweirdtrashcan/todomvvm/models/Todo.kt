package com.aweirdtrashcan.todomvvm.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_table")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id : Int? = null,
    val title : String,
    val content : String,
    val isChecked : Boolean
)
