package com.example.androidchallengebshumba20

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_andela_abt.*

class AndelaAbt : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_andela_abt)

        Andela_web.loadUrl("https://andela.com/alc/")
    }



}