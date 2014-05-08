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
				
		list.add(new CustomListItem(CustomListItem.TEXT,
				"often it is to show code that you will have to type. Instead of typing it one letter at a time, you can save lots of time by simply copying it like this: Click inside the box above. Now press Ctrl-A (Control-A) to select all of its contents. Ctrl-A means 'Select All'.\n" + 
				"\n" + 
				"One way to press Ctrl-A is this. Press, and don't let go of, the Right Ctrl key with your right hand. Then press and let go of the A key with your left hand. Then let go of the Ctrl key. Notice that the words in the box will turn blue. This means that you have successfully selected the words in the box. "));

		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Ctrl-A: The easy way","l01s01a01p04"));
		list.add(new CustomListItem(CustomListItem.TEXT,
				"\n" + 
				"Another way to press Ctrl-A is to press and hold down the Left Ctrl key with your left little finger, then press the A key with your left ring or middle finger. Try both methods and see which one you are more comfortable with. "));

		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Ctrl-A: The quick way","l01s01a02p02"));
		list.add(new CustomListItem(CustomListItem.TEXT,
				"\n" + 
				"After you have pressed Ctrl-A, press Ctrl-C to copy the words you have selected into memory, also known as the 'clipboard'. (Ctrl-C means Copy.) When you do this, you will see a message saying 'Text copied to clipboard'. "));
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Ctrl-C","l01s01a03p02"));
		list.add(new CustomListItem(CustomListItem.TEXT,
				"You can then paste the contents of the clipboard into other textboxes, like this one below. Click inside it, and press Ctrl-V. (Ctrl-V means Paste.) If you do it properly, the contents of the first box will appear in the second box."));

		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Ctrl-V","l01s01a04p02"));
		list.add(new CustomListItem(CustomListItem.TEXTBOX,"","h=100,w=400"));

		list.add(new CustomListItem(CustomListItem.TEXT,
				"You can also paste the words into other apps. This will save you a lot of time later. Please practice doing it until you are comfortable with it.\n" + 
				"\n" + 
				"Ctrl-A, Ctrl-C and Ctrl-V are called 'Shortcut Keys'. "));
		
		//select, cut and paste
		list.add(new CustomListItem(CustomListItem.TITLE,"Select, Cut and Paste"));
		list.add(new CustomListItem(CustomListItem.TEXT,"Another way to copy words is to 'cut' or 'move' them. Select the words 'Hi mom!' in the box below again, by clicking on it and pressing Ctrl-A, but instead of pressing Ctrl-C to copy, use Ctrl-X. "));
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Ctrl-X","l01s01a05p02"));

		list.add(new CustomListItem(CustomListItem.TEXTBOX,"Hi mom!","h=100,w=400"));
		list.add(new CustomListItem(CustomListItem.TEXT,"Notice that the words disappeared. Now click inside this second box below and press Ctrl-V. "));

		list.add(new CustomListItem(CustomListItem.TEXTBOX,"","h=100,w=400"));
		
		list.add(new CustomListItem(CustomListItem.TEXT,"The words from the first box should appear in the second box. If so, you have just moved the words from the first box to the second box. This is called cutting or moving. "));
		
		//selecting just a few words
		list.add(new CustomListItem(CustomListItem.TITLE,"Selecting just a few words"));
		list.add(new CustomListItem(CustomListItem.TEXT,"Select not all, but just a few words, in the box below.\n" + 
				"\n" + 
				"Click (with your finger, or with your mouse) and hold on one of the words in the box below, for a second or two. Notice that the word has turned blue."));
		
		list.add(new CustomListItem(CustomListItem.TEXTBOX,"The quick brown fox jumped over the lazy dog. \n The quick brown fox jumped over the lazy dog. \nThe quick brown fox jumped over the lazy dog.","h=100,w=400"));
		
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l01s01select,""));
		
		list.add(new CustomListItem(CustomListItem.TEXT,
				"\n" + 
				"Press and don't let go of the Left Shift key with your left hand. Now, with your right hand, press the Right Arrow key several times. Watch as the blue highlight grows, one letter at a time. \n" + 
				"\n" + 
				"Press the Left Arrow key. What happens? The blue highlight grows smaller, one letter at a time.\n" + 
				"\n" + 
				"Press and hold down the Right Arrow key for a long time. Do this until the entire sentence is blue. If you go past the end of the sentence, press the Left Arrow key several times to go back. Then let go of the Shift key.\n" + 
				"\n" + 
				"You have now selected a sentence. Copy the sentence by pressing Ctrl-C, and then paste it into the text box below by clicking inside the box and pressing Ctrl-V. "));

		list.add(new CustomListItem(CustomListItem.TEXTBOX,"","h=100,w=400"));
		
		
		//selecting without the keyboard
		list.add(new CustomListItem(CustomListItem.TITLE,"Copy, Cut and Paste without the Keyboard"));
		list.add(new CustomListItem(CustomListItem.TEXT,"You have probably seen this in the upper right hand of the screen: \n" ));
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l01s01selectmenu,""));
		list.add(new CustomListItem(CustomListItem.TEXT,"It is called the Selection Menu. When you select something, it appears, so that you can copy, cut and paste without using the keyboard.\n" + 
				"\n" + 
				"Try it. Select something, and watch the Selection Menu appear. Click Copy. Then click on a textbox for a few seconds until the Paste button appears: "));
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l01s01paste,""));
		list.add(new CustomListItem(CustomListItem.TEXT,"Click Paste." ));
		
		
		
		//switching between apps
		list.add(new CustomListItem(CustomListItem.TITLE,"Switching between apps"));
		list.add(new CustomListItem(CustomListItem.TEXT," You will usually have 3 or 4 apps open at the same time. To switch quickly between apps, use the Alt-Tab shortcut key.\n" + 
				"\n" + 
				"First, make sure that there are at least 3 apps open. If not, open some apps.\n" + 
				"\n" + 
				"Now do this: "));
		list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Alt-Tab","l01s01a06p08"));

		list.add(new CustomListItem(CustomListItem.TEXT,
				
				"    Press and hold down the Alt key.\n" + 
				"    Press and quickly let go of the Tab key. Do not let go of the Alt key yet.\n" + 
				"    You should see something like this: "));

		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l01s01alttab,"Notice that the Browser app (the one that looks like a planet) is highlighted (or has a blue circle around it)."));
		
		
		//list.add(new CustomListItem(CustomListItem.SPACER));
		
		
		//list.add(new CustomListItem(CustomListItem.SLIDESHOW, "Slide Show 1","l00s00p05"));
		list.add(new CustomListItem(CustomListItem.TEXT,
				"    Press the Tab key again. Watch the highlight move to the next app.\n" + 
				"    Keep pressing the Tab key until the highlight is on top of the app you wish to open.\n" + 
				"    Now let go of the Alt key. \n" + 
				"\n" + 
				"This will open the app that you have chosen.\n" + 
				""));
				

	}

	
	
}
