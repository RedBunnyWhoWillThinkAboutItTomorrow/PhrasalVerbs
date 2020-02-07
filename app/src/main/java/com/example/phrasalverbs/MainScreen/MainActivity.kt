package com.example.phrasalverbs.MainScreen

import com.example.phrasalverbs.MainScreen.ActivityPhrasalVerbs.ActivityPhrasalVerbs
import com.example.phrasalverbs.MainScreen.ActivityCollocations.ActivityCollocations
import com.example.phrasalverbs.MainScreen.Fruits.ActivityFruits
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.phrasalverbs.R
import android.R.attr.start
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.example.phrasalverbs.MainScreen.Fruits.ActivityVegetables
import com.example.phrasalverbs.MainScreen.IrregularVerbs.ActivityIrregularVerbs
import com.example.phrasalverbs.MainScreen.Professions.ActivityProfessions
import com.example.phrasalverbs.MainScreen.Tests.TestsScreenActivity
import com.romainpiel.shimmer.Shimmer
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
var shimmer : Shimmer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shimmer = Shimmer()
        shimmer!!.start(textView_PhrasalVerbs)
        shimmer!!.start(textView_Fruits)
        shimmer!!.start(textView_Collocations)
        shimmer!!.start(textView_Vegetables)
        shimmer!!.start(textView_Professions)
        shimmer!!.start(textView_IrregularVerbs)
        shimmer!!.start(textView_Tests)




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
    fun AddVegetables(view:View){
        val add = Intent(this, ActivityVegetables::class.java)
        startActivity(add)
    }
    fun AddProfessions(view:View){
        val add = Intent(this, ActivityProfessions::class.java)
            startActivity(add)
        }
    fun AddIrregularVerbs(view:View){
        val add = Intent (this,ActivityIrregularVerbs::class.java)
        startActivity(add)
    }
    fun AddTests(view:View){
        val add = Intent (this,TestsScreenActivity::class.java)
        startActivity(add)
    }
}
