package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S04 {
	public static final String title="4.4: Fonts";
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
		text="You can change the style, or \"Font\", of your letters. Microsoft Word lets you choose from a lot of fonts. These are some fonts:";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		image=R.drawable.l04s02fonts;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
//		image=R.drawable.l04s02monospace;
//		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
//				
//		image=R.drawable.l04s02serif;
//		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
//				
//		image=R.drawable.l04s02sansserif;
//		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
//				
		text="Paste this code in HTML Play, and you'll get something that looks like the fonts above:";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		text="<font face=\"times new roman\" size=7>ABCDEFabcdef this is Times New Roman</font>\n" + 
			"<br><font face=arial size=7>ABCDEFabcdef this is Arial</font>\n" + 
			"<br><font face=courier size=7>ABCDEFabcdef this is Courier</font>"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));
		
		text="<font face=courier> means that the font to be used is Courier." +
			"\nIf the font's name has spaces in it, like \"Times New Roman\", you need to put it in quotes (\" \"), or HTML will think that your font's name is just Times and not Times New Roman.\n" + 
			"\nTimes New Roman, Arial and Courier are some of the most popular and most often used fonts in today's world.\n" + 
			"";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		
	}

	
	
}
