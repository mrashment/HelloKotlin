package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Pair<String, Int>>().apply {
            add(Pair("Apples",5)) // What happens to this? Doesn't appear in recyclerview
            add(Pair("Bread",1))
            add(Pair("Milk",1))
            add(Pair("Cereal",2))
        }

        // Apples is definitely here, must disappear in the adapter
        for (item in list) println("""${item.first} ${item.second}""")

        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = GroceryAdapter(list);

    }
}
