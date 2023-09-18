package com.pupup.textno7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView : ListView = findViewById(R.id.listView)

        val personalDetails = arrayOf(
            personal_details("John",R.drawable.p1,20,99455414511) ,
            personal_details("Natalia",R.drawable.p2,50,8864779221),
            personal_details("Jims Bond",R.drawable.p3,80,878120001255),
            personal_details("Ania",R.drawable.p4,30,625593588),
            personal_details("Sweet",R.drawable.p5,44,7871154212154),
            personal_details("David",R.drawable.p6,33,7871154212154),
            personal_details("Smith",R.drawable.p7,54,7871154212154),
            personal_details("Surbhi",R.drawable.p8,25,7871154212154),
            personal_details("Arm",R.drawable.p1,33,99455454511),
            personal_details("Sutali",R.drawable.p2,50,886459221),
            personal_details("Jims Bond",R.drawable.p3,80,878120001255),
            personal_details("Ania",R.drawable.p4,30,625593588),
            personal_details("Sweet",R.drawable.p5,44,7871154212154),
            personal_details("David",R.drawable.p6,33,7871154212154),
            personal_details("Smith",R.drawable.p7,54,7871154212154),
            personal_details("Subhi",R.drawable.p8,25,7871154212154)
        )
        listView.adapter = Personal_details_baseAdapter(this,personalDetails)
    }

}