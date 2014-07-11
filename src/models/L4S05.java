package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S05 {
	public static final String title="4.1: Introduction to HTML";
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
		/*
		text="What is Hypertext?";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
		
		text="";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		image=R.drawable.l04s01helloworld1;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
		text="<font color=red size=7>Hello world!</font>"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=400"));
		*/
		
	}

	
	
}
