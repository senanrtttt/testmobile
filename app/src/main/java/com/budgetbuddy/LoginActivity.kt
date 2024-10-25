package com.budgetbuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.budgetbuddy.Asim.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEditText = findViewById<EditText>(R.id.etUsername)
        val passwordEditText = findViewById<EditText>(R.id.etPassword)
        val submitButton = findViewById<Button>(R.id.btnSubmit)
        val guestAccountText = findViewById<TextView>(R.id.tvGuestAccount)
        val forgotPasswordText = findViewById<TextView>(R.id.tvForgotPassword)
        val alreadyHaveAccountText = findViewById<TextView>(R.id.tvAlreadyHaveAccount)

        submitButton.setOnClickListener {
            // Handle login logic here
            val username = usernameEditText.text?.toString() ?: ""
            val password = passwordEditText.text?.toString() ?: ""
            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Implement authentication logic
            } else {
                // Show an error message to the user
            }
        }

        guestAccountText.setOnClickListener {
            // Navigate to guest mode or main activity as guest
        }

        forgotPasswordText.setOnClickListener {
            // Navigate to Forgot Password screen
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        alreadyHaveAccountText.setOnClickListener {
            // Navigate to Sign Up screen if needed
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
