package com.tokel.fourbuttons.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tokel.fourbuttons.R;
import com.tokel.fourbuttons.logic.*;

public class MainActivity extends AppCompatActivity
{
    private Button button1, button2, button3, button4;
    private TextView textView;
    private ButtonHandler buttonHandler1, buttonHandler2, buttonHandler3, buttonHandler4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        textView = findViewById(R.id.bottom_text);
        buttonHandler1 = new ButtonHandler1();
    }
    public void onClick1(View view)
    {
        textView.setText(buttonHandler1.getResponse());
    }
    public void onClick2(View view)
    {
        textView.setText(buttonHandler2.getResponse());
    }
    public void onClick3(View view)
    {
        textView.setText(buttonHandler3.getResponse());
    }
    public void onClick4(View view)
    {
        textView.setText(buttonHandler4.getResponse());
    }
}