package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S3 {
	public static final String title="2.3: Folders";
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

		
		//---------------------
		text="Folders allow your computer to arrange your files in a neat way. There are thousands of files in your tablet, but you don't see them because they are in the other folders. Imagine if your picture was with thousands of other files. It would take hours for you to find your picture!"+
		"\n" + 
		"\n" + 
		"In the activity earlier, we opened 3 folders to find your picture: sdcard, DCIM and Camera. Camera is your picture's 'parent folder'. DCIM is the parent of Camera, and sdcard is the parent of DCIM. It's like they are all one big family. The parent of sdcard is mnt. We did not have to go through mnt, because when we opened the File Manager, we were already inside mnt.\n" + 
		"\n" + 
		"Another way to think of the folders is by thinking that they are addresses, like the address of your home. Inside the world are different countries. Inside those are provinces, cities, streets, and houses. Notice that the address of your home contains your street, your city, and your province. For example:\n" + 
		"\n" + 
		"123 P. Burgos St., Tacloban City, Leyte\n" + 
		"\n" + 
		"Folders are the same.\n" + 
		"\n" + 
		"The address of your picture can be written like this:\n" + 
		"\n" + 
		"/mnt/sdcard/DCIM/Camera/verylongfilename.jpg\n" + 
		"";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		image=R.drawable.l02s01path;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
		text="	From now on, when I ask you to go to a folder, I will use its address. For example, if I need you to go to the folder sdcard, I will tell you to go to /mnt/sdcard. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
	}

	
	
}
