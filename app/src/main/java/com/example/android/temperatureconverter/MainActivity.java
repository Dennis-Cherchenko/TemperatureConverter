package com.example.android.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Button button = (Button) findViewById(R.id.btnF);

    /*button.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){

        }
    });*/


    public void convertToF(View v){

        TextView F = (TextView) findViewById(R.id.txtViewF);
        TextView C = (TextView) findViewById(R.id.txtViewC);
        EditText Fedit = (EditText) findViewById(R.id.editTextF);
        EditText Cedit = (EditText) findViewById(R.id.editTextC);

        int f = Integer.parseInt(Fedit.getText().toString());

        //int c = Integer.parseInt(Cedit.getText().toString());

        //Log.d(TAG, f);

        int fNum = (f*9/5) - 32;

        C.setText(Integer.toString(fNum));

    }

    public void convertToC(View v){


    }

}
