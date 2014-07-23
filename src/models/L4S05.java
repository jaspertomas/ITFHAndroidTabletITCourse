package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S05 {
	public static final String title="4.5: Line Breaks";
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
		/*
		text="What is Hypertext?";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
		
		text="";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		image=R.drawable.l04s01helloworld1;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
		text="<font color=red size=7>Hello world!</font>"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=400"));
		*/
		





	//--Line Breaks---
	text="Line Breaks";
	list.add(new CustomListItem(CustomListItem.TITLE,text));
	
	text="In Jota+ or any other text editor, if you want to go down the page and start typing on a new line, you press the Enter key. The Enter key creates what is called a \"Line Break\".\n" + 
			"\n" + 
			"To better understand what a line break is, click on the box below and type your first name. Then press the Enter Key 2 times, and type your last name. Notice that your last name is 2 lines below your first name. That is because you put 2 line breaks between your first name and last name.";
	list.add(new CustomListItem(CustomListItem.TEXT,text));

	text=""; 
	list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));
	
	text="In HTML, we use the <BR> tag to move words to the next line. BR is short for \"break\"\n" + 
			"\n" + 
			"Paste this code into HTML Play:";
	list.add(new CustomListItem(CustomListItem.TEXT,text));
			
	text="Hello <br> World!"; 
	list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));
		
	text="This moves the word \"World\" on to the line below Hello.\n" + 
			"\n" + 
			"Try this:";
	list.add(new CustomListItem(CustomListItem.TEXT,text));
			
	text="Hello <br><br> World!"; 
	list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));

	text="and this:";
	list.add(new CustomListItem(CustomListItem.TEXT,text));

	text="Hello \n" + 
			"<br>\n" + 
			"<br> \n" + 
			"World!" + 
			""; 
	list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));

	text="They give you exactly the same result, right? That's because line breaks inside the code do not affect the result. They don't do anything except make the code look cleaner and more orderly for you, the programmer.";
	list.add(new CustomListItem(CustomListItem.TEXT,text));

		
	}

	
	
}
