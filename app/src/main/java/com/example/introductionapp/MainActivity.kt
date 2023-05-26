package com.example.introductionapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val github: ImageView =findViewById(R.id.imageView3)

        val linkdin:ImageView=findViewById(R.id.imageView5)
        val intsa:ImageView=findViewById(R.id.imageView4)

        github.setOnClickListener {
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://github.com/guptashivam-9370")
            startActivity(openURL)


        }
        linkdin.setOnClickListener {
            val openURL=Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.linkedin.com/in/shivam-gupta-627b79261")
            startActivity(openURL)

        }
        intsa.setOnClickListener(){
            val openURL=Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.instagram.com/shivam_gupta_9370/")
            startActivity(openURL)


        }




    }
}