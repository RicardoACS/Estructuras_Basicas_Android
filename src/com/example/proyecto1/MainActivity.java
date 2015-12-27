package com.example.proyecto1;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity 
{
	TextView txtPrincipal;
	TextView txvEstructura2;
	 public void estructurasBasicas1()
	 {
		 txtPrincipal = (TextView)findViewById(R.id.txtPrincipal);
	    	//Enteros
	        int numero = 1000;
	        
	        //Texto        
	        String texto = "Esto es un String";
	        
	        //Decimales	        
	        double decimal = 0.0;
	        
	        //Boolean
	        boolean bool = true;
	        
	        //Arreglos 
	        int[] arregloNumeros = new int[]{1,3,77,9};
	        
	        txtPrincipal.setText(numero + "\n" + texto + "\n" + decimal + "\n" + bool + "\n" + arregloNumeros[0] );
	        	        
	}
	 
	public void estructurasBasicas2()
	{
		txvEstructura2 = (TextView) findViewById(R.id.txvEstructura2);
		//Condiciones
		//If
		boolean condicion = true;
		int numero = 0;
		
		if(condicion)
		{
			txvEstructura2.setText("El Valor es Verdadero :)\n");			
		}
		else
		{
			txvEstructura2.setText("El Valor es Falso :)");
		}
		
		//Switch
		switch (numero) 
		{
			case 0:	
				txvEstructura2.setText(txvEstructura2.getText() + "El Valor es " + numero);
				break;
			case 1:			
				txvEstructura2.setText("El Valor es " + numero);
				break;
			default:
				txvEstructura2.setText("Valor Irreconocible");
				break;
		}
		
		//Repetitivas
		//For
		//for (int i = 0; i < numero; i++) 
		//{
			//Código
		//}
		
		//While
		//while (condicion) 
		//{
			//Código	
		//}
		
		
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        estructurasBasicas1();
        estructurasBasicas2();
    }

   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) 
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
