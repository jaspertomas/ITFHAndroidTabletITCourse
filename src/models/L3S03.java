package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L3S03 {
	public static final String title="3.3: The Cursor";
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

		//----------------
		text="When you open Jota, notice that there's this blinking '|'. This is the cursor. The cursor marks the place where the letters appear when you type."; 
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		image=R.drawable.l03s01cursor;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
	}

	
	
}
