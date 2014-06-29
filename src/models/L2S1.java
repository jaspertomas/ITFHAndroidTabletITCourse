package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L2S1 {
	public static final String title="2.1: File Management";
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

		text="What is a file?";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
		
		text="\n" + 
"When you take a picture with your tablet, that picture is a file. MP3's are files. Videos are files. Documents written using a computer are files. Files are pieces of information that are stored inside a computer. And your tablet is a computer.\n" + 
"\n" + 
"Files have first names and last names, like people. Files have names like:\n" + 
"\n" + 
"report.doc\n" + 
"id_picture.jpg\n" + 
"michaeljackson_billyjean.mp3\n" + 
"my_birthday_party.mp4\n" + 
"index.html\n" + 
"\n" + 
"Their last name tells you what kind of file they are. These last names are also called 'file name extensions'. They are usually 3 letters long, like mp3, jpg, png, avi, wmv, php, etc. MP3 files are usually music. "+
"\n" + 
"When you take pictures with your tablet, the pictures are usually JPG files. There are many other kinds of picture files, like PNG, BMP, GIF, etc. Video files or movie files can be MP4, AVI or WMV files. Web pages can be HTM, HTML and PHP.\n" + 
"\n" + 
"These are files "
;
		list.add(new CustomListItem(CustomListItem.TEXT,text));
				
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l02s01files,""));

		text="There is a special kind of file that contains other files. It is called a Folder, or a Directory. Folders look like those cardboard folders you can buy in a book store. They usually do not have a last name.\n" + 
				"\n" + 
				"This is a folder\n" + 
				"";
		list.add(new CustomListItem(CustomListItem.TEXT,text));
		list.add(new CustomListItem(CustomListItem.IMAGE,R.drawable.l02s01folder,""));

		text="There are many things that you can do with files. You can copy them, move them around, delete them, edit them, etc.";
		list.add(new CustomListItem(CustomListItem.TEXT,text));




		
		/*
 * 

l02s01usbconnect1.jpg
l02s01usbconnect2.jpg
l02s01usbconnect3.jpg
l02s01openusbdisk.gif
l02s01multicopyfix.gif
l02s01renametomypic.gif
l02s01createyourfolder.gif

l02s01multicopy.gif
l02s01overwrite.png
l02s01fileoperationstab.png
l02s01movetomyfiles.gif
l02s01renametomypic copy.gif
l02s01fileoperationsmenu.png
l02s01path.png
l02s01filemgr.png
************************************* * 


The parent of mnt is called the 'root folder'. It is like Adam or Eve, because it is the parent of all the files and folders. It doesn't have a name, but it is very important because all the files in your tablet are inside it. It is like 'Planet Earth'. Nobody needs to say 'Planet Earth' in their address, because everybody lives in Planet Earth.

The address of the root folder is

/

When I tell you to go to /, that means you need to go to the root folder. But File Manager doesn't really let you go to the root folder, so don't worry about it.
Your Very Own Folder
Now, let's create your own personal folder, where we will put your files for safe keeping. Let's call it 'myfiles'.

    If you are still inside /mnt/sdcard/DCIM/Camera, Go to /mnt/sdcard
    Click on the menu button
    Click on New Folder
    Enter the name 'myfiles'
    Click 'Create' 


View individual slides here

There. Now you have your very own folder.
Managing Pictures
Let's take your picture, change its name to something more appropriate, and put it in your folder.

    Go to /mnt/sdcard/DCIM/Camera
    Press on your picture with your finger (or mouse) until a menu appears
    Click on Rename File
    Enter the name 'mypic'
    Click 'Rename' 


View individual slides here

Notice that Rename did not change the file extension (or last name) of your file. It only changed the first name.

Now let's move your picture to your folder.

    Press on your picture with your finger (or mouse) until a menu appears
    Click on Move (Cut) File
    Notice the message that says "Holding mypic.jpg".
    Go to /mnt/sdcard/myfiles
    Click on
    Click 'Paste' 


View individual slides here

The message saying 'Holding mypic.jpg' means that there is a file in the 'clipboard' or memory, and that you can paste the file in a different folder. Remember the previous lesson, where we copied some words into the clipboard, and pasted them into another box? Here we are copying a file into the clipboard and pasting it into another folder.
Other things you can do with Files
You now know how to create folders, and how to rename and move files. You can also delete or erase files, and copy them, by using the other buttons in the file operations menu.

Copying many files at the same time
There is another way to work with files that lets you copy (or move, or delete) many files at the same time.

    Click on
    Click, one at a time, on the files that you wish to copy
    Click Copy
    Go to the folder where you wish to copy the files
    Click on
    Click 'Paste' 


View individual slides here

This is called multiselect or multiple selection.

Sometimes multiple selection stops working. When this happens, click twice (2 times) to turn multiple selection off and back on again.


View individual slides here
Copying and Cutting Files
What's the difference between copying a file and moving (or cutting) it?

Remember in the previous lesson, where we copied and cut words? When you copy words, you don't delete the original words. When you move (or cut) words, you delete the old words and put them somewhere else.

When you copy a file, the original file stays where it is, so you have 2 copies of the same file. If something bad happens to one of the files, you still have one.

When you move (or cut) a file, the original file is deleted. If something bad happens to the new file, it is gone.

It is a good idea to make copies of important files and put them in a safe place. This is called backing up or making a back up.
Working with Folders
Folders are also files, so you can also rename, copy, move and delete them in the same way.

When you copy a folder, you copy all the files and folders inside it. If you have many files that you copy or move often, it will be easier if you put them inside a folder, and copy or move the folder instead.
Overwriting Existing Files


Folders cannot have two files with the same file name inside them. When a folder already has a file with a certain name, and you copy (or move) into it another file with the same name, you will be asked if you wish to delete the old file, to give way to the new file. If you click Copy (or Move), the old file will be gone, and the file being copied will take its place. This is called Overwriting.

If you want to keep the old file, you can rename it before you copy the new file. Or you can rename the new file. Or you can create a new folder, and paste the new file in there.
Accessing flash disks
You should only connect 1 flash disk at a time. If you connect 2 flash disks, your tablet will probably not be able to read the second one.

If you have a usb hub, just connect your flash disk to your usb hub.



If you do not have a usb hub, disconnect your usb keyboard from your usb-to-microusb adapter and instead insert the flash disk.





Now, open File Manager and click on the USB tab.


View individual slides here * 
************************************* * 
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
 * */		
	}

	
	
}
