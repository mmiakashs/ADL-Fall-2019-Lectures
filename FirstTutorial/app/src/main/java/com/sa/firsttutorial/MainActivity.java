package com.sa.firsttutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = (Button) findViewById(R.id.buttonOne);
        Button calVatBtn = (Button) findViewById(R.id.calVatBtn);
        input = (EditText) findViewById(R.id.input);
        tv = (TextView) findViewById(R.id.tv);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this,
                        R.string.btn_one_text, Toast.LENGTH_LONG);
                toast.show();
                tv.setText("User Input: "+input.getText().toString().toUpperCase());
            }
        });

        calVatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double amount = Double.valueOf(input.getText().toString());
                Intent intent = new Intent(MainActivity.this, ShowVatActivity.class);
                intent.putExtra("sellAmount",amount);

                startActivity(intent);
            }
        });
    }
}
