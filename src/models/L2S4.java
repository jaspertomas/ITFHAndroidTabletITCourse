package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S4 {
	public static final String title="2.4: The Root Folder";
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
		text="The Root Folder";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
		

		text=" The parent of mnt is called the 'root folder'. It is like Adam or Eve, because it is the parent of all the files and folders. It doesn't have a name, but it is very important because all the files in your tablet are inside it. It is like 'Planet Earth'. Nobody needs to say 'Planet Earth' in their address, because everybody lives in Planet Earth.\n" + 
				"\n" + 
				"The address of the root folder is\n" + 
				"\n" + 
				"/\n" + 
				"\n" + 
				"When I tell you to go to /, that means you need to go to the root folder. But File Manager doesn't really let you go to the root folder, so don't worry about it. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		
	}

	
	
}
