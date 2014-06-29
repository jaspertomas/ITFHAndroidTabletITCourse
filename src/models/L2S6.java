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
		text="Let's take your picture, change its name to something more appropriate, and put it in your folder.\n" + 
				"\n" + 
				"    Go to /mnt/sdcard/DCIM/Camera\n" + 
				"    Press on your picture with your finger (or mouse) until a menu appears\n" + 
				"    Click on Rename File\n" + 
				"    Enter the name 'mypic'\n" + 
				"    Click 'Rename' ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		slideshowprefix="l02s07arenametomyficp24";
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Rename your picture file",slideshowprefix));
		
		text="\n" + 
				"Notice that Rename did not change the file extension (or last name) of your file. It only changed the first name.\n" + 
				"\n" + 
				"Now let's move your picture to your folder.\n" + 
				"\n" + 
				"    Press on your picture with your finger (or mouse) until a menu appears\n" + 
				"    Click on Move (Cut) File\n" + 
				"    Notice the message that says \"Holding mypic.jpg\".\n" + 
				"    Go to /mnt/sdcard/myfiles\n" + 
				"    Click on the last tab to the right (the one that looks like a sheet of paper. This is called the 'file operations tab')\n" + 
				"    Click 'Paste' ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		
		slideshowprefix="l02s07amovetomyfilesp26";
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Move your picture to the 'myfiles' folder",slideshowprefix));
		
		text="The message saying 'Holding mypic.jpg' means that there is a file in the 'clipboard' or memory, and that you can paste the file in a different folder. Remember the previous lesson, where we copied some words into the clipboard, and pasted them into another box? Here we are copying a file into the clipboard and pasting it into another folder. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
	}

	
	
}
