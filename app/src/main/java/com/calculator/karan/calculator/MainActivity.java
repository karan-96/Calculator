package com.calculator.karan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button7; Button button6;      Button addition;          Button button0;
    Button button8; Button button1;      Button multiplication;    Button clear;
    Button button9; Button button2;      Button division;          Button decimal;
    Button button4; Button button3;      Button modulus;           Button equal;
    Button button5; Button subtraction;  Button delete;            TextView screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_calculator);
        button7= (Button)findViewById(R.id.button7);
        button7.setText("7");
        button7.setOnClickListener(this);

        button8= (Button)findViewById(R.id.button8);
        button8.setText("8");
        button8.setOnClickListener(this);
        button9= (Button)findViewById(R.id.button9);
        button9.setText("9");
        button9.setOnClickListener(this);
        button4= (Button)findViewById(R.id.button4);
        button4.setText("4");
        button4.setOnClickListener(this);
        button5= (Button)findViewById(R.id.button5);
        button5.setText("5");
        button5.setOnClickListener(this);
        button6= (Button)findViewById(R.id.button6);
        button6.setText("6");
        button6.setOnClickListener(this);
        button1= (Button)findViewById(R.id.button1);
        button1.setText("1");
        button1.setOnClickListener(this);
        button2= (Button)findViewById(R.id.button2);
        button2.setText("2");
        button2.setOnClickListener(this);
        button3= (Button)findViewById(R.id.button3);
        button3.setText("3");
        button3.setOnClickListener(this);
        subtraction= (Button)findViewById(R.id.subtraction);
        subtraction.setText("-");
        subtraction.setOnClickListener(this);
        addition= (Button)findViewById(R.id.addition);
        addition.setText("+");
        addition.setOnClickListener(this);
        multiplication= (Button)findViewById(R.id.multiplication);
        multiplication.setText("*");
        multiplication.setOnClickListener(this);
        division= (Button)findViewById(R.id.division);
        division.setText("/");
        division.setOnClickListener(this);
        modulus= (Button)findViewById(R.id.modulus);
        modulus.setText("%");
        modulus.setOnClickListener(this);
        delete= (Button)findViewById(R.id.delete);
        delete.setText("<-");
        delete.setOnClickListener(this);
        decimal= (Button)findViewById(R.id.decimal);
        decimal.setText(".");
        decimal.setOnClickListener(this);
        button0= (Button)findViewById(R.id.button0);
        button0.setText("0");
        button0.setOnClickListener(this);
        clear= (Button)findViewById(R.id.clear);
        clear.setText("C");
        clear.setOnClickListener(this);
        equal= (Button)findViewById(R.id.equal);
        equal.setText("=");
        equal.setOnClickListener(this);
        screen=(TextView)findViewById(R.id.screen);

    }
    @Override
    public void onClick(View v) {
        if(v!=clear&&v!=delete&&v!=equal) {
            Button b = (Button) v;
            String buttonText = b.getText().toString();
            screen.append(buttonText);

        }
        else if(v==clear)
        {
            screen.setText("");
        }
        else if(v==delete)
        {
            screen.setText(screen.getText().toString().substring(0, screen.getText().length() - 1));
        }


    }
}
