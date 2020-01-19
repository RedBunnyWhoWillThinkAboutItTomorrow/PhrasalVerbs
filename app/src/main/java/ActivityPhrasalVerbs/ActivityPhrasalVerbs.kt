package ActivityPhrasalVerbs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.phrasalverbs.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_phrasal_verbs.*

class ActivityPhrasalVerbs : AppCompatActivity() {
    val  ListName = ArrayList<PhrasalVerbsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrasal_verbs)


        ListName.add(
            PhrasalVerbsModel("https://media.istockphoto.com/vectors/senior-male-ideas-come-up-with-vector-id951465252","Come up with")
        )
        ListName.add(
            PhrasalVerbsModel("https://www.wikihow.com/images/thumb/1/14/Balance-Work-and-Family-Step-14.jpg/aid129756-v4-728px-Balance-Work-and-Family-Step-14.jpg","Hang out")
        )
        ListName.add(
            PhrasalVerbsModel("https://image.shutterstock.com/image-illustration/fire-extinguisher-bitmap-copy-260nw-282149468.jpg","Put out")
        )
        ListName.add(
            PhrasalVerbsModel("https://scotthallremodeling.com/wp-content/uploads/2015/07/moved.jpg","Move out")
        )
        ListName.add(
            PhrasalVerbsModel("https://image.shutterstock.com/image-vector/friends-sit-cafe-drink-coffee-260nw-1008306112.jpg","Eat out")
        )
        ListName.add(
            PhrasalVerbsModel("https://cdn.mindful.org/smookler-fallapart.jpg?q=80&fm=jpg&fit=crop&w=1400&h=875","Fall apart")
        )
        ListName.add(
            PhrasalVerbsModel("https://t3.rbxcdn.com/c62f0b678ff403cdf32ebf7daa4a9c48","Fall down")
        )
        ListName.add(
            PhrasalVerbsModel("https://cdn2.vectorstock.com/i/1000x1000/86/21/ophthalmologist-point-out-to-eyesight-check-table-vector-15488621.jpg","Point out")
        )
        RVActivityPhrasalVerbs.layoutManager = LinearLayoutManager(this)
        RVActivityPhrasalVerbs.adapter = AdapterActivityPhrasalVerbs(this,ListName)
    }
}
