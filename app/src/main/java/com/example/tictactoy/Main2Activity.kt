package com.example.tictactoy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 dev
import android.widget.Toast

import android.util.Log
 master

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
 dev

        Toast.makeText(this, "test", Toast.LENGTH_LONG).show()



        Log.d("TEST","all")
 master
    }
}
