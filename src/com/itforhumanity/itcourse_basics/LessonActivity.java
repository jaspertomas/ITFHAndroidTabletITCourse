package com.itforhumanity.itcourse_basics;

import java.util.ArrayList;
import java.util.List;

import models.Lesson1;
import models.Lessons;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LessonActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson);
		
		setupView();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lesson, menu);
		return true;
	}

	private void setupView()
	{
		
		List<String> listitems;
        ListView listView = (ListView) findViewById (R.id.list_view);
        
//		SQLiteDatabase db=MyDatabaseHelper.getInstance().getWritableDatabase();
//        
//
		//=====read doctors table and add results to listview=======
		listitems= new ArrayList<String>(Lessons.list.length);

        for(String[] lesson:Lesson1.list)
        {
        	
        	listitems.add(lesson[1]);
       	}

        if (listView != null) {
            listView.setAdapter(new ArrayAdapter<String>(LessonActivity.this,
              android.R.layout.simple_list_item_1, listitems));


            listView.setOnItemClickListener(new OnItemClickListener() {
    			public void onItemClick(AdapterView<?> parent, View view,int position, long id) 
    			    {
//    			      String selectedFromList = (parent.getItemAtPosition(position).toString());
//    					//Toast.makeText(MenuActivity.this, selectedFromList, Toast.LENGTH_LONG).show();
//    					Intent intent = new Intent(getApplicationContext(), LessonActivity.class);
//    			        intent.setAction(selectedFromList);
//    					startActivity(intent);
//    			      

    			    }});	
        
        }	   
	}
}
