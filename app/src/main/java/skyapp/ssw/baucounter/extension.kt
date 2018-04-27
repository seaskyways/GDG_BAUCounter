package skyapp.ssw.baucounter

import android.widget.Toast

fun MainActivity.showToast(text: String, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, text, duration)
            .show()
}