package com.example.jogosdeazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.NumberKeyListener;
import android.text.method.TextKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View v){
        TextView texto = findViewById(R.id.textoResultado);
        EditText sorteioUnit = findViewById(R.id.editTextNumber);
        String sorteioUnitValue = sorteioUnit.getText().toString();

        EditText sorteioQty = findViewById(R.id.sorteioQty);
        String sorteioQtyValue = sorteioQty.getText().toString();

        Sorteio sorteio = new Sorteio(Integer.parseInt(sorteioUnitValue),new int[Integer.parseInt(sorteioQtyValue)]);



        for (int i = 0; i < Integer.parseInt(sorteioQtyValue); i++) {
        sorteio.randomCombination();

        }

        System.out.println(sorteioUnitValue);

    }
}