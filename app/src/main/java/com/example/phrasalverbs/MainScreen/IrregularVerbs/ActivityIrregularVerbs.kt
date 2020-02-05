package com.example.phrasalverbs.MainScreen.IrregularVerbs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phrasalverbs.MainScreen.IrregularVerbs.AdapterIrregularVerbs
import com.example.phrasalverbs.MainScreen.IrregularVerbs.IrregularVerbsModel
import com.example.phrasalverbs.R
import kotlinx.android.synthetic.main.activiry_irregular_verbs.*
import kotlinx.android.synthetic.main.item_activity_irregular_verbs.*

class ActivityIrregularVerbs  : AppCompatActivity() {
        val  ListName2 = ArrayList<IrregularVerbsModel>()
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activiry_irregular_verbs)


            ListName2.add(
                IrregularVerbsModel("Be", "was/were", "Been"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Become", "Became", "Become"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Begin", "Began", "Begun"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Bite", "Bit", "Bitten"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Blow", "Blew", "Blown"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Break", "Broke", "Broken"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Bring", "Brought", "Brought"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Build", "Built", "Built"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Buy", "Bought", "Bought"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Catch", "Caught", "Caught"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Choose", "Chose", "Chosen"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Come", "Came", "Come"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Cost", "Cost", "Cost"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Cut", "Cut", "Cut"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Do", "Did", "Done"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Draw", "Drew", "Drawn"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Drive", "Drove", "Driven"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Drink", "Drank", "Drunk"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Eat", "Ate", "Eaten"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Fall", "Fell", "Fallen"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Feel", "Felt", "Felt"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Find", "Found", "Found"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Fly", "Flew", "Flown"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Forget", "Forgot", "Forgotten"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Forgive", "Forgave", "Forgiven"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Get", "Got", "Got"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Give", "Gave", "Given"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Go", "Went", "Gone"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Grow", "Grew", "Grown"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Hang", "Hung", "Hung"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Have", "Had", "Had"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Hear", "Heard", "Heard"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Hide", "Hid", "Hidden"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Hit", "Hit", "Hit"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Hold", "Held", "Held"
                )
            )
            ListName2.add(
                    IrregularVerbsModel("Hurt", "Hurt", "Hurt"
                    )
                    )
            ListName2.add(
                IrregularVerbsModel("Keep", "Kept", "Kept"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Know", "Knew", "Known"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Lay", "Laid", "Laid"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Learn", "Learnt", "Learnt"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Leave", "Left", "Left"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Lend", "Lent", "Lent"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Let", "Let", "Let"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Lose", "Lost", "Lost"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Make", "Made", "Made"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Mean", "Meant", "Meant"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Meet", "Met", "Met"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Mistake", "Mistook", "Mistaken"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Pay", "Paid", "Paid"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Put", "Put", "Put"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Read", "Read", "Read"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Ride", "Rode", "Ridden"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Ring", "Rang", "Rung"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Rise", "Rose", "Risen"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Run", "Ran", "Run"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Say", "Said", "Said"
                )
            )
            ListName2.add(
                IrregularVerbsModel("See", "Saw", "Seen"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Sell", "Sold", "Sold"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Send", "Sent", "Sent"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Set", "Set", "Set"
                )
            )
            ListName2.add(
                    IrregularVerbsModel("Shake", "Shook", "Shaken"
                    )
                    )
            ListName2.add(
                IrregularVerbsModel("Show", "Showed", "Shown"
                )
            )

            ListName2.add(
                IrregularVerbsModel("Shut", "Shut", "Shut"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Sing", "Sang", "Sung"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Sink", "Sank", "Sunk"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Sit", "Sat", "Sat"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Sleep", "Slept", "Slept"
                )
            )
            ListName2.add(
                    IrregularVerbsModel("Speak", "Spoke", "Spoken"
                    )
                    )
            ListName2.add(
                    IrregularVerbsModel("Spend", "Spent", "Spent"
                    )
                    )
            ListName2.add(
                IrregularVerbsModel("Spread", "Spread", "Spread"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Stand", "Stood", "Stood"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Steal", "Stole", "Stolen"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Stick", "Stuck", "Sttuck"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Sweep", "Swept", "Swept"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Swim", "Swam", "Swum"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Take", "Took", "Taken"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Teach", "Taught", "Taught"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Tear", "Tore", "Torn"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Tell", "Told", "Told"
                )
            )

            ListName2.add(
                IrregularVerbsModel("Think", "Thought", "Thought"
                )
            )
            ListName2.add(
                    IrregularVerbsModel("Throw", "Threw", "Thrown"
                    )
                    )
            ListName2.add(
                IrregularVerbsModel("Understand", "Understood", "Understood"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Wake", "Woke", "Woken"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Wear", "Wore", "Worn"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Win", "Won", "Won"
                )
            )
            ListName2.add(
                IrregularVerbsModel("Write", "Wrote", "Written"
                )
            )
            //     val RVIrregularVerbs = findViewById(R.id.RVIrregularVerbs_item) as RecyclerView
            RVIrregularVerbs.layoutManager = LinearLayoutManager(this)
            RVIrregularVerbs.adapter = AdapterIrregularVerbs(this,ListName2)
        }
    }

