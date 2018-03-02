package com.example.hp.music;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kennyg extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kennyg);
        Button btn = (Button) findViewById(R.id.btn1);
        Button btnPause = (Button) findViewById(R.id.pause);
        Button intentdiab = (Button) findViewById(R.id.intent1);
        Button intentadele = (Button) findViewById(R.id.intent2);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.kng);
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
        intentdiab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kennyg.this, Amrdiab.class);
                startActivity(intent);
            }
        });
        intentadele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kennyg.this, Adele.class);
                startActivity(intent);
            }
        });
    }
}
