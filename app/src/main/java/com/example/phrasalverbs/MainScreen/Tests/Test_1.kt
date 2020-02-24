package com.example.phrasalverbs.MainScreen.Tests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.phrasalverbs.R
import kotlinx.android.synthetic.main.activity_tests_pv.*

class Test_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tests_pv)
        SpinnerAdapter()
       // val arrayMode = resources.getStringArray(R.array.mode)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

    val itemid = spinner.selectedItem.toString()

    when (spinner.selectedItem)
    {
        0-> { Toast.makeText(this,"Your answer is : $itemid"  , Toast.LENGTH_LONG).show()
            return true}
        1 ->  { Toast.makeText(this,"Your answer is : $itemid"  , Toast.LENGTH_LONG).show()
            return true }
        2 ->  { Toast.makeText(this,"Your answer is : $itemid"  , Toast.LENGTH_LONG).show()
            return true}
    }
    return super.onOptionsItemSelected(item)
}
    fun SpinnerAdapter() {
        val spinner: Spinner = findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.mode,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
           }
    }
}






