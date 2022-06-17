package com.aweirdtrashcan.todomvvm.views.addtodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.aweirdtrashcan.todomvvm.R
import com.aweirdtrashcan.todomvvm.TodoApplication
import com.aweirdtrashcan.todomvvm.databinding.ActivityAddTodoBinding
import com.aweirdtrashcan.todomvvm.repository.MainRepository
import com.aweirdtrashcan.todomvvm.viewmodels.addtodoviewmodel.AddTodoViewModel
import com.aweirdtrashcan.todomvvm.viewmodels.addtodoviewmodel.AddTodoViewModelFactory

class AddTodoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddTodoBinding

    private lateinit var viewModel: AddTodoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddTodoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(
            this,
            AddTodoViewModelFactory(MainRepository(TodoApplication().todoDao)))[AddTodoViewModel::class.java]
    }
}