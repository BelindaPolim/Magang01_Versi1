package id.ac.umn.magang01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CustMenuActivity extends AppCompatActivity {
    ImageView imgBack;
    LinearLayout llPenjualan, llPiutang, llJatuhTempoPiutang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_menu);

        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParent();
                finish();
            }
        });

        llPenjualan = findViewById(R.id.layoutPenjualan);
        llPenjualan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PenjualanActivity.class));
            }
        });
        llPiutang = findViewById(R.id.layoutPiutang);
        llPiutang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PiutangActivity.class));
            }
        });
        llJatuhTempoPiutang = findViewById(R.id.layoutJatuhTempoPiutang);
    }
}