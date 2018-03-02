package com.example.hp.music;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Amrdiab extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amrdiab);
        Button btn = (Button) findViewById(R.id.btn2);
        Button btnPause = (Button) findViewById(R.id.pause);
        Button intentadele = (Button) findViewById(R.id.intent1);
        Button intentkenny = (Button) findViewById(R.id.intent2);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.diab);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
        intentadele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Amrdiab.this, Adele.class);
                startActivity(intent);
            }
        });
        intentkenny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Amrdiab.this, Kennyg.class);
                startActivity(intent);
            }
        });
    }
}
