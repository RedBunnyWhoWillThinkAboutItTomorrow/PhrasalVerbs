package com.example.phrasalverbs.MainScreen.ActivityCollocations

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
                "Keep your eyes peeled ","Пильнувати, бути на сторожі"
            )
        )
        ListName1.add(CollocationsModel(
            "Catch someone's eye ","Привернути увагу, привабити око"
        )
        )
        ListName1.add(CollocationsModel(
            "Give someone up ","Відпустити людину"
        )
        )
        ListName1.add(CollocationsModel(
            "Happy as a clam ","Щаслива,як слон"
        )
        )
        ListName1.add(CollocationsModel(
            "Give a shot ","Дати шанс чомусь"
        )
        )
        ListName1.add(
            CollocationsModel(
                "Love you bunches ", "Люблю більше,ніж можу сказати"
            )
        )
        ListName1.add(CollocationsModel(
            "Go with something ","Підходити,пасувати"
        )
        )
        ListName1.add(CollocationsModel(
            "Run out of ","Закінчуватися"
        )
        )
        ListName1.add(CollocationsModel(
            "Catch sight of someone ","Несподівано когось побачити"
        )
        )
        ListName1.add(CollocationsModel(
            "A catch 22 situation ","Безвихідна ситуація"
        )
        )
        ListName1.add(CollocationsModel(
            "Keep for a rainy day ","Відкладати щось"
        )
        )
        ListName1.add(CollocationsModel(
            "I'm down ","Погоджуємось з чимось"
        )
        )
        ListName1.add(CollocationsModel(
            "Wake up and smell the coffee ","Зніми рожеві окуляри"
        )
        )
        ListName1.add(CollocationsModel(
            "First and foremost ","Перш за все"
        )
        )
        ListName1.add(CollocationsModel(
            "At first glance","На перший погляд"
        )
        )
        ListName1.add(CollocationsModel(
            "Wrap up something ","Закінчувати щось"
        )
        )
        RVCollocations.layoutManager = LinearLayoutManager(this)
        RVCollocations.adapter = AdapterCollocations(this,ListName1)
    }
}
