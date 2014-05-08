package views.customlist;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import com.itforhumanity.itcourse_basics.MenuActivity;
import com.itforhumanity.itcourse_basics.R;
import com.itforhumanity.itcourse_basics.SlideShowActivity;

public class CustomListBaseAdapter extends BaseAdapter {

	
	private ArrayList<CustomListItem> itemDetailsArrayList;
//	public ArrayList<CustomListItem> getItemDetailsArrayList() {
//		return itemDetailsArrayList;
//	}
	public void setItemDetailsArrayList(ArrayList<CustomListItem> itemDetailsArrayList) {
		this.itemDetailsArrayList = itemDetailsArrayList;
	}
	
	private LayoutInflater l_Inflater;

	int screenwidth;
	int screenheight;			
	public CustomListBaseAdapter(Context context, ArrayList<CustomListItem> results) {
//		this.context=(TimedActivity)context;
		itemDetailsArrayList = results;
		l_Inflater = LayoutInflater.from(context);
		
		
		Display display = MenuActivity.getInstance().getWindowManager().getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		screenwidth = size.x;
		screenheight = size.y;			
		
	}

	public int getCount() {
		return itemDetailsArrayList.size();
	}

	public CustomListItem getItem(int position) {
		return itemDetailsArrayList.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = l_Inflater.inflate(R.layout.custom_list_item_view, null);
			holder = new ViewHolder();
			holder.title = (TextView) convertView.findViewById(R.id.title);
			holder.text = (TextView) convertView.findViewById(R.id.text);
			holder.image = (ImageView) convertView.findViewById(R.id.image);
			holder.slideshow = (Button) convertView.findViewById(R.id.slideshow);
			holder.textbox = (EditText) convertView.findViewById(R.id.textbox);

			
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
//		if(!checkboxClickable)
//		{
//			holder.chkbox.setFocusable(false);
//		}
		
		holder.title.setVisibility(TextView.GONE);
		holder.image.setVisibility(TextView.GONE);
		holder.text.setVisibility(TextView.GONE);
		holder.slideshow.setVisibility(TextView.GONE);
		holder.textbox.setVisibility(TextView.GONE);

		CustomListItem item=itemDetailsArrayList.get(position);
		if(item.getType()==CustomListItem.TEXT)
		{
			holder.text.setVisibility(TextView.VISIBLE);
			holder.text.setText(item.getText());
		}
		else if(item.getType()==CustomListItem.TITLE)
		{
			holder.title.setVisibility(TextView.VISIBLE);
			holder.title.setText(item.getText());
		}
		else if(item.getType()==CustomListItem.IMAGE)
		{
			//holder.image
			holder.image.setVisibility(TextView.VISIBLE);
			
            Drawable image = MenuActivity.getInstance().getResources().getDrawable(item.getResourceId());
//            float heighToWidthRatio = image.getIntrinsicWidth()/image.getIntrinsicHeight();
//            int height = screenheight;
//
//            holder.image.setLayoutParams(
//                    new LayoutParams(
//                            (int) (height * heighToWidthRatio), height));			

            Double widthToHeightRatio = Double.valueOf(image.getIntrinsicHeight())/image.getIntrinsicWidth();
            int width = screenwidth;

            holder.image.setLayoutParams(
                    new LayoutParams(
                    		width, (int) (width * widthToHeightRatio)));			
            
            
			holder.image.setImageDrawable(image);
			holder.text.setVisibility(TextView.VISIBLE);
			holder.text.setText(item.getText());
		}
		else if(item.getType()==CustomListItem.SLIDESHOW)
		{
			holder.slideshow.setVisibility(TextView.VISIBLE);
			holder.slideshow.setText("Slide Show: "+item.getText());

			//this is the title
			holder.title.setText(item.getText());

			//this is the prefix for the image filenames
			holder.text.setText(item.getParameter());

	        // If CheckBox is toggled, update the planet it is tagged with.  
			holder.slideshow.setOnClickListener( new View.OnClickListener() {  
	          public void onClick(View v) {
//	        	context.onTouch();
	        	  
	            Button cb = (Button) v ;  
	            LinearLayout layout=(LinearLayout)v.getParent();
	            ViewHolder holder=(ViewHolder)layout.getTag();
	            
	    		Intent intent = new Intent(MenuActivity.getInstance(), SlideShowActivity.class);
		        intent.setType(holder.title.getText().toString());
	    		intent.setAction((String) holder.text.getText());
	    		MenuActivity.getInstance().startActivity(intent);

	          }  
	        }); 		
		}		
		else if(item.getType()==CustomListItem.TEXTBOX)
		{
			holder.textbox.setVisibility(TextView.VISIBLE);
			holder.textbox.setText(item.getText());

			//these are the dimensions of the textbox
			holder.text.setText(item.getParameter());
			
			String[] options=item.getParameter().split(",");
			parseDimensions( options[0]);
			parseDimensions( options[1]);
			
			holder.textbox.setLayoutParams(new LinearLayout.LayoutParams(width, height));			
			//holder.textbox.setLayoutParams(new LinearLayout.LayoutParams(width, height));			
			
		}	
		else if(item.getType()==CustomListItem.SPACER)
		{
			holder.text.setVisibility(TextView.VISIBLE);
			holder.text.setText("\n");
		}		
		return convertView;
	}
	private Integer width=0,height=0;
	private void parseDimensions(String param)
	{
		String[] segments=param.split("=");
		if(segments[0].contentEquals("h"))
			height=Integer.parseInt(segments[1]);
		else if(segments[0].contentEquals("w"))
			width=Integer.parseInt(segments[1]);
	}

	static class ViewHolder {
		TextView title;
		ImageView image;
		TextView text;
		EditText textbox;
		Button slideshow;
	}
	private boolean checkboxClickable=true;
	public void setCheckboxClickable(boolean checkboxClickable) {
		this.checkboxClickable = checkboxClickable;
	}
	
}
