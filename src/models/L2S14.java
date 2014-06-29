package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S14 {
	public static final String title="2.10: Working with Folders";
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
		text="Working with Folders";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
		
		text="";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		
		
	}

	
	
}
