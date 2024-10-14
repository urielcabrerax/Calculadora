package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText primernumer, segundonumero;
    TextView resultado;
    int n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        primernumer = findViewById(R.id.primernumero);
        segundonumero = findViewById(R.id.segundonumero);
        resultado = findViewById(R.id.resultado);


    }

    public void onClick(View view) {

        n1 = Integer.parseInt(primernumer.getText().toString());
        n2 = Integer.parseInt(segundonumero.getText().toString());
        int id = view.getId();
        if (id == R.id.btnsuma) {
            sumar();
        } else if (id == R.id.btnresta) {
            restar();
        } else if (id == R.id.btnmulti) {
            multiplicar();
        } else if (id == R.id.btndivi) {
            dividir();

        }
    }

    private void sumar() {
        int suma = n1 + n2;
        resultado.setText("El resultado de la suma es: "+suma);
    }

    private void restar() {
        int resta = n1 - n2;
        resultado.setText("El resultado de la resta es: "+resta);
    }

    private void multiplicar() {
        int multi = n1 * n2;
        resultado.setText("El resultado de la multiplicacion es: "+multi);
    }

    private void dividir() {
        int divi = n1 / n2;
        resultado.setText("El resultado de la division es: "+divi);
    }
}