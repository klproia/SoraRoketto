package com.example.soraroketto


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.build_main.*
import kotlinx.android.synthetic.main.build_main.buildbutton
import kotlinx.android.synthetic.main.build_main.loginbutton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       buildbutton.setOnClickListener {
           setContentView(R.layout.build_main)
         //  Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            }
        loginbutton.setOnClickListener {
            setContentView(R.layout.login_main)
        }
    }
}
