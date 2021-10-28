package com.alisamir.signupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var dontHaveAccount:TextView
    lateinit var loginBtn:Button
    lateinit var emailGetText:String
    lateinit var passwordGetText:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email = findViewById(R.id.loginEmail)
        password = findViewById(R.id.loginPass)
        loginBtn = findViewById(R.id.loginBtn)
        dontHaveAccount = findViewById(R.id.donthaveacc)
        loginBtn.setOnClickListener {
            emailGetText = email.text.toString().trim()
            passwordGetText = password.text.toString().trim()
            if (emailGetText.isEmpty()){
                email.setError("Enter Email")
                Toast.makeText(this,"Please, Enter your email", Toast.LENGTH_SHORT).show()
            }else if (passwordGetText.isEmpty()){
                password.setError("Enter Password")
                Toast.makeText(this,"Please, Enter your password",Toast.LENGTH_SHORT).show()
            }else{
                startActivity(Intent(this,HomeActivity::class.java))
            }
        }
        dontHaveAccount.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}