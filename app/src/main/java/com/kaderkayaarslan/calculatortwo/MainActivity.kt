package com.kaderkayaarslan.calculatortwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun myHat(view: View) {
         number1 = editTextNumber.text.toString().toIntOrNull()
         number2 = editTextNumber2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            resuldText.text = "error!"
        } else{
            result = number1!! + number2!!
            resuldText.text = "result: $result"
        }


    }
    fun myIss(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            resuldText.text = "error!"
        } else{
            result = number1!! - number2!!
            resuldText.text = "result: $result"
        }

    }
    fun myMult(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            resuldText.text = "error!"
        } else{
            result = number1!! * number2!!
            resuldText.text = "result: $result"
        }

    }
    fun myPart(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null) {
            resuldText.text = "error!"
        } else{
            result = number1!! / number2!!
            resuldText.text = "result: $result"
        }

    }
}