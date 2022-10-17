package com.giftech.suitmediamobiledevinterntest.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.giftech.suitmediamobiledevinterntest.R
import com.giftech.suitmediamobiledevinterntest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Second Screen"

        if(intent.extras!=null){
            val name = intent.extras!!.getString(NAME)
            binding.tvName.text = name
        }
    }

    companion object{
        const val NAME = "NAME"
    }
}