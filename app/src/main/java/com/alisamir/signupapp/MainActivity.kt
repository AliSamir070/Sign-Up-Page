package com.alisamir.signupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var username:EditText
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var signUpBtn:Button
    lateinit var alreadyHaveAcc:TextView
    lateinit var usernameGetText: String
    lateinit var emailGetText: String
    lateinit var passwordGetText: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.signUpUsername)
        email = findViewById(R.id.signUpEmail)
        password = findViewById(R.id.signUpPass)
        signUpBtn = findViewById(R.id.signupBtn)
        alreadyHaveAcc = findViewById(R.id.alreadyhaveacc)
        signUpBtn.setOnClickListener {
            usernameGetText = username.text.toString().trim()
            emailGetText = email.text.toString().trim()
            passwordGetText = password.text.toString().trim()
            if(usernameGetText.isEmpty()){
                username.setError("Enter Username")
                Toast.makeText(this,"Please, Enter your username",Toast.LENGTH_SHORT).show()
            }else if (emailGetText.isEmpty()){
                email.setError("Enter Email")
                Toast.makeText(this,"Please, Enter your email",Toast.LENGTH_SHORT).show()
            }else if(passwordGetText.isEmpty()){
                password.setError("Enter Password")
                Toast.makeText(this,"Please, Enter your password",Toast.LENGTH_SHORT).show()
            }else{
                startActivity(Intent(this,LoginActivity::class.java))
            }
        }
        alreadyHaveAcc.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }

    }


}