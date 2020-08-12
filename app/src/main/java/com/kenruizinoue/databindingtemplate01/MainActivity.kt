package com.kenruizinoue.databindingtemplate01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kenruizinoue.databindingtemplate01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.increaseButton.setOnClickListener { binding.count++ }
        binding.decreaseButton.setOnClickListener { binding.count-- }
    }
}