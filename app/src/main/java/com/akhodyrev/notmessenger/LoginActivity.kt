package com.akhodyrev.notmessenger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        Login_Btn.setOnClickListener {
            val email = Email_Login_Field.text.toString()
            val password = Password_Login_Field.text.toString()

            Log.d("MainActivity","This is Email " + email)
            Log.d("MainActivity", "This is password $password")
        }
    }



    }
