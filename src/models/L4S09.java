package models;

import java.util.ArrayList;

import views.customlist.CustomListItem;

import com.itforhumanity.itcourse_basics.R;

/*
 * From http://www.azlyrics.com/j/jackson.html
 * */

public class L4S09 {
	public static final String title = "4.9: Tables";
	private static ArrayList<CustomListItem> list = null;

	public static ArrayList<CustomListItem> getLessons() {
		if (list == null)
			init();
		return list;
	}

	private static void init() {
		list = new ArrayList<CustomListItem>();
		String text = "";
		int image = 0;
		String slideshowprefix = "";

		// -------------------------
		/*
		 * text="What is Hypertext?"; list.add(new
		 * CustomListItem(CustomListItem.TITLE,text));
		 * 
		 * text=""; list.add(new CustomListItem(CustomListItem.TEXT,text));
		 * 
		 * image=R.drawable.l04s01helloworld1; list.add(new
		 * CustomListItem(CustomListItem.IMAGE,image,""));
		 * 
		 * text="<font color=red size=7>Hello world!</font>"; list.add(new
		 * CustomListItem(CustomListItem.TEXTBOX,text,"h=100,w=400"));
		 */

		text = "		In Microsoft Word, you can create tables (the one with rows and columns, not the one with chairs.) \n"
				+ "\n"
				+ "		Below is a phone directory. The names, addresses and phone numbers are arranged inside a table to make them orderly. \n"
				+ "\n"
				+ "		Name                        Address                       Phone No.\n"
				+ "		Barack Obama        White House               1234567\n"
				+ "		Noynoy Aquino        Malacanang Palace  7654321\n"
				+ "\n"
				+ "		Tables are a great way to arrange parts of your webpage. \n"
				+ "\n"
				+ "		Below is OLX.ph, one of the top buy and sell websites in the Philippines. See how orderly the parts of the website are arranged.\n";
		list.add(new CustomListItem(CustomListItem.TEXT, text));

		image = R.drawable.l04s09olx;
		list.add(new CustomListItem(CustomListItem.IMAGE, image, ""));

		text = "		To create a table, paste this code in HTML Play:";
		list.add(new CustomListItem(CustomListItem.TEXT, text));

		text = "		<table border=1>\n" + "			<tr>\n" + "				<td>Hello</td>\n"
				+ "				<td>world!</td>\n" + "			</tr>\n" + "			<tr>\n"
				+ "				<td>Happy</td>\n" + "				<td>to</td>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>see</td>\n" + "				<td>you!</td>\n"
				+ "			</tr>\n" + "		</table>\n" + "";
		list.add(new CustomListItem(CustomListItem.TEXTBOX, text, "h=300,w=400"));

		text = "		You will see something like this:";
		list.add(new CustomListItem(CustomListItem.TEXT, text));

		image = R.drawable.l04s09table;
		list.add(new CustomListItem(CustomListItem.IMAGE, image, ""));

		text = "		This creates a table with 2 columns and 3 rows, a total of 6 boxes. Those boxes are called \"Cells\"\n"
				+ "\n"
				+ "		Let's study the tags:\n"
				+ "\n"
				+ "		<table> marks the beginning of the table.\n"
				+ "		</table> marks the end of the table.\n"
				+ "\n"
				+ "		<tr> marks the beginning of each row.\n"
				+ "		</tr> marks the end of each row.\n"
				+ "\n"
				+ "		<td> marks the beginning of each cell.\n"
				+ "		</td> mark the end of each cell.\n"
				+ "\n"
				+ "		If you want to remove the border, just remove the words \"border=1\" from <table>. Try that now.";
		list.add(new CustomListItem(CustomListItem.TEXT, text));

		text = "		<table>\n" + "			<tr>\n" + "				<td>Hello</td>\n"
				+ "				<td>world!</td>\n" + "			</tr>\n" + "			<tr>\n"
				+ "				<td>Happy</td>\n" + "				<td>to</td>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>see</td>\n" + "				<td>you!</td>\n"
				+ "			</tr>\n" + "		</table>\n" + "";
		list.add(new CustomListItem(CustomListItem.TEXTBOX, text, "h=300,w=400"));

		text = "		Now you can't see the borders, but the words are still arranged very neatly.";
		list.add(new CustomListItem(CustomListItem.TEXT, text));

		image = R.drawable.l04s09tablenoborder;
		list.add(new CustomListItem(CustomListItem.IMAGE, image, ""));

		text = "		The same thing will happen if you set border to 0.";
		list.add(new CustomListItem(CustomListItem.TEXT, text));

		text = "		<table border=0>\n" + "			<tr>\n" + "				<td>Hello</td>\n"
				+ "				<td>world!</td>\n" + "			</tr>\n" + "			<tr>\n"
				+ "				<td>Happy</td>\n" + "				<td>to</td>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>see</td>\n" + "				<td>you!</td>\n"
				+ "			</tr>\n" + "		</table>\n" + "";
		list.add(new CustomListItem(CustomListItem.TEXTBOX, text, "h=300,w=400"));

		text = "		You can also make the borders bigger, by setting changing border to 2, or even 10, or 100. Try that now.";
		list.add(new CustomListItem(CustomListItem.TEXT, text));
		text = "		<table border=10>\n" + "			<tr>\n" + "				<td>Hello</td>\n"
				+ "				<td>world!</td>\n" + "			</tr>\n" + "			<tr>\n"
				+ "				<td>Happy</td>\n" + "				<td>to</td>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>see</td>\n" + "				<td>you!</td>\n"
				+ "			</tr>\n" + "		</table>\n" + "";
		list.add(new CustomListItem(CustomListItem.TEXTBOX, text, "h=300,w=400"));
		image = R.drawable.l04s09tablebigborder;
		list.add(new CustomListItem(CustomListItem.IMAGE, image, ""));

		text = "		There are many other things that you can do with tables, like change the background color of each cell, align the contents of each cell to the center or right, control the width of the tables or even the width of each row and the height of each column. But that's for a later lesson."
				+ "";
		list.add(new CustomListItem(CustomListItem.TEXT, text));

	}

}
