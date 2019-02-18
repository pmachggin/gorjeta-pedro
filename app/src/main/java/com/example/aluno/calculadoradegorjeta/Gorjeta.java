package com.example.aluno.calculadoradegorjeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Gorjeta extends AppCompatActivity implements View.OnClickListener {

    private TextView txtTotal;
    private TextView txtGorjeta;
    private TextView ptGorjeta;
    private TextView ptTotal;
    private TextView ptValor;
    private TextView view;
    private SeekBar sbPorcentagem;
    private Button btCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorjeta);

        txtTotal = findViewById(R.id.txtTotal);
        view = findViewById(R.id.view);
        txtGorjeta = findViewById(R.id.txtGorjeta);
        ptGorjeta = findViewById(R.id.ptGorjeta);
        ptTotal = findViewById(R.id.ptTotal);
        ptValor = findViewById(R.id.ptValor);
        sbPorcentagem = findViewById(R.id.sbPorcentagem);
        btCalcular = findViewById(R.id.btCalcular);

        btCalcular.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        double resultado;
        double gorjeta;
        double valor;
        double porcentagem;

        valor = Double.parseDouble(ptValor.getText().toString());
        porcentagem = sbPorcentagem.getProgress();

        view.setText(porcentagem + "%");
        gorjeta = ((porcentagem / 100) * valor);
        resultado = gorjeta + valor;

        ptGorjeta.setText(gorjeta + "");
        ptTotal.setText(resultado + "");

    }
}
