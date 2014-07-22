package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S06 {
	public static final String title="4.6: Bold, Italics and Underline";
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
		text="If you have used Microsoft Word before, you'll know that you can make your letters fatter, slanted or underlined. You can do that with HTML too.";

		//underline
		text="Paste this code in HTML Play:";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		text="<u>Hello World!</u>"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));
			
		text="This will give you";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		image=R.drawable.l04s02underline;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
					
		text="Notice the line under the words. This is called 'underlining the words'. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		//bold
		text="Paste this code in HTML Play:";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		text="<b>Hello World!</b>"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));
			
		text="This will give you";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		image=R.drawable.l04s02bold;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
					
		text="Notice that the words are fatter. This is called 'setting the words in bold'. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		//bold
		text="Paste this code in HTML Play:";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		text="<i>Hello World!</i>"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));
			
		text="This will give you";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		image=R.drawable.l04s02italics;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
					
		text="Notice that the words are slanted, as if they are falling to the side. This is called 'setting the words in italics'. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		//bold, italics and underline
		text="Now try this:";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		text="<b><u><i>Hello World!</i></u></b>"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));
			
		text="We put bold, underline and italic tags around \"Hello World!.\"This will give you";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		image=R.drawable.l04s02bolditalicunderline;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
					
		text="You can combine them in any way you want. You can use just bold and italics, or just bold and underline, or just underline and italics. ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
	}

	
	
}
