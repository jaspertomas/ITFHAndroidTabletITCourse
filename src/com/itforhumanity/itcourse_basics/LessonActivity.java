package com.itforhumanity.itcourse_basics;

import java.util.ArrayList;
import java.util.List;

import models.L1S1;
import models.Lessons;
import views.customlist.CustomListBaseAdapter;
import views.customlist.CustomListItem;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
	ArrayList<CustomListItem> listitems;
	String lessonname;
	private void setupView()
	{
		
		//List<String> listitems;
        ListView listView = (ListView) findViewById (R.id.list_view);
        
        lessonname=this.getIntent().getAction();
        listitems = new ArrayList<CustomListItem>();
        listitems.add(new CustomListItem(CustomListItem.TITLE,lessonname));
		listitems.addAll(Lessons.getLesson(lessonname));
        
//		SQLiteDatabase db=MyDatabaseHelper.getInstance().getWritableDatabase();
//        
//
		//=====read doctors table and add results to listview=======
		//listitems= new ArrayList<String>(Lessons.list.length);

//        for(CustomListItem lesson:Lesson1.getLessons())
//        {
//        	
//        	listitems.add(lesson);
//       	}

        if (listView != null) {
//            listView.setAdapter(new ArrayAdapter<String>(LessonActivity.this,
//              android.R.layout.simple_list_item_1, listitems));


//            listView.setOnItemClickListener(new OnItemClickListener() {
//    			public void onItemClick(AdapterView<?> parent, View view,int position, long id) 
//    			    {
//    			      String selectedFromList = (parent.getItemAtPosition(position).toString());
//    					//Toast.makeText(MenuActivity.this, selectedFromList, Toast.LENGTH_LONG).show();
//    					Intent intent = new Intent(getApplicationContext(), LessonActivity.class);
//    			        intent.setAction(selectedFromList);
//    					startActivity(intent);
//    			      

//    			    }});	
        
			CustomListBaseAdapter adapter=new CustomListBaseAdapter(this, listitems);

			//this merely allows the list item to be selected, but not clicked?
			//adapter.setCheckboxClickable(false);
			
			//MyContentHelper.reloadexistingtrack(chosen,track.getId(),dt);
			listView.setAdapter(adapter);

        
        }	   
	
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		// Handle item selection
		switch (item.getItemId()) {
		case R.id.menu_back:
			finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
