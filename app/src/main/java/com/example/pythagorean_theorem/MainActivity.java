package com.example.pythagorean_theorem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText sideA;
    private EditText sideB;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.sideA = this.findViewById(R.id.sideA);
        this.sideB = this.findViewById(R.id.sideB);
        this.answerTV = this.findViewById(R.id.answerTV);
    }

    public void onCalculateButtonClicked(View v)
    {
        String sideA = this.sideA.getText().toString();
        String sideB = this.sideB.getText().toString();
        double sA = Double.valueOf(sideA);
        double sB = Double.valueOf(sideB);
        double c = Math.sqrt(sA * sA + sB * sB);
        String answer = String.valueOf(c);
        this.answerTV.setText(answer);
    }

}