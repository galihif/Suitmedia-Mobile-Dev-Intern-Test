package com.giftech.suitmediamobiledevinterntest.ui.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.giftech.suitmediamobiledevinterntest.R
import com.giftech.suitmediamobiledevinterntest.databinding.ActivityFirstBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstActivity : AppCompatActivity() {

    private val viewModel:FirstViewModel by viewModels()
    private lateinit var binding:ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTest.text = viewModel.test()
    }
}