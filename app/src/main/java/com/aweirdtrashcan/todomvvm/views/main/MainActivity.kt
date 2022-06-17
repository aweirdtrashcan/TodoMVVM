package com.aweirdtrashcan.todomvvm.views.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.aweirdtrashcan.todomvvm.R
import com.aweirdtrashcan.todomvvm.TodoApplication
import com.aweirdtrashcan.todomvvm.repository.MainRepository
import com.aweirdtrashcan.todomvvm.roomdb.TodoDao
import com.aweirdtrashcan.todomvvm.viewmodels.mainviewmodel.MainViewModel
import com.aweirdtrashcan.todomvvm.viewmodels.mainviewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(
            this,
            MainViewModelFactory(MainRepository(TodoApplication().todoDao)))[MainViewModel::class.java]

    }
}