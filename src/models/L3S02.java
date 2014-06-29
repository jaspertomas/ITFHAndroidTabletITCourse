package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L3S02 {
	public static final String title="3.2: Text Editors";
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
		text="A program for writing text files is called a text editor.\n" + 
		"\n" + 
		"There are many apps that can be used to edit files in an android tablet. The one I recommend is Jota+.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		image=R.drawable.l03s01jota1;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
		image=R.drawable.l03s01jota2;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));

		
		
	}

	
	
}
