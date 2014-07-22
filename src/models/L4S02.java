package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S02 {
	public static final String title="4.2: Your first web page";
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

		//-------------------
		text="Open Jota+. Use it to create a new file, and give it the name mypage.html . (Notice that there is no space between 'my' and 'page'. Remember that when we created your first text file, we gave the file the last name \".txt\". Now, instead of .txt, we will use .html)\n" + 
		"\n" + 
		"Type (or select and copy) the this code into Jota+.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
						
		text="<font color=red size=7>Hello world!</font>"; 
		list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=400"));
		
		text="Save your file, and open it in File Manager.\n" + 
		"\n" + 
		"What do you see? Your file should look something like this:";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
			
		image=R.drawable.l04s01helloworld2;
		list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
						
		text="Congratulations, you have just created your very first web page.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
	}

	
	
}
