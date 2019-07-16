package com.example.androidchallengebshumba20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profile_button. setOnClickListener {
            d("note", "profile was opened")
            startActivity(Intent(this, AboutMe::class.java))
        }
        link_button. setOnClickListener {
            d("note", "link was activated")
            startActivity(Intent(this, AndelaAbt::class.java))


    }
}
