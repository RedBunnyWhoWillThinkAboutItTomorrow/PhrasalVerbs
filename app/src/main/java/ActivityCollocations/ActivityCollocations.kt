package ActivityCollocations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phrasalverbs.R
import kotlinx.android.synthetic.main.activity_phrasal_verbs.*

class ActivityCollocations  : AppCompatActivity() {
    val  ListName1 = ArrayList<CollocationsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collocasions)
        val recycler = findViewById<RecyclerView>(R.id.RVCollocations)

        ListName1.add(CollocationsModel(
                "Time passes so fast", "Час летить так швидко"
            )
        )
        ListName1.add(CollocationsModel(
                "Take your time","Не поспішати"
            )
        )
        ListName1.add(CollocationsModel(
                "Capture one's heart","Закохати в себе, заполонити чиєсь серце"
            )
        )
        ListName1.add(CollocationsModel(
                "Be a catch","Знахідка"
            )
        )
        ListName1.add(CollocationsModel(
                "Catch on","Стати популярним, модним"
            )
        )


        ListName1.add(CollocationsModel(
                "An eye for an eye","Око за око"
            )
        )
        ListName1.add(CollocationsModel(
                "Keep your eyes peeled ","Пильнувати,бути на сторожі"
            )
        )
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = AdapterCollocations(this,ListName1)
    }
}
