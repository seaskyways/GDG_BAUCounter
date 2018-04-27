package skyapp.ssw.baucounter

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*


class MainActivity : AppCompatActivity() {

    var count = 0
        get() {
            return field
        }
        set(value) {
            field = value
            counterTextView.text = value.toString()

            val currentMessage = messageList.find { it.count == value }
            if (currentMessage != null) {
                AlertDialog.Builder(this)
                        .setMessage(currentMessage.message)
                        .setTitle("FOUND !!!!!")
                        .show()
            }
        }

    val messageList = mutableListOf<Message>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)


        // Anko : Android Kotlin


        verticalLayout {
            linearLayout {
                textView {
                    text = "Counter :"
                    textSize = sp(40).toFloat()
                }.lparams {
                    weight = 1f
                }

                textView {
                    text = "0"
                }.lparams(width = wrapContent)
            }

            linearLayout {
                val messageText = editText {
                    hint = "Message"
                }
                editText {

                }
            }



            linearLayout {
                button("COUNT UP") {

                    setOnClickListener {

                    }
                }
            }


        }

//
//        countButton.setOnClickListener {
//            count++
//        }
//
//        resetButton.setOnClickListener {
//            messageList.clear()
//            count = 0
//        }
//
//        saveButton.setOnClickListener {
//            val messageText = messageInput.text.toString()
//            val count: Int? = countInput.text.toString().toIntOrNull()
//
//            if (messageText.isBlank()) {
//                showToast("Please enter a valid message")
//                return@setOnClickListener
//            }
//
//            if (count == null) {
//                Toast.makeText(this, "Please enter a valid count", Toast.LENGTH_LONG)
//                        .show()
//                return@setOnClickListener
//            }
//
//            val message = Message(count, messageText)
//
//            if (messageList.any { it.count == count }) {
//                Toast.makeText(this, "This count already has a message", Toast.LENGTH_LONG)
//                        .show()
//                return@setOnClickListener
//            }
//
//            messageList.add(message)
//
//        }
    }

}
