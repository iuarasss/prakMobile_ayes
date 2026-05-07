package com.example.bengapps

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.activity_splash_screen)

        lifecycleScope.launch {

            delay(2000) // delay 2 detik

            // SharedPreferences
            val sharedPref = getSharedPreferences("user_pref", MODE_PRIVATE)

            // cek status login
            val isLogin = sharedPref.getBoolean("isLogin", false)

            val intent = if (isLogin) {

                // jika sudah login
                Intent(this@SplashScreenActivity, MainActivity::class.java)

            } else {

                // jika belum login
                Intent(this@SplashScreenActivity, AuthActivity::class.java)
            }

            startActivity(intent)

            finish()
        }
    }
}