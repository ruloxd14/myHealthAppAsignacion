package raul.molina.myhealthapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso: EditText = findViewById(R.id.weight) as EditText
        val altura: EditText = findViewById(R.id.height) as EditText
        val calcular: Button = findViewById(R.id.calculate) as Button
        val imc: TextView = findViewById(R.id.imc) as TextView
        val rango: TextView = findViewById(R.id.range) as TextView

        calcular.setOnClickListener {
            var p: Float = peso.text.toString().toFloat()
            var a: Float = altura.text.toString().toFloat()

            var imc2: Float = p/(a*a)

            imc.setText(""+imc2+"")

            if(imc2<18.5){
                //rango.setBackgroundColor(Color.greenish)
                rango.setBackgroundResource(R.color.greenish)
            }else if(imc2>=18.5 || imc2<=24.9){
               //rango.setBackgroundColor(R.color.green)
                rango.setBackgroundResource(R.color.green)
            }else if(imc2>=25 || imc2<=29.9){
                //rango.setBackgroundColor(R.color.yellow)
                rango.setBackgroundResource(R.color.yellow)
            }else if(imc2>=30 || imc2<=39.9){
                //rango.setBackgroundColor(R.color.orange)
                rango.setBackgroundResource(R.color.orange)
            }else if(imc2>=40){
                //rango.setBackgroundColor(R.color.red)
                rango.setBackgroundResource(R.color.red)
            }


        }

    }
}
