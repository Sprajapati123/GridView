package com.example.gridview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gridview.R

class FruitsAdapter(var nameList: ArrayList<String>, var imageList: ArrayList<Int>) :
    BaseAdapter() {

    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var view : View = LayoutInflater.from(parent!!.context).inflate(R.layout.sample_grid_layout_1,parent,false)
        var textView :TextView = view.findViewById(R.id.textView)
        var imageView :ImageView = view.findViewById(R.id.imageView)

        textView.text = nameList[position]
        imageView.setImageResource(imageList[position])

        return view
    }
}