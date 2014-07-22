package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;



/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S07 {
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
		
		/*
		--Alignment-----

		In Microsoft Word, you can move your text to the center of the page, or to the right. You can do that in HTML too.

		Paste this code in HTML Play:

		This text is left aligned
		<center>This text is centered</center>
		<right>This text is right aligned</right>

		You get this:

		_________________

		You don't have to use tags to align your text to the left, because it is already aligned to the left without you having to do anything.

		--Pictures------------------- 

		Add pictures to your web page by doing this:

		First, use the file manager to copy a picture into <specific folder>
		Then paste this code into HTML Play

		Hello world!
		<br><img src=filename.jpg>

		and replace filename.jpg with the filename of your picture

		You should get something like this:

		Hello world!
		____picture____

		--tables----
		In Microsoft Word, you can also create tables (the one with rows and columns, not the one with chairs.) 

		This is a phone directory. The names, addresses and phone numbers are arranged inside a table to make them orderly. 

		Name Address Phone No.
		Barack Obama White House 1234567
		Noynoy Aquino Malacanang Palace 7654321

		Tables are a great way to arrange parts of your webpage. 

		(show a picture gallery)

		To create a table, paste this code in HTML Play:


		<table border=1>
			<tr>
				<td>Hello</td>
				<td>world!</td>
			</tr>
			<tr>
				<td>Happy</td>
				<td>to</td>
			</tr>
			<tr>
				<td>see</td>
				<td>you!</td>
			</tr>
		</table>

		You will see something like this:

		_______________

		This creates a table with 2 columns and 3 rows, a total of 6 boxes. Those boxes are called "Cells"

		Let's study the tags:

		<table> and </table> mark the beginning and end of the entire table.

		<tr> and </tr> mark the beginning and end of each row.

		<td> and </td> mark the beginning and end of each cell, or box.

		If you want to remove the border, just remove the words "border=1" from <table>. Try that now.

		<table border=1>
			<tr>
				<td>Hello</td>
				<td>world!</td>
			</tr>
			<tr>
				<td>Happy</td>
				<td>to</td>
			</tr>
			<tr>
				<td>see</td>
				<td>you!</td>
			</tr>
		</table>

		Now you can't see the borders, but the words are still arranged very neatly. 

		(show result)

		There are many other things that you can do with tables, like change the background color of each cell, align the contents of each cell to the center or right, control the width of the tables or even the width of each row and the height of each column. But that's for a later lesson. 

		=======end lesson on tables========

		More on tables


				 * */
	}

	
	
}
