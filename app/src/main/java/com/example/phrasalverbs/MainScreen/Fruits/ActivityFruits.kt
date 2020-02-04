package com.example.phrasalverbs.MainScreen.Fruits

import com.example.phrasalverbs.MainScreen.ActivityPhrasalVerbs.PhrasalVerbsModel
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.phrasalverbs.R
import com.example.phrasalverbs.MainScreen.ActivityPhrasalVerbs.AdapterActivityPhrasalVerbs
import kotlinx.android.synthetic.main.activity_fruits.*


class ActivityFruits: AppCompatActivity(){
    val  ListName = ArrayList<PhrasalVerbsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)


        ListName.add(
            PhrasalVerbsModel("https://previews.123rf.com/images/mochipet/mochipet1706/mochipet170600036/79523327-vector-illustration-in-flat-style-two-red-sweet-cherry-berries-connected-by-a-stem-healthy-vegetaria.jpg","Sweet cherry")
        )
                ListName.add(
            PhrasalVerbsModel("https://james-mcintyre.co.uk/wp-content/uploads/2018/08/Redcurrant_JVT.jpg","Red currant")
        )
        ListName.add(
            PhrasalVerbsModel("https://i0.wp.com/www.officefruit.ie/wp-content/uploads/2016/06/raspberries.jpg?fit=1600%2C1067&ssl=1","Raspberry")
        )
                 ListName.add(
            PhrasalVerbsModel("https://previews.123rf.com/images/khumthong/khumthong1807/khumthong180700011/105588709-coconut-fruit-isolated-on-white-clipping-path-.jpg","Coconut")
        )
                 ListName.add(
            PhrasalVerbsModel("https://images-na.ssl-images-amazon.com/images/I/51UA3iZnm9L._SX425_.jpg","Cranberry")
        )
                ListName.add(
            PhrasalVerbsModel("https://www.hamiast.com/image/cache/catalog/Dry_Fruits_and_Nuts/walnut_snow_white_with_shell_HP.DN.0003_Hamiast_1-1000x1000.jpg","Walnut")
        )
               ListName.add(
            PhrasalVerbsModel("https://cdn2.stylecraze.com/wp-content/uploads/2013/04/Skin-benefits-of-Tangerine2.jpg","Tangerine")
        )
                 ListName.add(
            PhrasalVerbsModel("https://images-na.ssl-images-amazon.com/images/I/71Po-voRFAL._SY355_.jpg","Gooseberry")
        )
        ListName.add(
            PhrasalVerbsModel(
                "https://i.pinimg.com/originals/ce/8c/bc/ce8cbce42c094c1fa6a72b511bb9ce00.jpg",
                "Hazel-nut"
            )
        )

        RVFruits.layoutManager = LinearLayoutManager(this)
        RVFruits.adapter = AdapterActivityPhrasalVerbs(this,ListName)
    }
}