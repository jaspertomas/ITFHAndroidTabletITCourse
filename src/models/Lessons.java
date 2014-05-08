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
			{"1.1: What is IT for Humanity Android Tablet IT Course","1",},
			{"1.2: Some friendly reminders","2",},
			{"2.1: File Management","3",},
			{"3.1: Text Editing","4",},
			{"4.1: Introduction to HTML","5",},
		};
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
	private static ArrayList<CustomListItem> getLesson(Integer lesson_id)
	{
		switch(lesson_id)
		{
			case 1: return L1S1.getLessons();
			case 2: return L1S2.getLessons();
			default:return new ArrayList<CustomListItem>();
		}
	}
	public static Integer getLessonId(String name)
	{
		for(String[] lesson:list)
		{
			if(lesson[0].contentEquals(name))return Integer.parseInt(lesson[1]);
		}
		return null;
	}
	public static ArrayList<CustomListItem> getLesson(String name)
	{
		return getLesson(getLessonId( name));
	}

	
	
}
