package br.com.kely.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    //declaração atributo que será inicializado depois no OnCreate
    lateinit var texto : TextView

    //array de frases
    val frases = arrayOf(
        "Teste01",
        "Teste02",
        "Teste03",
        "Teste04",
        "Teste05"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inicialização do atributo
        texto = findViewById(R.id.textViewFrasesDia)

        //ou só esta declaração que já inicializa tambem
        //var texto = findViewById<TextView>(R.id.textViewFrasesDia)
    }

    //view parametro para retornar informaçoes do botao pelo metodo do Onclick
    fun gerarFrase(view : View){

        //pega o numero total de intens do array
        val totalIntensArrays = frases.size

        //pega as frases aleatorios
        val numeroAleatoriao = Random().nextInt(totalIntensArrays)

        texto.setText(frases[numeroAleatoriao])

    }

}
