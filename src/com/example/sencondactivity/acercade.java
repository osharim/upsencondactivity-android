package com.example.sencondactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class acercade extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acercade);
		/*Ahora solo falta llamar al método setContentView para enlazar el archivo XML*/
	}
	
	
	public void close(View view){
		
		finish();
	}

}
