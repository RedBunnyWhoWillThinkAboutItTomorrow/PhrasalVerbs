package com.example.phrasalverbs.MainScreen.Professions

import com.example.phrasalverbs.MainScreen.ActivityPhrasalVerbs.PhrasalVerbsModel
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.phrasalverbs.R
import com.example.phrasalverbs.MainScreen.ActivityPhrasalVerbs.AdapterActivityPhrasalVerbs
import kotlinx.android.synthetic.main.activity_professions.*


class ActivityProfessions: AppCompatActivity(){
    val  ListName = ArrayList<PhrasalVerbsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_professions)


        ListName.add(
            PhrasalVerbsModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfRJv0YqHwXOG1_eBlgt9BfDpkvRQDkLcp-RZDMkRFdjYiyKZCfA&s","Accountant")
        )
        ListName.add(
            PhrasalVerbsModel("https://i.pinimg.com/originals/3d/45/81/3d4581b40937f1aa5824c51660b0ff27.jpg","Architect ")
        )
        ListName.add(
            PhrasalVerbsModel("https://png.pngtree.com/png-vector/20191128/ourlarge/pngtree-baker-making-bread-illustration-vector-on-white-background-png-image_2051986.jpg","Baker")
        )
        ListName.add(
            PhrasalVerbsModel("https://pngimage.net/wp-content/uploads/2018/05/butcher-png-4.png","Butcher")
        )
        ListName.add(
            PhrasalVerbsModel("https://png.pngtree.com/png-clipart/20190516/original/pngtree-fisherman-fishermen-fishing-fishing-png-image_3935733.jpg","Fisherman")
        )
        ListName.add(
            PhrasalVerbsModel("https://images.vexels.com/media/users/3/129128/isolated/preview/f6292a20a08ebfde182cf60042a97c14-dibujos-animados-de-jardinero-joven-by-vexels.png","Gardener")
        )
        ListName.add(
            PhrasalVerbsModel("https://banner2.cleanpng.com/20180721/xot/kisspng-hairdresser-hairstyle-royalty-free-stock-photograp-l-enfant-cafebar-5b53344af0dd17.6326821315321795309866.jpg","Hairdresser")
        )
        ListName.add(
            PhrasalVerbsModel("https://img.pngio.com/album-cartoon-kid-scientist-free-transparent-png-download-pngkey-kid-scientist-png-820_880.png","Scientist ")
        )
        ListName.add(
            PhrasalVerbsModel("https://pngimage.net/wp-content/uploads/2018/06/shop-assistant-png-1.png","Shop assistant")
        )
        ListName.add(
            PhrasalVerbsModel("https://i7.pngguru.com/preview/110/325/247/mother-housewife-stay-at-home-dad-woman-mother.jpg","Housewife")
        )

        RVProfessions.layoutManager = LinearLayoutManager(this)
        RVProfessions.adapter = AdapterActivityPhrasalVerbs(this,ListName)
    }
}