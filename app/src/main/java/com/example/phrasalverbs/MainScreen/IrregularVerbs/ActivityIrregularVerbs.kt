package com.example.phrasalverbs.MainScreen.IrregularVerbs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phrasalverbs.MainScreen.IrregularVerbs.AdapterIrregularVerbs
import com.example.phrasalverbs.MainScreen.IrregularVerbs.IrregularVerbsModel
import com.example.phrasalverbs.R
import kotlinx.android.synthetic.main.activiry_irregular_verbs.*
import kotlinx.android.synthetic.main.item_activity_irregular_verbs.*

class ActivityIrregularVerbs  : AppCompatActivity() {
        val  ListName2 = ArrayList<IrregularVerbsModel>()
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.item_activity_irregular_verbs)


            ListName2.add(
                IrregularVerbsModel("Be", "was/were", "Been"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Become", "Became", "Become"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Begin", "Began", "Begun"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Bite", "Bit", "Bitten"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Blow", "Blew", "Blown"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Break", "Broke", "Broken"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Bring", "Brought", "Brought"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Build", "Built", "Built"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Buy", "Bought", "Bought"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Catch", "Caught", "Caught"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Choose", "Chose", "Chosen"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Come", "Came", "Come"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Cost", "Cost", "Cost"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Cut", "Cut", "Cut"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Do", "Did", "Done"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Draw", "Drew", "Drawn"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Drive", "Drove", "Driven"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Drink", "Drank", "Drunk"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Eat", "Ate", "Eaten"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Fall", "Fell", "Fallen"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Feel", "Felt", "Felt"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Find", "Found", "Found"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Fly", "Flew", "Flown"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Forget", "Forgot", "Forgotten"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Forgive", "Forgave", "Forgiven"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Get", "Got", "Got"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Give", "Gave", "Given"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Go", "Went", "Gone"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Grow", "Grew", "Grown"
                )
            )
       //     val RVIrregularVerbs = findViewById(R.id.RVIrregularVerbs_item) as RecyclerView
            RVIrregularVerbs.layoutManager = LinearLayoutManager(this)
            RVIrregularVerbs.adapter = AdapterIrregularVerbs(this,ListName2)
        }
    }

