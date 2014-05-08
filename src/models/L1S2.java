package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L1S2 {
	public static final String prefix="1.2";
	public static final String title="1.2: Some friendly reminders";
	private static ArrayList<CustomListItem> list=null;
	public static ArrayList<CustomListItem> getLessons()
	{
		if(list==null)init();
		return list;
	}
	private static void init()
	{
		list=new ArrayList<CustomListItem>();
		list.add(new CustomListItem(CustomListItem.TITLE,"Take care of your eyes"));
		list.add(new CustomListItem(CustomListItem.TEXT," \n" + 
				"Going back and forth between a tablet, a computer screen, a TV, or a book is a sure way to make your eyes go bad. Rest your eyes before doing something else that is tiring for the eyes.\n" + 
				"\n" + 
				"If you like to study on a tablet or computer for many hours at a time, make sure you adjust the size of the letters so that they are bigger and easier to read. Sometimes there is a way to adjust the color of the letters so that the letters are white and the background is black. I personally find this less tiring for the eyes. "
				+"\n" 
				+"\n" 
				+ 
				"Another way to protect your eyes is to adjust the size of the letters. Most Internet Browsers allow you to make the size of their letters bigger. Bigger letters are easier to read."
				
				));
		
		

	}

	
	
}
