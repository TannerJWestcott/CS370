package com.example.westcotthw7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends Activity {
    
	protected static final int MANAGE_ASSIGNMENTS_REQUEST_CODE = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);

		final  Button  assignmentsbutton  =  (Button) findViewById(R.id.manageButton);
        //  assuming that the id of the button is  assignments, by the XML layout

    assignmentsbutton.setOnClickListener(  new Button.OnClickListener()   {

        public void onClick(View v) {
            try {
                startActivityForResult(new Intent(v.getContext(),   HomeScreen.class),
                                                        MANAGE_ASSIGNMENTS_REQUEST_CODE);
            } catch (Exception e) {
            }
        }
    }  ) ;

	}}
