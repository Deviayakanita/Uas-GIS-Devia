package com.example.sigtempatfacial;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Detailfacial_Activity extends AppCompatActivity implements View.OnClickListener {

    TextView datanama, dataalamat, datanotlpn;
    Button btncall, btnhome;
    ImageView datagambar;
    public static String id, nama, alamat, no_tlpn, gambar;
    public static Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailfacial_);

        datanama = findViewById(R.id.tv_nama);
        dataalamat = findViewById(R.id.tv_alamat);
        datanotlpn = findViewById(R.id.tv_notlpn);
        btncall = findViewById(R.id.btn_tlpn);
        btnhome = findViewById(R.id.btn_home);
        datagambar = findViewById(R.id.image_facialskin);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datanotlpn.setText(no_tlpn);
        Picasso.get().load(gambar).into(datagambar);

        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+no_tlpn));
                    startActivity(call);
                }

        });
        btnhome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent home = new Intent(Detailfacial_Activity.this, MainActivity.class);
        startActivity(home);

    }
}

