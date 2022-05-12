package com.example.sorteiopremio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num;
    private Button btnSorteio;
    private TextView txtSorteio;
    private String premio[] = {"Carro", "Moto", "Casa", "Ventilador", "R$ 1.000",
                               "R$ 2.000", "R$ 100.000", "Apartamento", "Viagem", "Smartphone"};

    public void Sorteio(View view){
        num = new Random().nextInt(9);
        txtSorteio.setText("Seu prêmio é: " +premio[num]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSorteio = findViewById(R.id.btnSorteio);
        txtSorteio = findViewById(R.id.txtSorteio);


    }



}