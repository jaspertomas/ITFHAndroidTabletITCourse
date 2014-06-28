package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S2 {
	public static final String title="2.2: The File Manager";
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

		
		//--------------------------------
		text="The File Manager";
		list.add(new CustomListItem(CustomListItem.TITLE,text));

		text="This is the File Manager app";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		image=R.drawable.l02s01filemgrwhere;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
		text="Let's create a file, and try doing something with it using the File Manager. Open your Camera app and take a picture.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		image=R.drawable.l02s01camera1;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		image=R.drawable.l02s01camera2;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));

		text="The camera saves its pictures in the folder /mnt/sdcard/DCIM/camera. To see your picture, do this:\n" + 
				"\n" + 
				"    Open the File Manager app\n" + 
				"    Click on 'sdcard'\n" + 
				"    Look for 'DCIM' and click on it\n" + 
				"    Click on 'Camera'\n" + 
				"    Your picture will be the one at the bottom of the list. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		slideshowprefix="l02s01afilemgrgotocamerap11";
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Let's go to the CAMERA folder",slideshowprefix));
		
		text="	There's your picture. Click on it to see what it looks like. If you have taken a lot of pictures, your picture will be at the very bottom of the list.\n";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
	}

	
	
}
