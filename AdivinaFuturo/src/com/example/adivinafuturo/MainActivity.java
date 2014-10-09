package com.example.adivinafuturo;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	/*private TextView answerLabel;
	private Button getAnswerButton;*/
	
	 TextView texto ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        Button getAnswerButton = (Button) findViewById(R.id.button1);
        
        
        
         texto = (TextView)findViewById(R.id.textView1);
        getAnswerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	String[] arrayR;            	         	       	
            	arrayR=   getResources().getStringArray(R.array.respuestas); 
            	RelativeLayout fondo =  (RelativeLayout) findViewById(R.id.fondo1);
            	int i=aleatorio(0,arrayR.length);  
            	
            	String respuesta=arrayR[i];
            	
            	
            	texto.setText(respuesta);
            	
            	if (i<6){
            		fondo.setBackgroundColor(Color.GREEN);
            	}
            	else
            		if(i>=6 && i<13){
            			  fondo.setBackgroundColor(Color.YELLOW);      			
            		}
            		else
            		{
            			fondo.setBackgroundColor(Color.RED);  	
            		}
            	
            	
            }});
        
        
    }
    
    public static int aleatorio(int min, int max){

	    Random numero = new Random();

	   int randomNum = numero.nextInt((max - min)) + min;

	    return randomNum;
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    
}
