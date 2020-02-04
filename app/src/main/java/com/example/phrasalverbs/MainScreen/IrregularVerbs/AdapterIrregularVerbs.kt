package com.example.phrasalverbs.MainScreen.IrregularVerbs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.phrasalverbs.MainScreen.ActivityCollocations.CollocationsModel
import com.example.phrasalverbs.R

class AdapterIrregularVerbs (val context: Context, private val ArrayImageText1: ArrayList<IrregularVerbsModel>): RecyclerView.Adapter<AdapterIrregularVerbs.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.item_activity_irregular_verbs, parent, false)

        return ViewHolder(itemView)
    }


    override fun onBindViewHolder(holder:ViewHolder, position:Int)
    {
        holder.bind(ArrayImageText1[position])
    }

    override fun getItemCount(): Int = ArrayImageText1.size

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvinfinitive = itemView.findViewById<TextView>(R.id.textView_IrregularVerbs_infinitive)
        var tvpastsimple = itemView.findViewById<TextView>(R.id.textView_IrregularVerbs_pastsimple)
        var tvpastparticiple = itemView.findViewById<TextView>(R.id.textView_IrregularVerbs_pastparticiple)
        fun bind(irregularverbsmodel: IrregularVerbsModel) {
            tvinfinitive.text = irregularverbsmodel.infinitive
            tvpastsimple.text = irregularverbsmodel.pastsimple
            tvpastparticiple.text = irregularverbsmodel.pastparticiple

        }
    }
}