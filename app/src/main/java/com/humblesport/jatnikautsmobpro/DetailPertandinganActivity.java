package com.humblesport.jatnikautsmobpro;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class DetailPertandinganActivity extends AppCompatActivity {

    int gambarhome, gambarawa;

    String clubhome, clubaway, deskripsi;
    private ImageView ivGambarhome, ivGambaraway;
    private TextView tvClubhome, tvClubaway, tvDeskripsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpertandingan_activity);

        tvClubhome = findViewById(R.id.namaclub_home);
        tvClubaway = findViewById(R.id.namaclub_away);
        ivGambarhome = findViewById(R.id.gambarclub_home);
        ivGambaraway = findViewById(R.id.gambarclub_away);
        tvDeskripsi = findViewById(R.id.deskripsi);

        tvClubhome.setText(getIntent().getStringExtra("namaTimSatu"));
        tvClubaway.setText(getIntent().getStringExtra("namaTimDua"));
        ivGambarhome.setImageResource(getIntent().getIntExtra("logoTimSatu", 0));
        ivGambaraway.setImageResource(getIntent().getIntExtra("logoTimDua", 0));
        tvDeskripsi.setText(getIntent().getStringExtra("deskripsi"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_news:
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://sport.detik.com/sepakbola/liga-spanyol/4277275/hasil-barcelona-vs-madrid-blaugrana-menang-telak-lewat-hat-trick-suarez"));
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
