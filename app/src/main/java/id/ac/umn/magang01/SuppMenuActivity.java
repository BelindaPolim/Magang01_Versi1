package id.ac.umn.magang01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SuppMenuActivity extends AppCompatActivity {
    ImageView imgBack;
    LinearLayout llPembelian, llHutang, llJatuhTempoHutang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supp_menu);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParent();
                finish();
            }
        });

        llPembelian = findViewById(R.id.layoutPembelian);
        llPembelian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PembelianActivity.class));
            }
        });
        llHutang = findViewById(R.id.layoutHutang);
        llHutang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HutangActivity.class));
            }
        });
        llJatuhTempoHutang = findViewById(R.id.layoutJatuhTempoHutang);
    }
}