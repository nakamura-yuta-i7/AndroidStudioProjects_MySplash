package com.nkmr.mysplash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
        finish()
    }
}
