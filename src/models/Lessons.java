package models;

import java.util.ArrayList;
import java.util.HashMap;

import views.customlist.CustomListItem;

/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class Lessons {
	public static String[] list=
		{
			L1S1.title,
			L1S2.title,
			L1S3.title,
		};
	public static ArrayList<CustomListItem> getLesson(String name)
	{
		if(name.contentEquals(L1S1.title))return L1S1.getLessons();
		else if(name.contentEquals(L1S2.title))return L1S2.getLessons();
		else if(name.contentEquals(L1S3.title))return L1S3.getLessons();
		else return new ArrayList<CustomListItem>();
	}	

}
