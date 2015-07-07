package com.example.smart_account;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Journal_page extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_journal_page);
		Intent intent = getIntent();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.journal_page, menu);
		return true;
	}
	
	public void Transfer_to_share(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, Share_page.class);
		startActivity(intent);
	}
	
	public void Transfer_to_main(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	
	public void Transfer_to_member(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, Member.class);
		startActivity(intent);
	}

}
