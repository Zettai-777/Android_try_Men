package com.example.android.menu;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view){
        String[] menu = new String[3];
        TextView textView = (TextView) findViewById(R.id.menu_item_1);
        textView.getText();
        menu[0] = (String) ((TextView) findViewById(R.id.menu_item_1)).getText();
        menu[1] = (String) ((TextView) findViewById(R.id.menu_item_2)).getText();
        menu[2] = (String) ((TextView) findViewById(R.id.menu_item_3)).getText();
        for(String el : menu){
            Log.i(getClass().getName(),el);
        }
    }
}
