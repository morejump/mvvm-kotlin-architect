package com.example.mvvm_kotlin_architect.viewmodels

import android.app.Application
import android.util.Log
import com.example.mvvm_kotlin_architect.repository.local.HelloRepository

class HomeViewModel(context: Application, val helloRepository: HelloRepository) :
    BaseViewModel(context) {

    var data = "not change"

    fun giveHelloString() = helloRepository.giveHello()

    override fun onCleared() {
        super.onCleared()
        Log.d("hellothere", "onCleared")
    }
}