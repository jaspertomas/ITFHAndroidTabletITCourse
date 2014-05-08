package models;

import java.util.ArrayList;
import java.util.HashMap;

import views.customlist.CustomListItem;

/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class Lessons {
	public static String[][] list=
		{
			{L1S1.title},
			{L1S2.title},
			{"2.1: File Management","3",},
			{"3.1: Text Editing","4",},
			{"4.1: Introduction to HTML","5",},
		};
	public static ArrayList<CustomListItem> getLesson(String name)
	{
		if(name.contentEquals(L1S1.title))return L1S1.getLessons();
		else if(name.contentEquals(L1S2.title))return L1S2.getLessons();
		else return new ArrayList<CustomListItem>();
	}	
	private static HashMap<String,String> map=new HashMap<String,String>();
	public static HashMap<String,String> getMap()
	{
		if(map.size()==0)
		{
			init();
		}
		return map;
	}
	private static void init()
	{
		for(String[] pair:list)
		{
			map.put(pair[0], pair[1]);
		}
	}
}
