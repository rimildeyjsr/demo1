package com.example.demo1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
    }

public void onClick (View view){ 
	EditText input = (EditText)findViewById(R.id.main_input);
	String string = input.getText().toString();
	TextView abc = (TextView)findViewById(R.id.main_display);
	abc.setText("you just said : " + string);
	
}
}