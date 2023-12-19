package com.example.noneed

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView

class PayActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        val number: TextView = findViewById(R.id.total)
        val pricepassed = intent.getStringExtra("pricetot").toString()
//        val price = intent.getStringExtra("price").toString()

        number.text = "Total to pay = $pricepassed "


        val logoutClick = findViewById<ImageView>(R.id.logout)
        logoutClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val homeClick = findViewById<ImageView>(R.id.home)
        homeClick.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        val visago = findViewById<Button>(R.id.comfirmpay)
        visago.setOnClickListener {
            val intent = Intent(this, VisaActivity::class.java)
            startActivity(intent)
        }

    }
}