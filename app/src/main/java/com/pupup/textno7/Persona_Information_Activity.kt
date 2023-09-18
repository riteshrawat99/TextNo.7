package com.pupup.textno7

import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Persona_Information_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persona_information)

        val getName = intent.extras?.getString("name")
        val getAge = intent.extras?.getInt("age")
        val getImage = intent.extras?.getInt("image")
        val getPhone = intent.extras?.getLong("phone")

        val gtImage : ImageView = findViewById(R.id.gtImage)
        val name : TextView = findViewById(R.id.textView)
        val age : TextView = findViewById(R.id.ageView)
        val phone : TextView = findViewById(R.id.phone)
        name.text = getName
        age.text=getAge.toString()
        if (getImage != null) {
            gtImage.setImageResource(getImage.toInt())
        }
        phone.text = getPhone.toString()

        gtImage.setOnClickListener {
            val layout = LayoutInflater.from(this).inflate(R.layout.custome_toast,null)
            val toastImg : ImageView = layout.findViewById(R.id.toastImg)
            val toastText : TextView = layout.findViewById(R.id.toastText)
            if (getImage != null) {
                toastImg.setImageResource(getImage.toInt())
            }
            toastText.setText("Hii I'm " + getName)
            val toast = Toast.makeText(this,"hii",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM,50,400)
            toast.view=layout
            toast.show()
        }
    }
}

