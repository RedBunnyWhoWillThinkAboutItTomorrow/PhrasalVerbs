package com.example.phrasalverbs.MainScreen

import ActivityPhrasalVerbs.ActivityPhrasalVerbs
import ActivityCollocations.ActivityCollocations
import Fruits.ActivityFruits

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.phrasalverbs.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun AddActivityPhrasalVerbs (view:View){
        val add = Intent(this, ActivityPhrasalVerbs::class.java)
        startActivity(add)
    }
    fun AddCollocations (view:View){
        val add = Intent(this, ActivityCollocations::class.java)
        startActivity(add)
    }
    fun AddFruits(view:View){
        val add = Intent(this, ActivityFruits::class.java)
        startActivity(add)
    }
}
