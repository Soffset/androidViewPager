package com.example.esverificafinale

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.esverificafinale.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.loginButton.setOnClickListener {
            val i = intent
            i.setClass(this, HomeActivity::class.java)
            startActivity(i)
            overridePendingTransition(0, 0)
            finish()
        }
    }
}