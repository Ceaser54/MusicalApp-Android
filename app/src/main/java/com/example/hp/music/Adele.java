package com.example.hp.music;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adele extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adele);
        Button btn = (Button) findViewById(R.id.btn3);
        Button btnPause = (Button) findViewById(R.id.pause);
        Button intent1 = (Button) findViewById(R.id.intentdiab);
        Button intent2 = (Button) findViewById(R.id.intentkenny);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.adele);
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
        intent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adele.this, Amrdiab.class);
                startActivity(intent);
            }
        });
        intent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adele.this, Kennyg.class);
                startActivity(intent);
            }
        });
    }
}
