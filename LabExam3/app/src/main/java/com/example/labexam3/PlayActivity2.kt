package com.example.labexam3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PlayActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play2)

        val addtion: ImageView = findViewById<ImageView>(R.id.addtion)
        val sub: ImageView = findViewById<ImageView>(R.id.sub)
        val multip: ImageView = findViewById<ImageView>(R.id.multip)
        val divi: ImageView = findViewById<ImageView>(R.id.divi)

        addtion.setOnClickListener{
            val calInt = Intent(this@PlayActivity2 ,
                MainActivity::class.java)

            calInt.putExtra("cals", "+" )
            startActivity(calInt)
        }

        sub.setOnClickListener{
            val calInt = Intent(this@PlayActivity2 ,
                MainActivity::class.java)

            calInt.putExtra("cals", "-" )
            startActivity(calInt)
        }

        multip.setOnClickListener{
            val calInt = Intent(this@PlayActivity2 ,
                MainActivity::class.java)

            calInt.putExtra("cals", "*" )
            startActivity(calInt)
        }

        divi.setOnClickListener{
            val calInt = Intent(this@PlayActivity2 ,
                MainActivity::class.java)

            calInt.putExtra("cals", "÷" )
            startActivity(calInt)
        }
    }
}