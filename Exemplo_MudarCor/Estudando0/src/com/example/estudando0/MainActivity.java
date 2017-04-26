package com.example.estudando0;




import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
	//1 passo
	LinearLayout layoutPrincipal;
	RadioGroup rgCores;
	RadioButton rbAzul,rbVermelho;
	Button btMudarCor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//2 passo
		layoutPrincipal = (LinearLayout)findViewById(R.id.layoutPrincipal);
		rgCores = (RadioGroup)findViewById(R.id.rgCores);
		rbAzul = (RadioButton)findViewById(R.id.rbAzul);
		rbVermelho = (RadioButton)findViewById(R.id.rbVermelho);
		btMudarCor = (Button)findViewById(R.id.btMudarCor);
		
		btMudarCor.setOnClickListener(verificar);
		
	}
	
	View.OnClickListener verificar = new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			if(rbAzul.isChecked()== true)
			{
				Toast.makeText(getBaseContext(), "Azul selecionado!", Toast.LENGTH_SHORT).show(); 
				layoutPrincipal.setBackgroundColor(Color.BLUE);
			}
			else if (rbVermelho.isChecked())
			{
				Toast.makeText(getBaseContext(), "Vermelho selecionado!", Toast.LENGTH_SHORT).show();
				layoutPrincipal.setBackgroundColor(Color.RED);
			}
			
		}
	};
	

	
	
	



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
