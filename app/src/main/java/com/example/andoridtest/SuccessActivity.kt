package com.example.andoridtest

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.view.View
import android.widget.TextView

class SuccessActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val text = findViewById<TextView>(R.id.successText)
        val button = findViewById<Button>(R.id.buttonIntent)
        val ime = intent.getStringExtra("name")
        val successText = getString(R.id.successText)

        text.text = "$successText"

        //getString(R.string.success, username)

        button.setOnClickListener {
            val uri: Uri = Uri.parse("smsto:02345141212345")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", text.text)
            startActivity(intent)
        }


    }
}