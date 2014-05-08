package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class Lesson1 {
	private static ArrayList<CustomListItem> list=null;
	public static ArrayList<CustomListItem> getLessons()
	{
		if(list==null)init();
		return list;
	}
	private static void init()
	{
		list=new ArrayList<CustomListItem>();
		list.add(new CustomListItem(CustomListItem.TITLE,"Lesson 1: How to use this tutorial"));
		list.add(new CustomListItem(CustomListItem.TEXT,"\n" + 
					"This tutorial is for Filipinos who live in the provinces, and other people who are not very good at english, and do not have enough money to buy an expensive computer. This will show you how to learn Information Technology and Computer Programming using a cheap android tablet.\n" + 
					"\n" + 
					"This tutorial is designed to be used with an android tablet with a usb keyboard, and maybe even a usb mouse, as shown below. Android version 4.0 (Jellybean) or above is required. I recommend a tablet with a power adapter port aside from a microusb port. (See below: Choosing a Tablet)\n" + 
					"\n" + 
					"Mozilla Firefox Browser for Android is recommended. "));
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.alttab,"This is a picture"));
		list.add(new CustomListItem(CustomListItem.TEXTBOX,"hello world!"));
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Slide Show 1","l00s00p05"));
		
		

	}

	
	
}
