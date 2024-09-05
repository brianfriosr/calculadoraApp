package com.example.calculadora_tutoria_mananas;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Paso 2: Declarar e inicializar variables:
        //Inicializar numero 1
        EditText etNumero1 = findViewById(R.id.etNumber1);
        //Inicializar numero 2
        EditText etNumero2 = findViewById(R.id.etNumber2);
        //Paso 3: Inicializar Botón Sumar:
        Button btnSumar = findViewById(R.id.btnSumar);
        //Inicializar Botón Restar:
        Button btnRestar = findViewById(R.id.btnRestar);
        //Inicializar Botón Multiplicar:
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        //Inicializar Botón Dividir:
        Button btnDividir = findViewById(R.id.btnDividir);
        //Inicializar TextView Resultado:
        TextView txtViewResultado = findViewById(R.id.txtViewResult);

        //Paso 4: SetOnClickListener de Boton Sumar:

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Se obtiene lo que hay en el edit text numero 1 y se convierte a double
                String strNumero1  = etNumero1.getText().toString();
                // Se convierte la variable strNumero1 a Double:
                double numero1 = Double.parseDouble(strNumero1);

                //Se obtiene lo que hay en el edit text numero 1 y se convierte a double
                String strNumero2  = etNumero2.getText().toString();
                double numero2 = Double.parseDouble(strNumero2);

                //Paso 5: Se utliza el metodo suma() que se creo para realiza la suma:
                double resultado = sumar(numero1, numero2);

                //Convertimos el resultado a string y a textp:
                String strResultado = String.valueOf(resultado);
                Log.i("El resultado es", strResultado);

                //Colocar variable strResultado en el textView:
                txtViewResultado.setText(strResultado);

            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Se obtiene lo que hay en el edit text numero 1 y se convierte a double
                String strNumero1  = etNumero1.getText().toString();
                // Se convierte la variable strNumero1 a Double:
                double numero1 = Double.parseDouble(strNumero1);

                //Se obtiene lo que hay en el edit text numero 1 y se convierte a double
                String strNumero2  = etNumero2.getText().toString();
                double numero2 = Double.parseDouble(strNumero2);

                //Paso 5: Se utliza el metodo restar() que se creo para realiza la resta:
                double resultado = restar(numero1, numero2);

                //Convertimos el resultado a string y a textp:
                String strResultado = String.valueOf(resultado);

                //Colocar variable strResultado en el textView:
                txtViewResultado.setText(strResultado);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNumero1 = etNumero1.getText().toString();
                double numero1 = Double.parseDouble(strNumero1);

                String strNumero2 = etNumero2.getText().toString();
                double numero2 = Double.parseDouble(strNumero2);

                double resultado = multiplicar(numero1, numero2);

                String strResultado = String.valueOf(resultado);

                txtViewResultado.setText(strResultado);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNumero1 = etNumero1.getText().toString();
                double numero1 = Double.parseDouble(strNumero1);

                String strNumero2 = etNumero2.getText().toString();
                double numero2 = Double.parseDouble(strNumero2);

                double resultado = dividir(numero1, numero2);

                String strResultado = String.valueOf(resultado);

                txtViewResultado.setText(strResultado);
            }
        });

    }

    //Paso 1: se crea el metodo suma:
    public static double sumar(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }

    //Paso 1: se crea el metodo resta:
    public static double restar(double numero1, double numero2){
        double resultado = numero1 - numero2;
        return resultado;
    }

    // Paso 1: se crea el metodo multiplicacion:
    public static double multiplicar(double numero1, double numero2){
        double resultado = numero1 * numero2;
        return resultado;
    }

    // Paso 1: se crea el metodo division:
    public static double dividir(double numero1, double numero2){
        double resultado = numero1 / numero2;
        return resultado;
    }

}