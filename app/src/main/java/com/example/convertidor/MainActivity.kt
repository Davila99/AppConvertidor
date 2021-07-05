package com.example.convertidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    var cantidadConvertir: Double = 0.00;
    var resultadoConversion: Double = 0.00;
    val MilemetrosACemtimetros: String = "Centimetros";
    val MilemetrosAMetros: String = "Metros";
    val MilemetrosAkilometros: String = "Kilometros";
    val conversionAMilimetros: String = "Milimetros";
    var comentarioSalida = "";
    fun Calcular(view: View) {
        var radio1 = findViewById<RadioButton>(R.id.idMilemetrosACemtimetros)
        var radio2 = findViewById<RadioButton>(R.id.idMilemetrosAMetros)
        var radio3 = findViewById<RadioButton>(R.id.idMilemetrosAkilometros)
        var radio4 = findViewById<RadioButton>(R.id.idcentimetrosAMilimetros)
        var radio5 = findViewById<RadioButton>(R.id.idmetrosAMilimetros)
        var radio6 = findViewById<RadioButton>(R.id.idkilometrosAMilimetros)
        PedirDatosDeConversion();
        if (radio1.isChecked == true) {
            comentarioSalida = MilemetrosACemtimetros;
            convertidorMMaCM();
            mostraReultados();
        } else if (radio2.isChecked == true) {
            comentarioSalida = MilemetrosAMetros;
            convertidorMMaMT();
            mostraReultados();
        } else if (radio3.isChecked == true) {
            comentarioSalida = MilemetrosAkilometros;
            convertidorMMaKM();
            mostraReultados();
        } else if (radio4.isChecked == true) {
            comentarioSalida = conversionAMilimetros;
            convertidorCMaMM();
            mostraReultados();
        } else if (radio5.isChecked == true) {
            comentarioSalida = conversionAMilimetros;
            convertidorMTaMM();
            mostraReultados();
        } else if (radio6.isChecked == true) {
            comentarioSalida = conversionAMilimetros;
            convertidorKMaMM();
            mostraReultados();
        }

    }

    fun mostraReultados() {

        var Result = findViewById<EditText>(R.id.etResult)
        Result.setText(resultadoConversion.toString() + "  $comentarioSalida");
    }

    fun PedirDatosDeConversion() {
        var cantidad = findViewById<EditText>(R.id.etOpcionDeConversion).text.toString()
        cantidadConvertir = cantidad!!.toDouble();
    }

    fun convertidorMMaCM() {
        PedirDatosDeConversion();
        resultadoConversion = cantidadConvertir / 10;

    }

    fun convertidorMMaMT() {
        PedirDatosDeConversion();
        resultadoConversion = cantidadConvertir / 1000;

    }

    fun convertidorMMaKM() {
        PedirDatosDeConversion();
        resultadoConversion = cantidadConvertir / 1000000;
    }

    fun convertidorCMaMM() {
        PedirDatosDeConversion();
        resultadoConversion = cantidadConvertir * 10;
    }

    fun convertidorMTaMM() {
        PedirDatosDeConversion();
        resultadoConversion = cantidadConvertir * 1000;

    }

    fun convertidorKMaMM() {
        PedirDatosDeConversion();
        resultadoConversion = cantidadConvertir * 1000000;

    }
}