package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L3S04 {
	public static final String title="3.4: Know your keyboard";
	private static ArrayList<CustomListItem> list=null;
	public static ArrayList<CustomListItem> getLessons()
	{
		if(list==null)init();
		return list;
	}
	private static void init()
	{
		list=new ArrayList<CustomListItem>();
		String text="";
		int image=0;
		String slideshowprefix="";

		//-------------------------
		text="Before we start typing, let's get to know our keyboard.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		image=R.drawable.l03s01keyboard;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
		
		
		
	}

	
	
}
