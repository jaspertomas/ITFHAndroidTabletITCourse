package models;

import java.util.HashMap;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class Lesson1 {
	private static CustomListItem[] list=null;
//	private static HashMap<String,String> map=new HashMap<String,String>();
//	public static HashMap<String,String> getMap()
//	{
//		if(map.size()==0)
//		{
//			init();
//		}
//		return map;
//	}
	
	public static CustomListItem[] getLessons()
	{
		if(list==null)init();
		return list;
	}
	private static void init()
	{
		list=new CustomListItem[3];
		list[0]=new CustomListItem(CustomListItem.TEXT,"\n" + 
					"This tutorial is for Filipinos who live in the provinces, and other people who are not very good at english, and do not have enough money to buy an expensive computer. This will show you how to learn Information Technology and Computer Programming using a cheap android tablet.\n" + 
					"\n" + 
					"This tutorial is designed to be used with an android tablet with a usb keyboard, and maybe even a usb mouse, as shown below. Android version 4.0 (Jellybean) or above is required. I recommend a tablet with a power adapter port aside from a microusb port. (See below: Choosing a Tablet)\n" + 
					"\n" + 
					"Mozilla Firefox Browser for Android is recommended. ");
		list[1]=new CustomListItem(CustomListItem.IMAGE,R.drawable.alttab);
		list[2]=new CustomListItem(CustomListItem.IMAGE,R.drawable.enlargefontsize);
		
		
//		for(String[] pair:list)
//		{
//			map.put(pair[0], pair[1]);
//		}
	}

	
	
}
