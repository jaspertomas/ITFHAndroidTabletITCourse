package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S01 {
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
		text="What is Hypertext?";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
		
		text=
				"HTML is the language of the web. It is the language that is used to build web pages and web sites.\n" + 
				"\n" + 
				"HTML stands for HyperText Markup Language. What does that mean? To know what hypertext is, we need to know what text is.\n" + 
				"\n" + 
				"Text is anything that you can read. Text books are books that contain a lot of text. Text messages are messages that are made of text.\n" + 
				"\n" + 
				"Hypertext is called hypertext for the same reason that Superman is called Superman. Superman is a super man. He is a man who is super. In the same way, Hypertext is hyper text. It is text that is hyper. =D\n" + 
				"\n" + 
				"It is hyper because it has color and size. It can be underlined, bold or italicized. It can be clicked, and when it is clicked, it can open a new web page. It can show pictures. It can create tables and lists. And it can other things. This is why hypertext is more hyper than text.\n" + 
				"\n" + 
				"This is text:\n" + 
				"\n" + 
				"        Hello world!\n" + 
				"\n" + 
				"And this is hypertext:";
				list.add(new CustomListItem(CustomListItem.TEXT,text));
				
				image=R.drawable.l04s01helloworld1;
				list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				

				//------Formatting------------
				text="Building a web page is like writing a document in Microsoft Word. You can adjust the size and color of the letters, change the font, make the letters bold, underlined or italicized. You can even align the letters left and right. The next few lessons will show you how."; 
				list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		
		
	}

	
	
}
