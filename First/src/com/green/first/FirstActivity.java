package com.green.first;


import com.green.first.R;
//import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class FirstActivity extends Activity {
	TextView tvDisplay;
	Button badd, bsub, bmul, bdiv;
	EditText a, b;
	double res;
	String c;
	String d;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
      //  MediaPlayer mp=MediaPlayer.create(FirstActivity.this, R.raw.ss);
		//mp.start();
		
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
		badd = (Button) findViewById(R.id.button1);
		bsub = (Button) findViewById(R.id.button2);
		bmul = (Button) findViewById(R.id.button3);
		bdiv = (Button) findViewById(R.id.button4);
		a= (EditText) findViewById(R.id.editText1);
		b= (EditText) findViewById(R.id.editText2);
		
		
		
		
		badd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				try{
					c= a.getText().toString();
				
				d=b.getText().toString();
				
				res =Double.parseDouble(c)+Double.parseDouble(d);
				
				tvDisplay.setText("RESULT : "+ res );
				}catch(Exception e){
					e.printStackTrace();
				}
		}
		});
		
		bsub.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			try{
				c= a.getText().toString();
			
			d=b.getText().toString();
			
			res =Double.parseDouble(c)-Double.parseDouble(d);
			
			tvDisplay.setText("RESULT : "+ res );
	
			}catch(Exception e ){
				e.printStackTrace();
				}
			}
	});
		
		bmul.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
					c= a.getText().toString();
				
				d=b.getText().toString();
				
				res =Double.parseDouble(c)*Double.parseDouble(d);
				
				tvDisplay.setText("RESULT : "+ res );
				}catch(Exception e){
					e.printStackTrace();
					
				}
			}
		});
		
		bdiv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
					c= a.getText().toString();
				
				d= b.getText().toString();		
				
				if(Integer.parseInt(d)!=0)
				{
					res = Double.parseDouble(c)/Double.parseDouble(d);
					tvDisplay.setText("RESULT : " + res);
				}
				else
					tvDisplay.setText("PUT PROPER VALUE " );
				
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	
	
	}
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }
    
}
