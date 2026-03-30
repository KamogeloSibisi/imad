//Author: Kamogelo Sibisi
//Student number :ST10523931
//Social sparks assessment
package za.ac.iie.example.formative1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.trackPipAnimationHintView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Declarations
        val etTimeOfDay = findViewById<EditText>(R.id.etTimeOfDay)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnCheck = findViewById<Button>(R.id.btnCheck)
        val btnReset = findViewById<Button>(R.id.btnReset)
        // logic for what happens if the user types in these times of the day
        btnCheck.setOnClickListener {
            // Kotlin if-else logic explained by Kotlin Programming Language (2026)
            // Reference: Kotlin Programming Language. (2026). Conditions and Loops.
            // Available at: https://kotlinlang.org/docs/control-flow.html [Accessed 26 March 2026]
            // Beginner-friendly if-else examples from W3Schools (n.d.)
            // Reference: W3Schools. (n.d.). Kotlin If … Else Expressions.
            // Available at: https://www.w3schools.com/kotlin/kotlin_conditions.php [Accessed 26 March 2026]
            // Nested if-else expression explained by GeeksforGeeks (2025)
            // Reference: GeeksforGeeks. (2025). Kotlin if-else Expression.
            // Available at: https://www.geeksforgeeks.org/kotlin-if-else-expression [Accessed 25 March 2026]

            val timeOfDay = etTimeOfDay.text.toString().lowercase()
            var output: String
            if (timeOfDay == "morning") {
                output = "Send a good morning text."
                tvResult.text = output}
            else {
                if (timeOfDay == "mid-morning") {
                    output = "Reach out to a colleague with a quick thank you"
                    tvResult.text = output}
                else {
                    if (timeOfDay == "afternoon") {
                        output = " Share a funny meme or an interesting link to a friend"
                        tvResult.text = output}
                    else {
                        if (timeOfDay == "afternoon Snack Time") {
                            output = "Send a quick 'thinking of you' message"
                            tvResult.text = output}
                        else {
                            if (timeOfDay == "dinner") {
                                output = "Call a friend or relative for a 5-minute catch-up"
                                tvResult.text = output}
                            else {
                                if (timeOfDay == "after dinner" || timeOfDay == "night") {
                                        output = "Leave a thoughtful comment on a friend's post"
                                    tvResult.text = output}
                                else {
                                        output = "Error, you have entered an invalid time of day." // the error handling message
                                        tvResult.text = output}
                            }
                        }
                    }
                }
            }
        }
        // Reset button is inspired by Android Developers (n.d.)
btnReset.setOnClickListener {
    etTimeOfDay.text.clear() // the reset button to clear the user input and the output
    tvResult.text = ""
}
    }
}





