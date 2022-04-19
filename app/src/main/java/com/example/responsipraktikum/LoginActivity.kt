package com.example.responsipraktikum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var button_login : Button
    private lateinit var recovery_button : TextView
    private lateinit var register_button : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button_login = findViewById(R.id.login)
        recovery_button = findViewById(R.id.here2)
        register_button = findViewById(R.id.here1)

        button_login.setOnClickListener{
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        recovery_button.setOnClickListener {
                val intent = Intent (this,RecoveryActivity::class.java)
                startActivity(intent)
            }
        register_button.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
                startActivity(intent)
        }

    }



}