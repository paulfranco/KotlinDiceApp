package co.paulfran.paulfranco.kotlindiceapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll)
        val diceOne: ImageView = findViewById(R.id.diceOne)
        val diceTwo: ImageView = findViewById(R.id.diceTwo)

        rollButton.setOnClickListener(){
            val randomNumberOne = Random().nextInt(6) + 1
            val randomNumberTwo = Random().nextInt(6) + 1

            val resourceDrawable1 = when (randomNumberOne) {
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                6 -> R.drawable.dice6
                else -> R.drawable.dice6
            }

            val resourceDrawable2 = when (randomNumberTwo) {
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                6 -> R.drawable.dice6
                else -> R.drawable.dice6
            }

            diceOne.setImageResource(resourceDrawable1)
            diceTwo.setImageResource(resourceDrawable2)
        }

    }

}
