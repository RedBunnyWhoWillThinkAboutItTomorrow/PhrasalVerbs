package com.example.phrasalverbs.MainScreen.Tests

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.phrasalverbs.MainScreen.ActivityCollocations.ActivityCollocations
import com.example.phrasalverbs.MainScreen.ActivityPhrasalVerbs.ActivityPhrasalVerbs
import com.example.phrasalverbs.MainScreen.Fruits.ActivityFruits
import com.example.phrasalverbs.MainScreen.Fruits.ActivityVegetables
import com.example.phrasalverbs.MainScreen.IrregularVerbs.ActivityIrregularVerbs
import com.example.phrasalverbs.MainScreen.Professions.ActivityProfessions
import com.example.phrasalverbs.R
import com.romainpiel.shimmer.Shimmer
import android.widget.AdapterView.OnItemSelectedListener;

import kotlinx.android.synthetic.main.activity_tests_screen.*


class TestsScreenActivity : AppCompatActivity() {
    // var phrasalverbs = arrayOf("hang out","eat out","fall down")
    var shimmer: Shimmer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tests_screen)


        shimmer = Shimmer()
        shimmer!!.start(textView_Tests_PV)
        shimmer!!.start(textView_Tests_F)
        shimmer!!.start(textView_Tests_C)
        shimmer!!.start(textView_Tests_V)
        shimmer!!.start(textView_Tests_P)
        shimmer!!.start(textView_Tests_IV)
        shimmer!!.start(textView_Results)


    }
        fun AddActivityTests_PV(v : View) {
            val add = Intent(this, Test_1::class.java)
            startActivity(add)
        }

}
      /*  fun AddTests_C (view: View){
            val add = Intent(this, ActivityCollocations::class.java)
            startActivity(add)
        }
        fun AddTests_F(view: View){
            val add = Intent(this, ActivityFruits::class.java)
            startActivity(add)
        }
        fun AddTests_V(view: View){
            val add = Intent(this, ActivityVegetables::class.java)
            startActivity(add)
        }
        fun AddPTests_P(view: View){
            val add = Intent(this, ActivityProfessions::class.java)
            startActivity(add)
        }
        fun AddTests_IV(view: View){
            val add = Intent (this, ActivityIrregularVerbs::class.java)
            startActivity(add)
        }
        fun AddResults(view: View){
            val add = Intent (this, ActivityIrregularVerbs::class.java)
            startActivity(add)
            }

    }
}
*/

