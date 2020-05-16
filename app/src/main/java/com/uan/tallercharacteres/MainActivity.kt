package com.uan.tallercharacteres

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        ImageBtnChavo.setOnClickListener {
            val qualify = Intent (this, Select::class.java)
            qualify.putExtra("id", 1)
            qualify.putExtra("name","Chavo " )
            qualify.putExtra("photo","chavo" )
            qualify.putExtra("description", "chavo")
            startActivity(qualify) }
        ImageBtnDonRamon.setOnClickListener {
            val qualify = Intent (this, Select::class.java)
            qualify.putExtra("id", 3)
            qualify.putExtra("name","DonRamon" )
            qualify.putExtra("photo","donramon" )
            qualify.putExtra("description", "donramon")
            startActivity(qualify) }
        ImageBtnChilindrina.setOnClickListener {
            val qualify = Intent (this, Select::class.java)
            qualify.putExtra("id", 4)
            qualify.putExtra("name","Chilindrina " )
            qualify.putExtra("photo","chilindrina" )
            qualify.putExtra("description", "chilindrina")
            startActivity(qualify) }
        ImageBtnBarriga.setOnClickListener {
            val qualify = Intent (this, Select::class.java)
            qualify.putExtra("id", 5)
            qualify.putExtra("name","Barriga " )
            qualify.putExtra("photo","barriga" )
            qualify.putExtra("description", "barriga")
            startActivity(qualify) }


    }
}