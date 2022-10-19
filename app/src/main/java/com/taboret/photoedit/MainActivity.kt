package com.taboret.photoedit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mImageView = findViewById<ImageView>(R.id.image_view_1)
        val mEditText = findViewById<EditText>(R.id.edit_text_1)
        val mButton = findViewById<Button>(R.id.button_1)

        // When button is clicked
        mButton.setOnClickListener {
            // EditText value is converted to
            // float and rotation is applied
            if (mEditText.text.isNotEmpty()) {
                val mAngleRotate = (mEditText.text.toString() + "f").toFloat()
                mImageView.rotation = mAngleRotate
            } else {
                Toast.makeText(applicationContext, "Field cannot be empty", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}