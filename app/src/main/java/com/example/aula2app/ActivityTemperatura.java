package com.example.aula2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTemperatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        Button calcBtn = findViewById(  R.id.button );
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = findViewById( R.id.editTextNumber );
                TextView textView = findViewById( R.id.textView );

                int celsius = Integer.valueOf( text.getText().toString() );
                textView.setText( String.valueOf( celsius*9/5+32 ) );
            }
        });
    }
}