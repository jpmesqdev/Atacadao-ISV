package com.devdroid.atacadao_isv.login.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import com.devdroid.atacadao_isv.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginEmailInput = findViewById<EditText>(R.id.login_email_form_input)
        val loginPasswordInput = findViewById<EditText>(R.id.login_password_form_input)

        val loginBtn = findViewById<LoadingButton>(R.id.login_enter_btn)

        loginEmailInput.addTextChangedListener(watcher)
        loginPasswordInput.addTextChangedListener(watcher)

        loginBtn.setOnClickListener {
            if (loginEmailInput.text.isEmpty()) {
                loginEmailInput.error = "Error"
            }
            if (loginPasswordInput.text.isEmpty()) {
                loginPasswordInput.error = "Error aaaaaaaaaaa a"
            }
        }
    }

    val watcher = object: TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            findViewById<LoadingButton>(R.id.login_enter_btn).isEnabled = p0.toString().isNotEmpty()
        }

        override fun afterTextChanged(p0: Editable?) {

        }

    }
}