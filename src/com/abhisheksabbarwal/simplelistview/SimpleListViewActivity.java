package com.abhisheksabbarwal.simplelistview;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListViewActivity extends Activity {

	/* List of Country names to be displayed in the ListView*/
	
	static final String[] countryNames = new String[] { "India", "USA", "UK",
			"Australia", "Canada", "Brazil", "Russia", "France", "Ireland", "Germany", "South Africa" };
	
	ListView mySimpleListView;

	/** Called when the activity is first created. */
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mySimpleListView = (ListView) findViewById(R.id.mylist);
		
		/* Create an ArrayAdapter to populate the ListView with the countryNames */
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countryNames);
		
		mySimpleListView.setAdapter(adapter);
	}

}
