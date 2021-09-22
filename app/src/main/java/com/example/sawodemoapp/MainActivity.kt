package com.example.sawodemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sawodemoapp.databinding.ActivityMainBinding
import com.sawolabs.androidsdk.Sawo




class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.loginbutton.setOnClickListener {
            Sawo(
                this,
                "ee072e35-15a7-49bf-8c17-d3cde70e7b91",  // your api key
                "614b36f107e4a10d6da143028yzGzH05r3XzVPtobf28biSF" // your api key secret
            ).login(
                "email",  // can be one of 'email' or 'phone_number_sms'
                HomeActivity::class.java.name // Callback class name
            )
        }


    }
}