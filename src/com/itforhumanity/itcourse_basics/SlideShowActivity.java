package com.itforhumanity.itcourse_basics;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SlideShowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide_show);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide_show, menu);
		return true;
	}

}
