package com.example.tictactoy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.tictactoy.R.color.colorDarkGreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnClick(view: View){
        val btnSelected = view as Button
        var cellId = 0
        when(btnSelected.id){
            R.id.Btn1 -> cellId = 1
            R.id.Btn2 -> cellId = 2
            R.id.Btn3 -> cellId = 3
            R.id.Btn4 -> cellId = 4
            R.id.Btn5 -> cellId = 5
            R.id.Btn6 -> cellId = 6
            R.id.Btn7 -> cellId = 7
            R.id.Btn8 -> cellId = 8
            R.id.Btn9 -> cellId = 9
        }
        playGame(cellId, btnSelected)

    }
    var activePlayer = 1
    var player1 = ArrayList<Int>()
    val player2 = ArrayList<Int>()
    @SuppressLint("ResourceAsColor")
    fun playGame(cellId:Int, btnSelected:Button){
        if (activePlayer == 1){
           btnSelected.text = "X"
            btnSelected.setBackgroundColor(R.color.colorBlue)
            btnSelected.setBackgroundColor(R.color.colorDarkGreen)
        }else{

        }
    }
}
