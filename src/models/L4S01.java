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
				
				text="Your first web page";
				list.add(new CustomListItem(CustomListItem.TITLE,text));

				text="Open Jota+. Use it to create a new file, and give it the name mypage.html . (Notice that there is no space between 'my' and 'page'. Also, instead of giving it the last name .txt like in the previous lesson, we use .html)\n" + 
				"\n" + 
				"Type (or select and copy) the following code into your new file.";
				list.add(new CustomListItem(CustomListItem.TEXT,text));
								
				text="<font color=red size=7>Hello world!</font>"; 
				list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=400"));
				
				text="Open your new file using the File Manager.\n" + 
				"\n" + 
				"What do you see? Your file should look something like this:";
				list.add(new CustomListItem(CustomListItem.TEXT,text));
					
				image=R.drawable.l04s01helloworld2;
				list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
								
				text="Congratulations, you have just created your very first web page.\n" + 
				"\n" + 
				"Building a web page is like writing a document in Microsoft Word. You can adjust the size and color of the letters, change the font, make the letters bold, underlined or italicized.\n" + 
				"\n" + 
				"For those using a tablet, it will be easier for you to study HTML by using the app HTML Play (or its free version, HTML Play Lite). Look for it in your tablet. If you don't have it installed, download it from this website (please connect to the internet first): ";
				list.add(new CustomListItem(CustomListItem.TEXT,text));

				text="http://www.itforhumanity.com/ithome/latest/latest/ITFH-it-course-apps"; 
				list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=50,w=800"));

				text="or install it from the Google Play Store. HTML Play will allow you to see the results of your work with one click of a button.\n" + 
				"\n" + 
				"Now open HTML Play and use it instead of Jota+. \n" + 
				"\n" + 
				"Again, type (or select and paste) this code into HTML Play.";
				list.add(new CustomListItem(CustomListItem.TEXT,text));

				text="<font color=red size=7>Hello world!</font>";
				list.add(new CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=400"));
								
				text="Now click on the Preview button. What do you see? It should be something like";
				list.add(new CustomListItem(CustomListItem.TEXT,text));

				image=R.drawable.l04s01helloworld2;
				list.add(new CustomListItem(CustomListItem.IMAGE,image,""));
				
				text="Click the HTML button to go back to the code. Remove the words 'color=red', and click Preview. What do you see?";
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
				"The contents of your web page are now just the same as ordinary text file.";
				list.add(new CustomListItem(CustomListItem.TEXT,text));
				
				text="Open and close tags";
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
		
		
		
	}

	
	
}
