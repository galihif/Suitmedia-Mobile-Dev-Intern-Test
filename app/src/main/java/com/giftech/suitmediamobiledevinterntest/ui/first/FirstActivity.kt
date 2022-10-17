package com.giftech.suitmediamobiledevinterntest.ui.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.giftech.suitmediamobiledevinterntest.R
import com.giftech.suitmediamobiledevinterntest.databinding.ActivityFirstBinding
import com.giftech.suitmediamobiledevinterntest.ui.second.SecondActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstActivity : AppCompatActivity() {

    private val viewModel:FirstViewModel by viewModels()
    private lateinit var binding:ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        setButtonClick()
    }

    private fun setButtonClick() {
        with(binding){
            btnCheck.setOnClickListener {
                val sentence = etPalindrome.text.toString()
                showDialog(sentence,viewModel.checkPalindrome(sentence))
            }
            btnNext.setOnClickListener {
                if(etName.text.isNotEmpty()){
                    val intent = Intent(this@FirstActivity, SecondActivity::class.java)
                    intent.putExtra(SecondActivity.NAME, etName.text.toString())
                    startActivity(intent)
                    finish()
                }else{
                    etName.error = "Fill your name"
                }
            }
        }
    }

    private fun showDialog(sentence:String, isPalindrome:Boolean) {
        val message = "$sentence is ${if (!isPalindrome) "not" else ""} palindrome "
        MaterialAlertDialogBuilder(this)
            .setTitle("Is Palindrome?")
            .setCancelable(false)
            .setMessage(message)
            .setPositiveButton("Close") { dialog, which ->
                dialog.dismiss()
            }
            .show()
    }
}