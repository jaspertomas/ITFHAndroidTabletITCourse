package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S03 {
	public static final String title="4.3: Using HTML Play Lite";
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


		//------HTML Play------------
		text="For those using a tablet, it will be easier for you to study HTML by using \"HTML Play Lite\". HTML Play Lite is an Android App. You can download it from the Google Play Store, or from here:";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		text="http://www.itforhumanity.com/ithome/latest/latest/ITFH-it-course-apps"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=50,w=800"));

		text="Remember, the name of the app is HTML Play Lite. Lite means it is free. There is another app that has the name HTML Play, and it is not free." +
		"\n\n" +
		"HTML Play Lite will allow you to see the results of your work with one click of a button.\n" + 
		"\n" + 
		"Now open HTML Play Lite and use it instead of Jota+. \n" + 
		"\n" + 
		"Again, type (or select, copy and paste) this code into HTML Play Lite.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		text="<font color=red size=7>Hello world!</font>";
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=400"));
						
		text="Now click on the \"Preview\" button. What do you see? It should be something like";
		list.add(new CustomListItem(CustomListItem.TEXT,text));

		image=R.drawable.l04s01helloworld2;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
		
		text="Click the \"HTML\" button to go back to the code. Remove the words 'color=red', and click Preview. What do you see?";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
			
		image=R.drawable.l04s01helloworld3;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
						
		text="Click the HTML button again and remove the words 'size=7', and click Preview. What do you see?\n" +
		"\n" +
		"        Hello world!";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		text="Finally, remove the words '<font>' and '</font>', and click Preview. What do you see?\n" +
		"\n" +
		"        Hello world!\n" +
		"\n" +
		"Without the HTML tags (the <> symbols and the words inside them), the contents of your web page are now the same as a text file.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		text="HTML Tags";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
						
		text="Html is made up of tags. '<font>' is a tag. It is the very first tag we will learn. We will learn more tags later.\n" + 
		"\n" + 
		"Tags are what make hypertext hyper. Without the tags, hypertext is just, well, text. We tried this in the previous lesson. We started out with a big red";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
			
		image=R.drawable.l04s01helloworld2;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
						
		text="removed the tags, and ended up with just\n" + 
		"\n" + 
		"        Hello world!.\n" + 
		"";
		
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		
		text="Play around with HTML Play Lite";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
						
		text="Go ahead and experiment with HTML. Change the font size to 1, 2, 3 ... 10. See what happens.\n\n" +
		"Change the font color to yellow, green, pink, blue, gray, black and white, lightblue (notice that there is no space between the words \"light\" and \"blue\"), and any other color you can think of.\n\n" +
		"Finally, paste this into HTML Play Lite: ";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
			
		text="<font color=red size=7>Hello </font><font color=blue size=6>world!</font>"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=800"));
		
		text="What do you see?" +
				"\n\n" +
				"Saying \"HTML Play Lite\" over and over again is a little tiring. For the rest of this tutorial, I'll just say HTML Play, and remember that I'm talking about HTML Play Lite.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
			
		
	}

	
	
}
