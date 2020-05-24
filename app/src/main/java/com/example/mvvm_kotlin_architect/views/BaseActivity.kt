package com.example.mvvm_kotlin_architect.views

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvm_kotlin_architect.viewmodels.BaseViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}