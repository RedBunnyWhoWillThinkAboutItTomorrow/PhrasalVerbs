package ActivityCollocations

import android.widget.TextView
import kotlinx.android.synthetic.main.item_list_activity_collocations.*
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.phrasalverbs.R

class AdapterCollocations(val context: Context, private val ArrayImageText: ArrayList<CollocationsModel>): RecyclerView.Adapter<AdapterCollocations.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.item_list_activity_collocations, parent, false)

        return ViewHolder(itemView)
    }


    override fun onBindViewHolder(holder:ViewHolder, position:Int)
    {
        holder.bind(ArrayImageText[position])
    }

    override fun getItemCount(): Int = ArrayImageText.size

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvCollocations = itemView.findViewById<TextView>(R.id.textView_collocations_english)
        var tv1Collocations = itemView.findViewById<TextView>(R.id.textView_collocations_translation)
        fun bind(collocationsmodel:CollocationsModel) {
            tvCollocations.text = collocationsmodel.englishword
            tv1Collocations.text = collocationsmodel.ukrainianword


        }
    }
}