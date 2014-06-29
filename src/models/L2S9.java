package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S9 {
	public static final String title="2.9: Copying and Cutting Files";
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


		//------------------------------
		text="	What's the difference between copying a file and moving (or cutting) it?\n" + 
				"\n" + 
				"	Remember in the previous lesson, where we copied and cut words? When you copy words, you don't delete the original words. When you move (or cut) words, you delete the old words and put them somewhere else.\n" + 
				"\n" + 
				"	When you copy a file, the original file stays where it is, so you have 2 copies of the same file. If something bad happens to one of the files, you still have one.\n" + 
				"\n" + 
				"	When you move (or cut) a file, the original file is deleted. If something bad happens to the new file, it is gone.\n" + 
				"\n" + 
				"	It is a good idea to make copies of important files and put them in a safe place. This is called backing up or making a back up. 		\n" + 
				"";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
	}

	
	
}
