package com.example.kelompok4v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MatchActivity extends AppCompatActivity {
    private TextView textHome;
    private TextView textAway;
    private TextView scoreHome;
    private TextView scoreAway;
    private ImageView homeLogo;
    private ImageView awayLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        textHome = findViewById(R.id.txt_home);
        textAway = findViewById(R.id.txt_away);
        awayLogo = findViewById(R.id.away_logo);
        homeLogo = findViewById(R.id.home_logo);
        scoreAway = findViewById(R.id.score_away);
        scoreHome = findViewById(R.id.score_home);

        //TODO
        //1.Menampilkan detail match sesuai data dari main activity
        //2.Tombol add score menambahkan satu angka dari angka 0, setiap kali di tekan
        //3.Tombol Cek Result menghitung pemenang dari kedua tim dan mengirim nama pemenang ke ResultActivity, jika seri di kirim text "Draw"


        Intent intent = getIntent();
        String home = intent.getStringExtra("home_team");
        textHome.setText(home);
        String away = intent.getStringExtra("away_team");
        textAway.setText(away);
//        Bitmap imgAway = (Bitmap) intent.getParcelableExtra("image_away_bitmap");
//        awayLogo.setImageBitmap(imgAway);
        Bitmap imgHome = (Bitmap) intent.getParcelableExtra("image_home_bitmap");
        homeLogo.setImageBitmap(imgHome);
    }

    public void handlerAddHome(View view) {
        int lastScore = Integer.parseInt(scoreHome.getText().toString());
        String Homescore = String.valueOf(lastScore + 1);
        scoreHome.setText(Homescore);
    }

    public void handlerAddAway(View view) {
        int lastScore = Integer.parseInt(scoreAway.getText().toString());
        String Awayscore = String.valueOf(lastScore + 1);
        scoreAway.setText(Awayscore);
    }

    public void cekHasil(View view) {
        startActivity(new Intent(this, ResultActivity.class));
        int Homescore = Integer.parseInt(scoreHome.getText().toString());
        int Awayscore = Integer.parseInt(scoreAway.getText().toString());
        int pemenang = Integer.parseInt(());
        if(Homescore > Awayscore){
            pemenang = Homescore;
        }else{
            pemenang = Awayscore;
        }
    }
}