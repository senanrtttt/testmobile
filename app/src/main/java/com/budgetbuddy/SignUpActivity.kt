package com.budgetbuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.budgetbuddy.asim.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialize the views
        val usernameEditText = findViewById<EditText>(R.id.etUsername)
        val passwordEditText = findViewById<EditText>(R.id.etPassword)
        val repeatPasswordEditText = findViewById<EditText>(R.id.etRepeatPassword)
        val submitButton = findViewById<Button>(R.id.btnSubmit)
        val loginLink = findViewById<TextView>(R.id.tvLoginLink)

        // Set up the submit button listener
        submitButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val repeatPassword = repeatPasswordEditText.text.toString()

            if (username.isBlank() || password.isBlank() || repeatPassword.isBlank()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else if (password != repeatPassword) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            } else {
                // Handle signup logic here (e.g., save data to database or authenticate)
                Toast.makeText(this, "Signup successful", Toast.LENGTH_SHORT).show()
                finish() // Close the signup activity, return to previous screen
            }
        }

        // Navigate to login activity when clicking the login link
        loginLink.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Optional: Close this activity to prevent back navigation to signup
        }
    }
}
