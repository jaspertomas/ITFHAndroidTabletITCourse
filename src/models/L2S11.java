package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S11 {
	public static final String title="2.11: Overwriting Existing Files";
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
		image=R.drawable.l02s01overwrite;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
		text="Folders cannot have two files with the same file name inside them. When a folder already has a file with a certain name, and you copy (or move) into it another file with the same name, you will be asked if you wish to delete the old file, to give way to the new file. If you click Copy (or Move), the old file will be gone, and the file being copied will take its place. This is called Overwriting.\n" + 
				"\n" + 
				"If you want to keep the old file, you can rename it before you copy the new file. Or you can rename the new file. Or you can create a new folder, and paste the new file in there. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		
		
	}

	
	
}
