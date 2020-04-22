package com.example.hellokotlin

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_view.view.*
import org.w3c.dom.Text

class GroceryAdapter(private val items: ArrayList<Pair<String,Int>>) : RecyclerView.Adapter<GroceryAdapter.MyViewHolder>() {
    val TAG = "GroceryAdapter"

    init {
        Log.d(TAG, items.size.toString())
        for (item in items) Log.d(TAG,"${item.first} ${item.second}")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_view,parent,false)
        return MyViewHolder(v);
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder: ${items[position].first} ${items[position].second}") // apples still seems to be here, why doesn't it display?
        holder.nameTextView.text = items[position].first
        holder.numberTextView.text = items[position].second.toString()
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val TAG = "MyViewHolder"
        val nameTextView: TextView = itemView.nameTextView
        val numberTextView: TextView = itemView.numberTextView

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            Log.d(TAG,"Click!");
        }

    }
}