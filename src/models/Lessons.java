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
			L2S7.title,
			L2S8.title,
			L2S9.title,
			L2S10.title,
			L2S11.title,
			L2S12.title,
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
		else if(name.contentEquals(L2S7.title))return L2S7.getLessons();
		else if(name.contentEquals(L2S8.title))return L2S8.getLessons();
		else if(name.contentEquals(L2S9.title))return L2S9.getLessons();
		else if(name.contentEquals(L2S10.title))return L2S10.getLessons();
		else if(name.contentEquals(L2S11.title))return L2S11.getLessons();
		else if(name.contentEquals(L2S12.title))return L2S12.getLessons();
		else return new ArrayList<CustomListItem>();
	}	

}
