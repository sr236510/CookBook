package com.example.cookbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.beardedhen.androidbootstrap.TypefaceProvider


class FindDishAdapter(val list:ArrayList<String>): RecyclerView.Adapter<FindDishAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FindDishAdapter.ViewHolder {
        TypefaceProvider.registerDefaultIconSets();
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_finddish, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: FindDishAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindItems(data : String){
            val element: TextView = itemView.findViewById(R.id.txt)
            element.text = data

            //set the onclick listener for the single list item
            val checkbox: CheckBox = itemView.findViewById(R.id.checkbox)
            //todo: zaznaczenie/odznaczenie skladnika
        }

    }
}
