package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S7 {
	public static final String title="2.7: Other things you can do with Files";
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

		text="You now know how to create folders, and how to rename and move files. You can also delete or erase files, and copy them, by using the other buttons in the file operations menu.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		image=R.drawable.l02s01fileoperationsmenu;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
		text="To make the File Operations Menu show up, press on a file or folder for 2 seconds inside the File Manager. For a demonstration, see the previous lesson.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
	}

	
	
}
