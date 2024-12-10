package com.aula.soundmarkus

import android.content.Context
import android.media.MediaPlayer
import android.view.View
import android.widget.Button

class Buttons(private val view: View, private val context: Context) {

    val btn1: Button = view.findViewById(R.id.button1)
    val btn2: Button = view.findViewById(R.id.button2)
    val btn3: Button = view.findViewById(R.id.button3)
    val btn4: Button = view.findViewById(R.id.button4)
    val btn5: Button = view.findViewById(R.id.button5)
    val btn6: Button = view.findViewById(R.id.button6)
    val btn7: Button = view.findViewById(R.id.button7)
    val btn8: Button = view.findViewById(R.id.button8)
    val btn9: Button = view.findViewById(R.id.button9)
    val btn10: Button = view.findViewById(R.id.button10)
    val btn11: Button = view.findViewById(R.id.button11)

    fun playSound() {

        btn1.setOnClickListener {
            MediaPlayer.create(context, R.raw.salvepaizao).start()
            playSound()
        }
        btn2.setOnClickListener {
            MediaPlayer.create(context, R.raw.alahur1).start()
        }
        btn3.setOnClickListener {
            MediaPlayer.create(context, R.raw.trabalhar).start()
        }
        btn4.setOnClickListener {
            MediaPlayer.create(context, R.raw.ohfock).start()
        }
        btn5.setOnClickListener {
            MediaPlayer.create(context, R.raw.sarue).start()
        }



    }
}
