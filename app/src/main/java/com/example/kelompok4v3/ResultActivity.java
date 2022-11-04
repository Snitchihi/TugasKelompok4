package com.example.kelompok4v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
    private TextView scoreText;
    private ImageView teamLogo;
    private TextView teamName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //TODO
        //1.Menampilkan detail pemenang pertandingan berdasarkan score tertinggi data berasal dari MatchActivity

        scoreText = findViewById(R.id.score_text);
        teamLogo = findViewById(R.id.imageView);
        teamName = findViewById(R.id.textView3);

        Intent intent= getIntent();
        String score = intent.getStringExtra("pemenang");
        scoreText.setText(score);
    }
}