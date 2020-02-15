package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private Button sin, cos, tan, csc, sec, cot, log;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        csc = findViewById(R.id.csc);
        sec = findViewById(R.id.sec);
        cot = findViewById(R.id.cot);
        log = findViewById(R.id.log);
        output = findViewById(R.id.output);

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();

                    double dInput = Double.parseDouble(sInput);

                    double dOutput = Math.sin(dInput);

                    String sOutput = String.valueOf(dOutput);
                    output.setText(sOutput);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();

                    double dInput = Double.parseDouble(sInput);

                    double dOutput = Math.cos(dInput);

                    String sOutput = String.valueOf(dOutput);
                    output.setText(sOutput);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();

                    double dInput = Double.parseDouble(sInput);

                    double dOutput = Math.tan(dInput);

                    String sOutput = String.valueOf(dOutput);
                    output.setText(sOutput);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        csc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();

                    double dInput = Double.parseDouble(sInput);

                    double dOutput = 1 / Math.sin(dInput);

                    String sOutput = String.valueOf(dOutput);
                    output.setText(sOutput);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();

                    double dInput = Double.parseDouble(sInput);

                    double dOutput = 1 / Math.cos(dInput);

                    String sOutput = String.valueOf(dOutput);
                    output.setText(sOutput);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();

                    double dInput = Double.parseDouble(sInput);

                    double dOutput = 1 / Math.tan(dInput);

                    String sOutput = String.valueOf(dOutput);
                    output.setText(sOutput);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();

                    double dInput = Double.parseDouble(sInput);

                    double dOutput = Math.log10(dInput);

                    String sOutput = String.valueOf(dOutput);
                    output.setText(sOutput);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
