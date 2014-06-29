package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L3S05 {
	public static final String title="3.5: Creating your first text file";
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

		//-----------------
		text="If you have not installed Jota+ yet, install it now. You can download it here or here (please connect to the internet first), or install it from the Google Play Store.\n" + 
		"\n" + 
		"Also, make sure that your keyboard is connected. Press the Num Lock key. The Num Lock light should light up. (The Num Lock Light is above the Num Lock key) Press the Num Lock key again to turn it off. If it does not light up, it means your keyboard is loose. Disconnect and reconnect your keyboard.\n" + 
		"\n" + 
		"Now, let us create your first file.\n" + 
		"\n" + 
		"    Open Jota+\n" + 
		"    Type something. For example, type 'Hello' or your name.\n" + 
		"    Click on 'save'\n" + 
		"    Go to your folder (myfiles)\n" + 
		"    Change the filename to myfile.txt\n" + 
		"    Click 'save' ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		slideshowprefix="l03s01ayourfirsttextfilep57";
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Creating your first text file",slideshowprefix));
		
		text="Now open the File Manager and go to myfiles to see that myfile.txt really is there.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		image=R.drawable.l03s01yourfirsttextfile;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
	}

	
	
}
