package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L3S01 {
	public static final String title="3.1: Text Editing";
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
		text="Text Files";
		list.add(new CustomListItem(CustomListItem.TITLE,text));
		
		text="Text is anything that you can read - words and numbers. A book full of text is called a Textbook. A message made of text is called a Text Message. A file containing only text is called a text file. Text files have the last name '.txt'.\n" + 
				"\n" + 
				"These are text files. They contain lyrics from Michael Jackson's songs.";
				list.add(new CustomListItem(CustomListItem.TEXT,text));
				
				//----billyjean---
				image=R.drawable.l03s01textfiles;
				list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
				text="A text file contains nothing but text. No colors, no letters of different sizes, no alignment, no bold, italic or underline, no pictures or tables. Just text.";
				list.add(new CustomListItem(CustomListItem.TEXT,text));
				
				//----smile by michael---
				image=R.drawable.l03s01smile;
				list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
								
				text="Some programs such as Microsoft Word let you change the size and color of the text. It allows you to align the text to the left, center or right. These changes are called 'Formatting'. Microsoft Word produces Document Files, or files with the last name '.doc'. Document files contain formatting. Text files do not." +
						"\n\nThis is a document file inside Microsoft Word"; 
				list.add(new CustomListItem(CustomListItem.TEXT,text));
				
				image=R.drawable.l03s01document;
				list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
				text="Document files are more difficult to write than text files. Let's learn how to use a text editor first. We will learn how to use programs like Microsoft Word in a different lesson.\n" + 
				"\n" + 
				"Picture files, MP3 files, and video files are not text files. If you open those kinds of files using a text editor, you will see that they are made up of a lot of stuff that you can't read, made up of lots of jumbled letters and symbols. It is called 'garbage'.";
				list.add(new CustomListItem(CustomListItem.TEXT,text));
				
				//--garbage-----
				image=R.drawable.l03s01garbage;
				list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
				text="When you open a picture, video or mp3 file with a text editor, you get garbage.";

	}

	
	
}
