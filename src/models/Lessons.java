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
			L2S1.title,
			L2S2.title,
			L2S3.title,
			L2S4.title,
			L2S5.title,
			L2S6.title,
		};
	public static ArrayList<CustomListItem> getLesson(String name)
	{
		if(name.contentEquals(L1S1.title))return L1S1.getLessons();
		else if(name.contentEquals(L1S2.title))return L1S2.getLessons();
		else if(name.contentEquals(L1S3.title))return L1S3.getLessons();
		else if(name.contentEquals(L2S1.title))return L2S1.getLessons();
		else if(name.contentEquals(L2S2.title))return L2S2.getLessons();
		else if(name.contentEquals(L2S3.title))return L2S3.getLessons();
		else if(name.contentEquals(L2S4.title))return L2S4.getLessons();
		else if(name.contentEquals(L2S5.title))return L2S5.getLessons();
		else if(name.contentEquals(L2S6.title))return L2S6.getLessons();
		else return new ArrayList<CustomListItem>();
	}	

}
