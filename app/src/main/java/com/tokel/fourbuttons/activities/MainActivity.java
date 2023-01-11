package com.tokel.fourbuttons.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.tokel.fourbuttons.R;
import com.tokel.fourbuttons.logic.*;

public class MainActivity extends AppCompatActivity
{
    private Button button1, button2, button3, button4;
    private ButtonHandler buttonHandler1, buttonHandler2, buttonHandler3, buttonHandler4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        buttonHandler1 = new ButtonHandler1();
    }
}