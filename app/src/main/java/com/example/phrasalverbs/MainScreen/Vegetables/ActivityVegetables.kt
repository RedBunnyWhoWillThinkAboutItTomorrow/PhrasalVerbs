package  com.example.phrasalverbs.MainScreen.Fruits

import com.example.phrasalverbs.MainScreen.ActivityPhrasalVerbs.PhrasalVerbsModel
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.phrasalverbs.R
import com.example.phrasalverbs.MainScreen.ActivityPhrasalVerbs.AdapterActivityPhrasalVerbs
import kotlinx.android.synthetic.main.activity_vegetables.*


class ActivityVegetables: AppCompatActivity(){
    val  ListName = ArrayList<PhrasalVerbsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetables)


        ListName.add(
            PhrasalVerbsModel("https://banner2.cleanpng.com/20180528/clv/kisspng-asparagus-raw-foodism-health-vegetable-watercolor-vegetables-5b0c0705662322.4305454015275148854184.jpg","Asparagus")
        )
        ListName.add(
            PhrasalVerbsModel("https://png.pngtree.com/png_detail/20181017/lettuce-png-clipart_1351834.png","Lettuce")
        )
        ListName.add(
            PhrasalVerbsModel("https://purepng.com/public/uploads/large/purepng.com-fresh-eggplantvegetables-brinjal-eggplant-melongene-garden-egg-guinea-squash-941524723819i8s2v.png","Eggplant")
        )
        ListName.add(
            PhrasalVerbsModel("https://www.stickpng.com/assets/images/585ea348cb11b227491c3513.png","Artichoke")
        )
        ListName.add(
            PhrasalVerbsModel("https://www.jessicagavin.com/wp-content/uploads/2019/09/types-of-garlic-1-600x900.jpg","Garlic")
        )
        ListName.add(
            PhrasalVerbsModel("https://target.scene7.com/is/image/Target/GUEST_28e240ec-dde9-4523-8d67-c3d14fdeb185?wid=488&hei=488&fmt=pjpeg","Bell pepper")
        )
        ListName.add(
            PhrasalVerbsModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9jleUQfzLJFrSjejavw0rdFczssaJl2DV-S7wV1tOWhnUC7XU&s","Beet")
        )
        ListName.add(
            PhrasalVerbsModel("https://i.pinimg.com/474x/83/9a/ef/839aefdd04ca38a62914e95c7e5c7fa1--food-clipart-fruits-and-vegetables.jpg","Broccoli")
        )
        ListName.add(
            PhrasalVerbsModel("https://img.pngio.com/leek-png-30-collection-leek-png-1080_803.png","Leek")
        )
        ListName.add(
            PhrasalVerbsModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxuz72ftiKpgn5-e9i_nnfGpxDnu4SZvOPv1CDZUGEPDV-SlPE&s","Turnip")
        )

        RVVegetables.layoutManager = LinearLayoutManager(this)
        RVVegetables.adapter = AdapterActivityPhrasalVerbs(this,ListName)
    }
}