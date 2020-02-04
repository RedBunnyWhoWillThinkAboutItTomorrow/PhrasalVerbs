package com.example.phrasalverbs.MainScreen.ActivityPhrasalVerbs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.phrasalverbs.R
import com.squareup.picasso.Picasso


class AdapterActivityPhrasalVerbs(val context: Context, private val ArrayImageText: ArrayList<PhrasalVerbsModel>): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val itemView= layoutInflater.inflate(R.layout.item_list_activity_phrasal_verbs,parent,false)

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = ArrayImageText.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
holder.bind(ArrayImageText[position])

    }

}
class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
{
    var tvPhrasalVerbs = itemView.findViewById<TextView>(R.id.textView_PhrasalVerbs)
    var ivPhrasalVerbs = itemView.findViewById<ImageView>(R.id.imageViewPhrasalVerbs)
    fun bind (phrasalverbsmodel: PhrasalVerbsModel){
        tvPhrasalVerbs.text= phrasalverbsmodel.textview
Picasso.get()
    .load(phrasalverbsmodel.imageview)
    .into(ivPhrasalVerbs)

    }
}