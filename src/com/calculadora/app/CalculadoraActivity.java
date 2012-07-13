package com.calculadora.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button btn_plus = (Button) findViewById(R.id.btn_plus);
        final Button btn_minus = (Button) findViewById(R.id.btn_minus);
        final Button btn_by = (Button) findViewById(R.id.btn_by);
        final Button btn_divide = (Button) findViewById(R.id.btn_divide);
        
        final EditText txt_a = (EditText) findViewById(R.id.txt_a);
        final EditText txt_b = (EditText) findViewById(R.id.txt_b);
        
        final TextView lbl_result = (TextView) findViewById(R.id.lbl_result);
        
        //final int a = Integer.parseInt(txt_a.getText().toString());
        //final int b = Integer.parseInt(txt_b.getText().toString());
        
        
/*        btn_plus.setOnClickListener(new OnClickListener() {
			

			public void onClick(View arg0) {
		         int a = Integer.parseInt(txt_a.getText().toString());
		         int b = Integer.parseInt(txt_b.getText().toString());
				lbl_result.setText(a + "+" + b + "=" + (a+b));
				
			}
		});*/
        
        btn_minus.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				int a = Integer.parseInt(txt_a.getText().toString());
		        int b = Integer.parseInt(txt_b.getText().toString());
				lbl_result.setText(a + "-" + b + "=" + (a-b));
				
			}
		});
        
        btn_by.setOnClickListener(new OnClickListener() {
			

			public void onClick(View arg0) {
				int a = Integer.parseInt(txt_a.getText().toString());
		        int b = Integer.parseInt(txt_b.getText().toString());
				lbl_result.setText(a + "*" + b + "="+ (a*b));
				
			}
		});
        
        btn_divide.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				int a = Integer.parseInt(txt_a.getText().toString());
		        int b = Integer.parseInt(txt_b.getText().toString());
				lbl_result.setText(a + "/" + b + "=" + (a/b));
				
			}
		});
        
    }
    
    public void onClickSumar(View arg0) {
    	EditText txt_a = (EditText) findViewById(R.id.txt_a);
    	EditText txt_b = (EditText) findViewById(R.id.txt_b);
    	TextView lbl_result = (TextView) findViewById(R.id.lbl_result);
    	
    	int a = Integer.parseInt(txt_a.getText().toString());
        int b = Integer.parseInt(txt_b.getText().toString());
		lbl_result.setText(a + "+" + b + "=" + (a+b));
    }
}