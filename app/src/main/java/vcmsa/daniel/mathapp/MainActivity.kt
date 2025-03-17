package vcmsa.daniel.mathapp

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
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

    val firstValue = findViewById<EditText>(R.id.firstValue)
    val calculation = findViewById<Button>(R.id.calculation)
    val secondValue = findViewById<EditText>(R.id.secondValue)
    val totalValue = findViewById<EditText>(R.id.totalValue)

    calculation.setOnClickListener {

        var firstNumber = Integer.parseInt(firstValue.text.toString())
        var secondNumber = Integer.parseInt(secondValue.text.toString())

        var total = firstNumber + secondNumber

        var answer = "Your answer is : " + total.toString()
        Toast.makeText(this@MainActivity, answer, Toast.LENGTH_SHORT).show()
        val editable: Editable = totalValue.text as Editable
        editable.append(" Your answer is : ")
        editable.append(total.toString())
    }
}
}