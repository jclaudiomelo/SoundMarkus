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
    val btn12: Button = view.findViewById(R.id.button12)
    val btn13: Button = view.findViewById(R.id.button13)
//    val btn14: Button = view.findViewById(R.id.button14)

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
        btn6.setOnClickListener {
            MediaPlayer.create(context, R.raw.simasturbo).start()
        }
        btn7.setOnClickListener {
            MediaPlayer.create(context, R.raw.alahu_tocaemmim_arkao).start()
        }
        btn8.setOnClickListener {
            MediaPlayer.create(context, R.raw.bozo_toca_em_mim_markao).start()
        }
        btn9.setOnClickListener {
            MediaPlayer.create(context, R.raw.lula_markao).start()
        }
        btn10.setOnClickListener {
            MediaPlayer.create(context, R.raw.bate_na_cara_markao).start()
        }
        btn11.setOnClickListener {
            MediaPlayer.create(context, R.raw.oferencedo).start()
        }
        btn12.setOnClickListener {
            MediaPlayer.create(context, R.raw.bateforteraviens).start()
        }
        btn13.setOnClickListener {
            MediaPlayer.create(context, R.raw.taomuitogai).start()
        }
//        btn14.setOnClickListener {
//            MediaPlayer.create(context, R.raw.tocaemmim).start()
//        }






    }
}
