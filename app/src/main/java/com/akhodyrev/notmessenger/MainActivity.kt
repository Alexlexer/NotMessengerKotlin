package com.akhodyrev.notmessenger

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RegisterBtn.setOnClickListener {
            val email = UserNameFieldReg.text.toString()
            val password = PasswordFieldReg.text.toString()

            Log.d("MainActivity","This is Email " + email)
            Log.d("MainActivity", "This is password $password")
        }

        Login.setOnClickListener {
            Log.d("MainActivity","This is Login")
            //launch login activity
            val intent = Intent(this, LoginActivity::class.java )
            startActivity(intent)

        }



    }
}
