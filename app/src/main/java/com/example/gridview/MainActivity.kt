package com.example.gridview

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gridview.adapter.FruitsAdapter

class MainActivity : AppCompatActivity() {
    lateinit var main : ConstraintLayout
    lateinit var gridView: GridView

    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main = findViewById(R.id.main)
        gridView = findViewById(R.id.gridView)
        fillArrays()

        var adapter = FruitsAdapter(nameList,imageList)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(applicationContext,nameList[position],Toast.LENGTH_LONG).show()
        }
    }

    fun fillArrays(){
        nameList.add("Apple")
        nameList.add("Banana")
        nameList.add("Cherry")
        nameList.add("Dragon Fruit")
        nameList.add("Grapes")
        nameList.add("Mango")
        nameList.add("Orange")
        nameList.add("Papaya")

        imageList.add(R.drawable.apple)
        imageList.add(R.drawable.banana)
        imageList.add(R.drawable.cherry)
        imageList.add(R.drawable.dragon_fruit)
        imageList.add(R.drawable.grapes)
        imageList.add(R.drawable.mango)
        imageList.add(R.drawable.orange)
        imageList.add(R.drawable.papaya)

    }
}