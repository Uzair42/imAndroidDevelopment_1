package com.mu42.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var ettName:EditText
    lateinit var  etpPassword:EditText
    lateinit var btnRegister:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }

        // initilizing the variable
        ettName=findViewById(R.id.txtName)
        etpPassword=findViewById(R.id.txtPassword)
        btnRegister=findViewById(R.id.btnRegister)


        //Event on Button

        btnRegister.setOnClickListener(object : View.OnClickListener{ override fun onClick(po:View){ btnRegister.setText(" Hi >> ${ettName.text.toString()}")}})



    }
}