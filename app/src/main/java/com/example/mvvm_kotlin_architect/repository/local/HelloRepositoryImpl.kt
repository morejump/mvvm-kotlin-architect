package com.example.mvvm_kotlin_architect.repository.local

class HelloRepositoryImpl : HelloRepository {
    override fun giveHello(): String {
        return "thao handsome"
    }
}