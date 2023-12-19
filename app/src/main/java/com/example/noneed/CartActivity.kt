package com.example.noneed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class CartActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val number: TextView = findViewById(R.id.incar)
        val subtot: TextView = findViewById(R.id.subtot)
        val passnum = intent.getStringExtra("firstName").toString()
        val price = intent.getStringExtra("price").toString()

        number.text = "$passnum"
        subtot.text = "$price"




        val payClick = findViewById<Button>(R.id.pay)
        var total = subtot.text.toString()
        payClick.setOnClickListener {
            val intent = Intent(this, PayActivity::class.java)
            intent.putExtra("pricetot", total)
            startActivity(intent)
        }


    }

}