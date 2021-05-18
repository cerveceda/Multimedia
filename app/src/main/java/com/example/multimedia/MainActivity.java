package com.example.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //Declarar controles globales
    ImageButton btnPerro, btnGato;
    Button btnLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Leer datos
        btnPerro = (ImageButton)findViewById(R.id.btnPerro);
        btnGato = (ImageButton)findViewById(R.id.btnGato);
        btnLlamar = (Button)findViewById(R.id.btnLlamar);

        //Reproducir el mp3
        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ladrar();
            }
        });
        btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Maullar();
            }
        });
        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form2 = new Intent(MainActivity.this,Formulario2Activity.class);
                startActivity(form2);
            }
        });
    }

    private void Maullar() {
        MediaPlayer mpGato = MediaPlayer.create(MainActivity.this, R.raw.miau);
        mpGato.start();
    }

    private void Ladrar() {
        MediaPlayer mpPerro = MediaPlayer.create(MainActivity.this, R.raw.ladra);
        mpPerro.start();
    }
}