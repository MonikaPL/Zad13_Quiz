package com.example.monia.zad4;


import android.app.Activity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Pytania extends Activity {
    int zmienna;

    public void wyswietl() {
        Context context = getApplicationContext();
        CharSequence text = "Liczba punktów: " + zmienna;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pytania);

        RadioButton pies1 = (RadioButton) findViewById(R.id.radioButton1);
        pies1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                zmienna++;

            }
        });

        RadioButton pies2 = (RadioButton) findViewById(R.id.radioButton3);
        pies2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                zmienna++;

            }
        });

        RadioButton pies3 = (RadioButton) findViewById(R.id.radioButton5);
        pies3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                zmienna++;

            }
        });

        RadioButton pies4 = (RadioButton) findViewById(R.id.radioButton7);
        pies4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                zmienna++;

            }
        });

        RadioButton pies5 = (RadioButton) findViewById(R.id.radioButton9);
        pies5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                zmienna++;

            }
        });

        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wyswietl();

            }
        });

    }

}

