package com.example.superletter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class FruitAdapter(context: Context, private val resource: Int, data: MutableList<Fruit>) :
        ArrayAdapter<Fruit>(context, resource, data) {
    inner class ViewHolder(
            val fruitImage: ImageView,
            val fruitName: TextView,
            val fruitTime: TextView,
            val fruitNotice: TextView
    )

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val viewHolder: ViewHolder
        val view: View
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(resource, parent, false)
            val fruitImage: ImageView = view.findViewById(R.id.fruit_image)
            val fruitName: TextView = view.findViewById(R.id.fruit_view_name)
            val fruitNotice: TextView = view.findViewById(R.id.fruit_view_notice)
            val fruitTime: TextView = view.findViewById(R.id.fruit_view_time)
            viewHolder = ViewHolder(fruitImage, fruitName, fruitTime,fruitNotice)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        val fruit = getItem(position)
        if (fruit != null) {
            viewHolder.fruitImage.setImageResource(fruit.imageId)
            viewHolder.fruitName.text = fruit.name
            viewHolder.fruitNotice.text = fruit.notice
            viewHolder.fruitTime.text = getTime()
        }
        return view
    }

    private fun getTime(): String? {
        val date = Date()
        val time = SimpleDateFormat("HH:mm", Locale.CHINA)
        return time.format(date)
    }
}
