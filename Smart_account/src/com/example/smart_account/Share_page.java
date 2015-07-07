package com.example.smart_account;

import java.util.Calendar;
import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

public class Share_page extends Activity {

	String category = null;
	String currency = null;
	private EditText et = null;  
    public final static int SHOW_DATEPICKER = 1; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_share_page);
		
		Intent intent = getIntent();
		
		//Spinner for category
		final Spinner mSpinner = (Spinner)findViewById(R.id.spinner_category);
		String[] mItems = getResources().getStringArray(R.array.category);
		ArrayAdapter<String> _Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mItems);
		mSpinner.setAdapter(_Adapter);
				
		mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent,
					View view, int position, long id) {
				// TODO Auto-generated method stub
				category = mSpinner.getSelectedItem().toString();
				}
			
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			});
		
		//Spinner for currency
		final Spinner mSpinner2 = (Spinner)findViewById(R.id.Spinner_currency);
		String[] mItems2 = getResources().getStringArray(R.array.currency);
		ArrayAdapter<String> _Adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mItems2);
		mSpinner2.setAdapter(_Adapter2);
		mSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> parent,
					View view, int position, long id) {
				// TODO Auto-generated method stub
				currency = mSpinner2.getSelectedItem().toString();
				}
					
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				}
			});
		
		//Spinner for currency
		final Spinner mSpinner3 = (Spinner)findViewById(R.id.Spinner_member);
		String[] mItems3 = getResources().getStringArray(R.array.member);
		ArrayAdapter<String> _Adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mItems3);
		mSpinner3.setAdapter(_Adapter3);
		mSpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> parent,
					View view, int position, long id) {
				// TODO Auto-generated method stub
				currency = mSpinner3.getSelectedItem().toString();
				}
					
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				}
			});
		
		//For the time picker.
		//setContentView(R.layout.activity_share_page);  
        et = (EditText) findViewById(R.id.datepicker_et);  
        et.setOnTouchListener(new OnTouchListener() {  
            

			@SuppressWarnings("deprecation")
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				showDialog(SHOW_DATEPICKER); 
				return false;
			}  
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.share_page, menu);
		return true;
	}
	
	public void Transfer_to_main(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	
	public void Transfer_to_journal(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, Journal_page.class);
		startActivity(intent);
	}
	
	public void Transfer_to_member(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, Member.class);
		startActivity(intent);
	}
	
	//Select the date.
	@Override
	protected Dialog onCreateDialog(int id) {
		switch(id) {
		case SHOW_DATEPICKER:
			int year,month,day;
			if (et.getText().toString() != null && et.getText().toString().matches("^\\d{4}-\\d{2}-\\d{2}$")) {
				year = Integer.valueOf(et.getText().toString().substring(0,3));
				month = Integer.valueOf(et.getText().toString().substring(5,6));
				day = Integer.valueOf(et.getText().toString().substring(8,9));
			}
			else {
				Calendar c = Calendar.getInstance();
				year = c.get(Calendar.YEAR);
				month = c.get(Calendar.MONTH);
				day = c.get(Calendar.DAY_OF_MONTH);
			}
			DatePickerDialog dp = new DatePickerDialog(this, dateChangeListener, year, month, day);
			return dp;
		}
		return null;
	}
	
		DatePickerDialog.OnDateSetListener dateChangeListener = new OnDateSetListener() {
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			et.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
		}
	};
}
