package com.sa.firsttutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ShowVatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_vat);

        Intent intent = this.getIntent();
        Double sellAmount = intent.getDoubleExtra("sellAmount", -10.0);
        Double vatAmount = sellAmount*1.15;
        Toast.makeText(this, "Sell Amount Received"+vatAmount, Toast.LENGTH_LONG).show();

        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
