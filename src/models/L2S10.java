package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S10 {
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
		text="		Folders are also files, so you can also rename, copy, move and delete them in the same way.\n" + 
				"\n" + 
				"		When you copy a folder, you copy all the files and folders inside it. If you have many files that you copy or move often, it will be easier if you put them inside a folder, and copy or move the folder instead. 		\n" + 
				"";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		
		
	}

	
	
}
