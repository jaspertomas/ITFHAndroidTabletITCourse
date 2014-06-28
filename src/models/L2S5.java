package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S5 {
	public static final String title="2.5: Your Very Own Folder";
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

		
		//---------------------------
		text="Your Very Own Folder";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
		
		
		text=" Now, let's create your own personal folder, where we will put your files for safe keeping. Let's call it 'myfiles'.\n" + 
				"\n" + 
				"    If you are still inside /mnt/sdcard/DCIM/Camera, Go to /mnt/sdcard\n" + 
				"    Click on the menu button\n" + 
				"    Click on New Folder\n" + 
				"    Enter the name 'myfiles'\n" + 
				"    Click 'Create' ";
		
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		slideshowprefix="l02s01acreateyourfolderp21";
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Create your own folder",slideshowprefix));
		
		
		text="There. Now you have your very own folder. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
	}

	
	
}
