package com.example.oneday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.mylistview)

        var data_source :Array<String> = arrayOf("MPESA", "FULIZA", "KCB")

        var data_adapter: ArrayAdapter<String> = ArrayAdapter (this,
        android.R.layout.simple_list_item_1, data_source)

        listview.adapter = data_adapter
    }
}