package com.example.calklove.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.calklove.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val firstName = intent.getStringExtra("firstName")
        val secondName = intent.getStringExtra("secondName")
        val percentage = intent.getStringExtra("percentage")
        val result = intent.getStringExtra("result")

        binding.resultTv.text = "$firstName \n $secondName\n $percentage% \n $result"
    }
}
