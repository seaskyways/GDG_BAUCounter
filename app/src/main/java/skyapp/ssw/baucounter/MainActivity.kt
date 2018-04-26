package skyapp.ssw.baucounter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count = 0
        set(value) {
            field = value
            counterTextView.text = count.toString()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countButton.setOnClickListener {
            count++
        }

        resetButton.setOnClickListener {
            count = 0
        }
    }
}
