package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S6 {
	public static final String title="2.6: Managing Pictures";
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

		

		//--------------------------
		text="Managing Pictures";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
		
		
		text="Let's take your picture, change its name to something more appropriate, and put it in your folder.\n" + 
				"\n" + 
				"    Go to /mnt/sdcard/DCIM/Camera\n" + 
				"    Press on your picture with your finger (or mouse) until a menu appears\n" + 
				"    Click on Rename File\n" + 
				"    Enter the name 'mypic'\n" + 
				"    Click 'Rename' ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		
		text="";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		text="";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		text="";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
			
	}

	
	
}
