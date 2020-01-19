package ActivityCollocations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.phrasalverbs.R
import kotlinx.android.synthetic.main.activity_collocasions.*

class ActivityCollocations  : AppCompatActivity() {
    val  ListName1 = ArrayList<CollocationsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collocasions)

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
        RVCollocations.layoutManager = LinearLayoutManager(this)
        RVCollocations.adapter = AdapterCollocations(this,ListName1)
    }
}
