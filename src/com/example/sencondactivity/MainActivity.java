package com.example.sencondactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    public void lanzar(View view) {
    	
    	/*
    	
    	 En el método lanzar creamos un objeto de la clase Intent y le pasamos como parámetros 
    	 la referencia del objeto de esta clase (this) y la referencia del otro Activity (AcercaDe.class)
    	 
    	 */
    	
        Intent i = new Intent(this, acercade.class );
        startActivity(i);
  /*
    startActivity pasando el objeto de la clase Intent (con esto ya tenemos en pantalla la ventana del segundo Activity:
   */
    } 
	
	
}
