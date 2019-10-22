package com.example.tictactoy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar()?.hide(); // hide the title bar
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)
    }
    fun btnClick(view: View){
        var btnSelected = view as Button
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
        Log.d("Button Clicked",btnSelected.id.toString())
        Log.d("Button cellId",cellId.toString())
        playGame(cellId, btnSelected)

    }
    var activePlayer = 1
    var player1 = ArrayList<Int>()
    val player2 = ArrayList<Int>()
    fun playGame(cellId:Int, btnSelected:Button){
        if (activePlayer == 1){
           btnSelected.text = "X"
            btnSelected.setBackgroundResource(R.color.colorBlue)
            player1.add(cellId)
            activePlayer = 2
        }else{
            btnSelected.text = "O"
            btnSelected.setBackgroundResource(R.color.colorDarkGreen)
            player2.add(cellId)
            activePlayer = 1
        }
        btnSelected.isEnabled = false
        checkWinner()
    }

    private fun checkWinner() {
       var winner = -1
        //row 1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner = 2
        }
        //row 2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner = 2
        }
        //row 3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner = 2
        }
        //col 1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winner = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winner = 2
        }
        //col 2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner = 2
        }
        //col 3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner = 2
        }

        if(winner == 1){
            player1winscount += 1
            Toast.makeText(this,"Player 1 is the Winner..!",Toast.LENGTH_LONG).show()
            restartGame()
        }else if(winner == 2){
            player2winscount += 1
            Toast.makeText(this,"Player 2 is the Winner..!",Toast.LENGTH_LONG).show()
            restartGame()
        }

    }
    var player1winscount = 0
    var player2winscount = 0
    @SuppressLint("SetTextI18n")
    fun restartGame(){
        activePlayer = 1
        player1.clear()
        player2.clear()

        for (cellId in 1..9){
            var btnSelected:Button? = when(cellId){
               1 -> Btn1
               2 -> Btn2
               3 -> Btn3
               4 -> Btn4
               5 -> Btn5
               6 -> Btn6
               7 -> Btn7
               8 -> Btn8
               9 -> Btn9
                else -> {Btn1}
            }
            btnSelected!!.text = ""
            btnSelected!!.setBackgroundResource(R.color.colorWhite)
            btnSelected!!.isEnabled = true
        }
        playerOne.text ="Player 1 Points is: $player1winscount"
        playerTwo.text = "Player 2 Points is: $player2winscount"
        //Toast.makeText(this,"Player 1: $player1winscount, Player 2: $player2winscount",Toast.LENGTH_LONG).show()
    }

    fun reset(view: View) {
        restartGame()
    }

}
