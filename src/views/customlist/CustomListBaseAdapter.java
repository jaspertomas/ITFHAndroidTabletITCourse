package views.customlist;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
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
	Context context;
	public CustomListBaseAdapter(Context context, ArrayList<CustomListItem> results) {
		this.context=context;
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

			//onclick
//			holder.image.setOnClickListener(new View.OnClickListener() {
//		        @Override
//		        public void onClick(View v) {
//		        	Log.i("a","b");
//		        }
//		    });			
			
            Drawable image = MenuActivity.getInstance().getResources().getDrawable(item.getResourceId());
//            Drawable d=null;
            
            Double heighToWidthRatio = Double.valueOf(image.getIntrinsicWidth())/image.getIntrinsicHeight();
            int height = Double.valueOf(0.8d*screenheight).intValue();

            Double widthToHeightRatio = Double.valueOf(image.getIntrinsicHeight())/image.getIntrinsicWidth();
            int width = Double.valueOf(0.8d*screenwidth).intValue();
            
//            Log.i("imagewidth",String.valueOf(image.getIntrinsicWidth()));
//            Log.i("imageheight",String.valueOf(image.getIntrinsicHeight()));
//            Log.i("screenwidth",String.valueOf(screenwidth));
//            Log.i("screenheight",String.valueOf(screenheight));
//            Log.i("width",String.valueOf(width));
//            Log.i("height",String.valueOf(height));
//            Log.i("(widthToHeightRatio)",String.valueOf((widthToHeightRatio)));
//            Log.i("(heighToWidthRatio)",String.valueOf((heighToWidthRatio)));
//            Log.i("(width * widthToHeightRatio)",String.valueOf((width * widthToHeightRatio)));
//            Log.i("(height * heighToWidthRatio)",String.valueOf((height * heighToWidthRatio)));
//            Log.i("(height * widthToHeightRatio)",String.valueOf((height * widthToHeightRatio)));
//            Log.i("(width * heighToWidthRatio)",String.valueOf((width * heighToWidthRatio)));
            
            if((width * widthToHeightRatio)<height)
            {
            	holder.image.setLayoutParams(
                        new LayoutParams(
                        		width, (int) (width * widthToHeightRatio)));			

//    			Bitmap b = Bitmap.createScaledBitmap(drawableToBitmap(image), width, Double.valueOf(width * widthToHeightRatio).intValue(), false);
//    			d = new BitmapDrawable(context.getResources(), b);
            }
            else
            {
                holder.image.setLayoutParams(
                        new LayoutParams(
                                (int) (height * heighToWidthRatio), height));			

//    			Bitmap b = Bitmap.createScaledBitmap(drawableToBitmap(image), Double.valueOf(height * heighToWidthRatio).intValue(), height, false);
//    			d = new BitmapDrawable(context.getResources(), b);
            }

            holder.image.setImageDrawable(image);
//			holder.image.setImageDrawable(scaleBitmap(image, width, height));
//			holder.image.setImageDrawable(d);
			
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
	public static Bitmap scaleBitmap(Bitmap bitmapToScale, float newWidth, float newHeight) {   
		if(bitmapToScale == null)
		    return null;
		//get the original width and height
		int width = bitmapToScale.getWidth();
		int height = bitmapToScale.getHeight();
		// create a matrix for the manipulation
		Matrix matrix = new Matrix();

		// resize the bit map
		matrix.postScale(newWidth / width, newHeight / height);

		// recreate the new Bitmap and set it back
		return Bitmap.createBitmap(bitmapToScale, 0, 0, bitmapToScale.getWidth(), bitmapToScale.getHeight(), matrix, true);  
	}	

	//from http://stackoverflow.com/questions/3035692/how-to-convert-a-drawable-to-a-bitmap
	public static Bitmap drawableToBitmap (Drawable drawable) {
	    if (drawable instanceof BitmapDrawable) {
	        return ((BitmapDrawable)drawable).getBitmap();
	    }
	
	    Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
	    Canvas canvas = new Canvas(bitmap); 
	    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
	    drawable.draw(canvas);
	
	    return bitmap;
	}
	
}
