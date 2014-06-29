package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S12 {
	public static final String title="2.12: Using flash disks";
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
		text="USB Drives are also called USB Disks and Flash Disks";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		text="If you have a usb hub, just connect your flash disk to your usb hub. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		image=R.drawable.l02s01usbconnect3;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
		text="If you do not have a usb hub, disconnect your usb keyboard from your usb-to-microusb adapter and instead insert the flash disk. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		image=R.drawable.l02s01usbconnect1;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
		image=R.drawable.l02s01usbconnect2;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
		text="To see the contents of your Flash Disk, open File Manager and click on the USB tab. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		text="Today's cheap Android JellyBean tablets can read only 1 flash disk at a time. Maybe in the future, you will be able to read and write to 2 flash disks at the same time.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		slideshowprefix="l02s12aofenusbdiskp11";
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "How to open a Flash Disk",slideshowprefix));
		
	}

	
	
}
