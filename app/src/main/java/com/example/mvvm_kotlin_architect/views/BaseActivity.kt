package com.example.mvvm_kotlin_architect.views

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvm_kotlin_architect.viewmodels.BaseViewModel

abstract class BaseActivity<T : BaseViewModel> : AppCompatActivity() {
    protected lateinit var mViewModel: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        mViewModel = getViewModel()
        initViews()
        observeData()

    }

    abstract fun getLayoutId(): Int

    abstract fun getViewModel(): T

    abstract fun observeData()

    abstract fun initViews()
}