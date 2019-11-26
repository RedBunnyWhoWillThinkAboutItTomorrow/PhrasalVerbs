package com.example.phrasalverbs.MainScreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.phrasalverbs.R

class Adapter : RecyclerView.Adapter<ViewHolder>(){

    private val NameButtonsMS : Array<String> = arrayOf("Phrasal_Verbs", "Collocasions","Profession")


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val layoutInflater= LayoutInflater.from(parent.context)
        val itemView= layoutInflater.inflate(R.layout.item_list_main_screen,parent,false)

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = NameButtonsMS.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {

      var Name1= NameButtonsMS.get(position)
        holder.mb.text = Name1

    }

}
 class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
 {
var mb = itemView.findViewById<TextView>(R.id.TextMainScreen)
 }