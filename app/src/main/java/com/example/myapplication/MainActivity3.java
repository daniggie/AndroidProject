package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView resultadoMedia = (TextView) findViewById(R.id.resultadoMedia);
        Intent it = getIntent();

        Double soma;
        if(it != null){
            Bundle params = it.getExtras();
            if (params!= null){
                soma = params.getDouble("nota1") +
                        params.getDouble("nota2") +
                        params.getDouble("nota3") +
                        params.getDouble("nota4");
                resultadoMedia.setText(soma.toString());
            }
        }
    }

    @Override
    public void onClick(View v) {

    }
}
