package com.cmex.lessongit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cmex.lessongit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvText.setTextColor(getColor(R.color.white))
        binding.tvText.textSize=22.0f
        binding.clMain.setBackgroundResource(androidx.constraintlayout.widget.R.color.material_deep_teal_500)
        binding.tvText.text=getString(R.string.text)

    }
}