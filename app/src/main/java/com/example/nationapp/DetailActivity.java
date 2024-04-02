package com.example.nationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String namaNegara = intent.getStringExtra("nama_negara");
        int gambarNegara = intent.getIntExtra("gambar_negara", 0);
        String infoNegara = intent.getStringExtra("info_negara");
        String deskripsiNegara = intent.getStringExtra("deskripsi_negara");

        TextView tvNamaNegara = findViewById(R.id.tvNamaNegara);
        TextView tvInfoNegara = findViewById(R.id.tvInfoNegara);
        TextView tvDeskripsiNegara = findViewById(R.id.tvDeskripsiNegara);
        ImageView ivBenderaNegara = findViewById(R.id.ivBenderaNegara);
        Button btnShare = findViewById(R.id.btnShare);

        tvNamaNegara.setText(namaNegara);
        tvInfoNegara.setText(infoNegara);
        tvDeskripsiNegara.setText(deskripsiNegara);
        ivBenderaNegara.setImageResource(gambarNegara);

        btnShare.setOnClickListener(view -> {
            String shareText = gambarNegara + ", " + namaNegara + ", berikut deskripsi lebih lanjut..";
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
            startActivity(Intent.createChooser(shareIntent, "Share using"));
        });

    }
}