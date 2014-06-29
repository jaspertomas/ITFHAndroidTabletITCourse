package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L1S1{
	public static final String title="1.1: What is IT for Humanity's Android Tablet IT Course?";
	
	private static ArrayList<CustomListItem> list=null;
	public static ArrayList<CustomListItem> getLessons()
	{
		if(list==null)init();
		return list;
	}
	private static void init()
	{
		list=new ArrayList<CustomListItem>();
		//list.add(new CustomListItem(CustomListItem.TITLE,"Lesson 1.1: What is IT for Humanity Android Tablet IT Course"));
		list.add(new CustomListItem(CustomListItem.TEXT,"\n" + 
					"This tutorial is for Filipinos who live in the provinces, and other people who are not very good at english, and do not have enough money to buy an expensive computer. This will show you how to learn Information Technology and Computer Programming using a cheap android tablet.\n" + 
					"\n" + 
					"This tutorial is designed to be used with an android tablet with a usb keyboard, and maybe even a usb mouse, as shown below. Android version 4.0 (Jellybean) or above is required. I recommend a tablet with a power adapter port aside from a microusb port. (See below: Choosing a Tablet)\n" 
					//+ 
					//"\n" + 
					//"Mozilla Firefox Browser for Android is recommended. "
					));
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l01s01layout1,"A keyboard connected to a tablet via a usb to microusb adapter "));
		
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l01s01layout2,"A keyboard and a mouse connected to a tablet via a usb-to-microusb adapter and a usb hub.\n" + 
				"A flash disk may be inserted into the hub, to transfer files to and from other devices.\n" + 
				"See Lesson 1 on how to access the flash disk. "));
		
		//list.add(new CustomListItem(CustomListItem.SPACER));
		list.add(new CustomListItem(CustomListItem.TITLE,"Choosing a Tablet"));
		list.add(new CustomListItem(CustomListItem.TEXT," Any tablet will do, as long as its Android version is Jellybean (Android 4.0) or higher. I recommend a tablet with a separate power adapter port (besides the microusb port), so you can use your keyboard and charge your tablet at the same time. If not, you might have to stop studying to charge your tablet every few hours. "));
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l01s01separatepower,""));
		
		//list.add(new CustomListItem(CustomListItem.SPACER));
		
		
		//list.add(new CustomListItem(CustomListItem.TEXTBOX,"hello world!","h=100,w=400"));
		//list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Slide Show 1","l00s00p05"));
		
		

	}

	
	
}
