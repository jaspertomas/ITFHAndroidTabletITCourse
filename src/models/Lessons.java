package models;

import java.util.HashMap;

/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class Lessons {
	public static String[][] list=
		{
			{"How to use this tutorial","0",},
			{"File Management","1",},
			{"Text Editing","2",},
			{"Introduction to HTML","3",},
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
	public static void main(String args[])
	{
		
		System.out.println(list[1][1]);
	}
	
	
}
