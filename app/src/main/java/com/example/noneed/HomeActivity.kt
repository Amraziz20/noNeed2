package com.example.noneed

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {


        var Counter = 0
        var price = 0

        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)

            var count: TextView = findViewById(R.id.counterincart)
            var passprice:TextView = findViewById(R.id.pricehome)


            val tocartClick = findViewById<ImageView>(R.id.tocart)
            tocartClick.setOnClickListener {
                var num = count.text.toString()
                var pricepass = passprice.text.toString()


                val intent = Intent(this, CartActivity::class.java)
                intent.putExtra("firstName", num)
                intent.putExtra("price", pricepass)
                startActivity(intent)
            }

            val logoutClick = findViewById<ImageView>(R.id.logout)
            logoutClick.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }


        @SuppressLint("SetTextI18n")
        fun add(view: View) {

            Counter++
            price+=250
            val textView =findViewById<TextView>(R.id.counterincart)
            val pricetext =findViewById<TextView>(R.id.pricehome)
            textView.text = "$Counter in cart"
            pricetext.text = "$price LE"
        }

}