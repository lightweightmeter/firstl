package com.example.re

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.first.CoountryModel
import com.example.first.R
import com.example.first.countryadapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        recyclerView=findViewById(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(this)

        val countryLIst=ArrayList<CoountryModel>()
        countryLIst.add(CoountryModel("india",R.drawable.images))
        countryLIst.add(CoountryModel("afg",R.drawable.abc))
        countryLIst.add(CoountryModel("b",R.drawable.fds))
        countryLIst.add(CoountryModel("c",R.drawable.sfvfdvfd))
        countryLIst.add(CoountryModel("d",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("e",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("f",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("g",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("h",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("i",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("j",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("k",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("l",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("m",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("n",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("o",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("p",R.drawable.xvvdfv))
        countryLIst.add(CoountryModel("q",R.drawable.xvvdfv))



        val adapter=countryadapter(countryLIst)
        recyclerView.adapter=adapter
    }
}