package com.example.mvvm_kotlin_architect.viewmodels

import android.app.Application
import com.example.mvvm_kotlin_architect.repository.local.HelloRepository

class HomeViewModel(context: Application, val helloRepository: HelloRepository) :
    BaseViewModel(context) {

    fun giveHelloString() = helloRepository.giveHello()
}