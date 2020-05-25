package com.example.mvvm_kotlin_architect.di

import com.example.mvvm_kotlin_architect.repository.local.HelloRepository
import com.example.mvvm_kotlin_architect.repository.local.HelloRepositoryImpl
import com.example.mvvm_kotlin_architect.viewmodels.HomeViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.compat.ScopeCompat.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val module = module {
    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }
    // presenter
    viewModel {
        HomeViewModel(androidApplication(), get())
    }

}