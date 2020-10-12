package com.example.git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText( this, R.string.Welcome, Toast.LENGTH_SHORT).show()
    }
}
        /*
        adicionei metoda A.
        add method B
        ADD METHOD C
        */

