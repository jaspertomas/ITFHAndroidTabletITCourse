package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L1S3 {
	public static final String title="1.3: Shortcut Keys";
	private static ArrayList<CustomListItem> list=null;
	public static ArrayList<CustomListItem> getLessons()
	{
		if(list==null)init();
		return list;
	}
	private static void init()
	{
		list=new ArrayList<CustomListItem>();
		//list.add(new CustomListItem(CustomListItem.TITLE,"Take care of your eyes"));
		list.add(new CustomListItem(CustomListItem.TEXT," We will be learning about some techniques that can save you a lot of time. They are called Shortcut Keys. Shortcut keys use 3 buttons a lot - Alt, Ctrl and Shift. There are 2 of each: one on the left and one on the right. Both buttons do the same thing. It doesn't matter which one you press.\n" + 
				"\n" + 
				"They are always used together with one of the other keys. For example, Ctrl-A means press Ctrl together with A. Since A is on the left side of the keyboard, you may want to press A with your left hand and Ctrl on your right hand. "));
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l01s01keyboard,""));
		
		list.add(new CustomListItem(CustomListItem.TITLE,"Select, Copy and Paste"));

		list.add(new CustomListItem(CustomListItem.TEXT,"Whenever you see something like this "));

		list.add(new CustomListItem(CustomListItem.TEXTBOX,"Hi mom!","h=100,w=400"));
				
		list.add(new CustomListItem(CustomListItem.TEXT,"\n" + 
				"often it is to show code that you will have to type. Instead of typing it one letter at a time, you can save lots of time by simply copying it like this: Click inside the box above. Now press Ctrl-A (Control-A) to select all of its contents. Ctrl-A means 'Select All'.\n" + 
				"\n" + 
				"One way to press Ctrl-A is this. Press, and don't let go of, the Right Ctrl key with your right hand. Then press and let go of the A key with your left hand. Then let go of the Ctrl key. Notice that the words in the box will turn orange. This means that you have successfully selected the words in the box. "));

		//list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Slide Show 1","l00s00p05"));
		list.add(new CustomListItem(CustomListItem.TEXT,"\n" + 
				"\n" + 
				"Another way to press Ctrl-A is to press and hold down the Left Ctrl key with your left little finger, then press the A key with your left ring or middle finger. Try both methods and see which one you are more comfortable with. "));

		//list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Slide Show 1","l00s00p05"));
		list.add(new CustomListItem(CustomListItem.TEXT,"\n" + 
				"\n" + 
				"After you have pressed Ctrl-A, press Ctrl-C to copy the words you have selected into memory, also known as the 'clipboard'. (Ctrl-C means Copy.) When you do this, you will see a message saying 'Text copied to clipboard'. "));
		//list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Slide Show 1","l00s00p05"));
		list.add(new CustomListItem(CustomListItem.TEXT,"\n" + 
				"You can then paste the contents of the clipboard into other textboxes, like this one below. Click inside it, and press Ctrl-V. (Ctrl-V means Paste.) If you do it properly, the contents of the first box will appear in the second box."));

		list.add(new CustomListItem(CustomListItem.TEXTBOX,"","h=100,w=400"));

		list.add(new CustomListItem(CustomListItem.TEXT,"\n" + 
				"You can also paste the words into other apps. This will save you a lot of time later. Please practice doing it until you are comfortable with it.\n" + 
				"\n" + 
				"Ctrl-A, Ctrl-C and Ctrl-V are called 'Shortcut Keys'. "));
		list.add(new CustomListItem(CustomListItem.TEXT,""));
		list.add(new CustomListItem(CustomListItem.TEXT,""));

		//list.add(new CustomListItem(CustomListItem.SPACER));
		
		
		//list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Slide Show 1","l00s00p05"));
				

	}

	
	
}
