package com.bignerdranch.android.geoquiz

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View                                // my Snackbar code uses this
import android.widget.Button
import com.google.android.material.snackbar.Snackbar    // imported Snackbar for Challenge Question

class MainActivity : AppCompatActivity() {

    // Button declarations from Chapter 1 GeoQuiz
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* The following code gets a reference to an inflated view by calling Activity.findViewById(Int) */
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        /* Pg 23: Setting OnClickListeners display text in response to the buttons being pressed */
        /* The below code is functional, I did it before watching the tutorial posted on BlackBoard for GeoQuiz
        trueButton.setOnClickListener { view: View ->
            Snackbar.make(trueButton,           // 1st arg: View        Using trueButton because on line 21 because it references the true_button view
            R.string.correct_toast,             // 2nd arg: Text        The text it needs to display; it's referencing our string in res/values/strings.xml
            Snackbar.LENGTH_SHORT).show()       // 3rd arg: Duration    Found on https://www.tutorialspoint.com/how-to-use-snackbar-in-android-kotlin
        }

        falseButton.setOnClickListener { view: View ->
            Snackbar.make(falseButton,          // 1st arg: View        Using falseButton variable because it references the false_button view
            R.string.incorrect_toast,           // 2nd arg: Text        The text it needs to display; it's referencing our string in res/values/strings.xml
            Snackbar.LENGTH_SHORT).show()       // 3rd arg: Duration    Found on https://www.tutorialspoint.com/how-to-use-snackbar-in-android-kotlin
        }*/


        // Snackbar code based on tutorial video
        trueButton.setOnClickListener {
            val snackBar = Snackbar.make(               // create a local variable called snackBar and set it equal to Snackbar.make()
                it,
                R.string.correct_toast,                 // Displays the correct_toast string from the resources folder
                Snackbar.LENGTH_LONG
            )
            snackBar.show()                             // Makes snackBar appear
            snackBar.setBackgroundTint(Color.GREEN)     // Makes snackBar background green
        }

        falseButton.setOnClickListener {
            val snackBar = Snackbar.make(               // create a local variable called snackBar and set it equal to Snackbar.make()
                    it,
                R.string.incorrect_toast,               // Displays the correct_toast string from the resources folder
                    Snackbar.LENGTH_LONG
                )
            snackBar.show()                             // Makes snackBar appear
            snackBar.setBackgroundTint(Color.RED)       // Makes snackBar background red
        }
    }
}