package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S8 {
	public static final String title="2.8: Copying many files at the same time";
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
		text="There is another way to work with files that lets you copy (or move, or delete) many files at the same time.\n" + 
				"\n" + 
				"		    Click on the last tab to the right (the one that looks like a sheet of paper. This is called the 'file operations tab')\n" + 
				"		    Click, one at a time, on the files that you wish to copy\n" + 
				"		    Click Copy\n" + 
				"		    Go to the folder where you wish to copy the files\n" + 
				"		    Click on the file operations tab again\n" + 
				"		    Click 'Paste' \n" + 
				"";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		image=R.drawable.l02s08amulticofyp02;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
		slideshowprefix="l02s08amulticofyp29";
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Copying many files at the same time",slideshowprefix));

		text="		This is called multiselect or multiple selection.\n" + 
				"\n" + 
				"		Sometimes multiple selection stops working. To fix this, click on the File Operations Tab twice (2 times) to turn multiple selection off and back on again.\n" + 
				"";
		list.add(new CustomListItem(CustomListItem.TEXT,text));


		slideshowprefix="l02s08amulticofyfixp23";
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "What to do when multiple selection breaks",slideshowprefix));
		
		
	}

	
	
}
