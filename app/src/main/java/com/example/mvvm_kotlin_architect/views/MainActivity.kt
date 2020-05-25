package com.example.mvvm_kotlin_architect.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.mvvm_kotlin_architect.R
import com.example.mvvm_kotlin_architect.viewmodels.HomeViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<HomeViewModel>() {

    override fun getViewModel(): HomeViewModel {
        val mViewModel: HomeViewModel by viewModel()
        return mViewModel
    }

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun observeData() {
        mViewModel.data = "this data has been changed in MainActivity"
    }

    override fun initViews() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, MainFragment())
        fragmentTransaction.commit()
    }
}
