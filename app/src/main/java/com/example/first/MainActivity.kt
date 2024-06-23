package com.example.vitbatch1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.first.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickhandler","button clicked")
        var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"))  //intent= intention
        startActivity(dialIntent)

        var webIntent: Intent = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ndtv.com"))
        startActivity(webIntent)


    }
}