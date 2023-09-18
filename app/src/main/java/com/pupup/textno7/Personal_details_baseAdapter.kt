package com.pupup.textno7

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.media.Image
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class Personal_details_baseAdapter(val context: Context, private val personalDetails: Array<personal_details>) : BaseAdapter() {
    override fun getCount(): Int {
        return  personalDetails.size
    }

    override fun getItem(p0: Int): Any {
        return personalDetails[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("ViewHolder", "MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val personalModal = personalDetails[p0]
        val layoutDesign = LayoutInflater.from(context).inflate(R.layout.single_row_design,p2,false)
        val profile_imaage : ImageView = layoutDesign.findViewById(R.id.profile_image)
        val nameView : TextView = layoutDesign.findViewById(R.id.nameView)
        val ageView : TextView = layoutDesign.findViewById(R.id.ageView)
        
        nameView.text = personalDetails[p0].name
        profile_imaage.setImageResource(personalModal.profileImaage)
        ageView.text = personalModal.age.toString()

        layoutDesign.setOnClickListener {
            val layout = LayoutInflater.from(context).inflate(R.layout.toast_layout,null)
            val toastText : TextView = layout.findViewById(R.id.toastView)
            toastText.text = "Hii, I'm " +  personalDetails[p0].name
            val toast = Toast.makeText(context,personalDetails[p0].name,Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM,50,200)
            toast.view = layout
            toast.show()

            val intent = Intent(context,Persona_Information_Activity::class.java)
            intent.putExtra("name",personalDetails[p0].name)
            intent.putExtra("age",personalDetails[p0].age)
            intent.putExtra("image",personalDetails[p0].profileImaage)
            intent.putExtra("phone",personalDetails[p0].phone)
            context.startActivity(intent)
        }
        return layoutDesign
    }

}