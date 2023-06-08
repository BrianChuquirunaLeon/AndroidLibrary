package com.example.brianbutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class BrianButon @JvmOverloads constructor(
    context:Context,
    attrs:AttributeSet? = null,
    defStyle:Int = 0,
    defStyleRes: Int = 0
):LinearLayout(context,attrs,defStyle,defStyleRes){
    init{
        LayoutInflater.from(context).inflate(R.layout.component_btn_brian,this,true)
        val btn = findViewById<ImageButton>(R.id.btnPingin)
        btn.setOnClickListener{Toast.makeText(context,"Soy un pinguino",Toast.LENGTH_SHORT).show()}
    }
}