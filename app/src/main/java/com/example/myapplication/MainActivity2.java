package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnMedia = (Button)  findViewById(R.id.btnMedia);
        btnMedia.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this,MainActivity3.class);
        Bundle params = new Bundle();
        EditText nota1 = (EditText) findViewById(R.id.editTextNota1);
        EditText nota2 = (EditText) findViewById(R.id.editTextNota2);
        EditText nota3 = (EditText) findViewById(R.id.editTextNota3);
        EditText nota4 = (EditText) findViewById(R.id.editTextNota4);

        params.putString("nota1", nota1.getText().toString());
        params.putString("nota2", nota2.getText().toString());
        params.putString("nota3", nota3.getText().toString());
        params.putString("nota4", nota4.getText().toString());
        it.putExtras(params);

        startActivity(it);
    }
}
