package com.example.classwork3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText x = findViewById(R.id.Number1);
        final EditText y = findViewById(R.id.Number2);
        final Button add = findViewById(R.id.addBtn);
        final Button mul = findViewById(R.id.multBtn);
        final Button div = findViewById(R.id.divBtn);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               int n1 = Integer.parseInt(x.getText().toString());
               int n2 = Integer.parseInt(y.getText().toString());
               int result = n1 + n2;


                Toast.makeText(MainActivity.this, result + "", Toast.LENGTH_SHORT).show();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(x.getText().toString());
                int n2 = Integer.parseInt(y.getText().toString());
                int result2 = n1 * n2;


                Toast.makeText(MainActivity.this, result2 + "", Toast.LENGTH_SHORT).show();

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(x.getText().toString());
                int n2 = Integer.parseInt(y.getText().toString());
                int result3 = n1 / n2;

                Toast.makeText(MainActivity.this, result3 + "", Toast.LENGTH_SHORT).show();

            }
        });






    }

}