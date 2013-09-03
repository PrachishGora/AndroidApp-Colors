package com.example.colors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class ColorSelectionActivity extends Activity {
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.second_activity);
	
	        /////  passing function
	        
	        final Button button = (Button) findViewById(R.id.buttonOk);
	        button.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                
	            	// Perform action on click
	            	
	            	RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
	            	final int id = radioGroup.getCheckedRadioButtonId();
	            	
	                Intent activityChangeIntent = new Intent(ColorSelectionActivity.this, ChooseColorActivity.class);
	                activityChangeIntent.putExtra("Color",id);
	                
	                // currentContext.startActivity(activityChangeIntent);

	                ColorSelectionActivity.this.startActivity(activityChangeIntent);
	                finish();

	            }
	        });	        
	        
	 }
}
