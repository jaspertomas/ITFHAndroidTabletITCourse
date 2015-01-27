package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S07 {
	public static final String title="4.1: Introduction to HTML";
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
		
		/*
		--Alignment-----

		In Microsoft Word, you can move your text to the center of the page, or to the right. You can do that in HTML too.

		Paste this code in HTML Play:

		This text is left aligned
		<center>This text is centered</center>
		<right>This text is right aligned</right>

		You get this:

		_________________

		You don't have to use tags to align your text to the left, because it is already aligned to the left without you having to do anything.

		--Pictures------------------- 

		Add pictures to your web page by doing this:

		First, use the file manager to copy a picture into <specific folder>
		Then paste this code into HTML Play

		Hello world!
		<br><img src=filename.jpg>

		and replace filename.jpg with the filename of your picture

		You should get something like this:

		Hello world!
		____picture____

		--tables----

		=======end lesson on tables========

		More on tables


				 * */
	}

	
	
}
