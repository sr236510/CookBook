package com.example.cookbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.beardedhen.androidbootstrap.BootstrapButton
import com.beardedhen.androidbootstrap.TypefaceProvider
import com.example.cookbook.database.Ingredient


class MyIngredientsAdapter(val list:ArrayList<Ingredient>): RecyclerView.Adapter<MyIngredientsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyIngredientsAdapter.ViewHolder {
        TypefaceProvider.registerDefaultIconSets();
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_ingredient, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: MyIngredientsAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItems(data: Ingredient) {

            val element: TextView = itemView.findViewById(R.id.txt)
            element.text = data.name

            //set the onclick listener for the single list item
            val btn: BootstrapButton = itemView.findViewById(R.id.button_delete_ingredient)
            btn.setOnClickListener({
                //todo: usuniecie elementu z bazy(listy posiadanych skladnikow)
            })

        }

    }
}
