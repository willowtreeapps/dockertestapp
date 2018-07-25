package com.example.konradwinkler.docker_test_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_click_me.setOnClickListener {
            Log.d("GENERAL", "clicked the button")
            check_me.isChecked = !check_me.isChecked
        }
    }

}
