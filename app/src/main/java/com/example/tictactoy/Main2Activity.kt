package com.example.tictactoy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Toast.makeText(this, "test", Toast.LENGTH_LONG).show()


    }
}
