package com.example.colors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class ChooseColorActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        
        final Button button = (Button) findViewById(R.id.buttonSelectColor);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click   

                Intent activityChangeIntent = new Intent(ChooseColorActivity.this, ColorSelectionActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                ChooseColorActivity.this.startActivity(activityChangeIntent);
                finish();
            }
        });
        
        int id = getIntent().getIntExtra("Color", -1);
        OnActivityResult(id);
        
    }
    
    private void OnActivityResult(int id)
    {
    	FrameLayout frameback = (FrameLayout)findViewById(R.id.ColorBox);
        if (id==-1)
        {
    		frameback.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if(id == R.id.radioRed)
    	{
    		frameback.setBackgroundColor(getResources().getColor(R.color.red));
    	}
    	else if(id == R.id.radioBlue)
    	{
    		frameback.setBackgroundColor(getResources().getColor(R.color.blue));
    	}
    	else if(id == R.id.radioGreen)
    	{
    		frameback.setBackgroundColor(getResources().getColor(R.color.green));
    	}
    	else if(id == R.id.radioBrown)
    	{
    		frameback.setBackgroundColor(getResources().getColor(R.color.brown));
    	}
    	else if(id == R.id.radioYellow)
    	{
    		frameback.setBackgroundColor(getResources().getColor(R.color.yellow));
    	}
    }
}


   