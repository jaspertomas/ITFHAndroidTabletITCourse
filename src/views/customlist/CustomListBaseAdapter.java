package views.customlist;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.itforhumanity.itcourse_basics.R;

public class CustomListBaseAdapter extends BaseAdapter {

	
	private ArrayList<CustomListItem> itemDetailsArrayList;
//	public ArrayList<CustomListItem> getItemDetailsArrayList() {
//		return itemDetailsArrayList;
//	}
	public void setItemDetailsArrayList(ArrayList<CustomListItem> itemDetailsArrayList) {
		this.itemDetailsArrayList = itemDetailsArrayList;
	}
	
	private LayoutInflater l_Inflater;

//	TimedActivity context;
	public CustomListBaseAdapter(Context context, ArrayList<CustomListItem> results) {
//		this.context=(TimedActivity)context;
		itemDetailsArrayList = results;
		l_Inflater = LayoutInflater.from(context);
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
			holder.text = (TextView) convertView.findViewById(R.id.text);
			holder.image = (ImageView) convertView.findViewById(R.id.image);

			
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
//		if(!checkboxClickable)
//		{
//			holder.chkbox.setFocusable(false);
//		}
		
		holder.image.setVisibility(TextView.GONE);
		holder.text.setVisibility(TextView.GONE);

		CustomListItem item=itemDetailsArrayList.get(position);
		if(item.getType()==CustomListItem.TEXT)
		{
			holder.text.setVisibility(TextView.VISIBLE);
			holder.text.setText(itemDetailsArrayList.get(position).getText());
		}
		else if(item.getType()==CustomListItem.IMAGE)
		{
			holder.image.setVisibility(TextView.VISIBLE);
			holder.image.setImageResource(item.getResourceId());
		}
		
        // If CheckBox is toggled, update the planet it is tagged with.  
//		holder.chkbox.setOnClickListener( new View.OnClickListener() {  
//          public void onClick(View v) {
//        	context.onTouch();
        	  
//            CheckBox cb = (CheckBox) v ;  
//            RelativeLayout layout=(RelativeLayout)v.getParent();
//            ViewHolder holder=(ViewHolder)layout.getTag();
//            
//            //iterate through all choices
//            for(CustomListItem item:itemDetailsArrayList)
//            {
//            	if(item.getUuid().contentEquals(holder.txt_itemUuid.getText().toString()))
//            	{
//            		if(!checkboxClickable)
//                		//for use by ContentMenuActivity
//            			//checks used to indicate that content has been played previously
//            			cb.setChecked(false);
//            		else
//                		//for use by CreateTrackActivity
//            			//checks used to indicate that user has selected content
//            			item.setChecked(true);
//            		break;
//            	}
//            }
//            
//          }  
//        }); 		
//
//		convertView.setOnClickListener( new View.OnClickListener() {  
//	          public void onClick(View v) {  
//	        	  	context.onTouch();
//
//	        	  
//	        	    //for use by ContentMenuActivity
//          			if(!checkboxClickable)
//          			{
//          	            RelativeLayout layout=(RelativeLayout)v;
//          	            ViewHolder holder=(ViewHolder)layout.getTag();
////          				Log.e("hi",holder.txt_itemName.getText().toString());
//          	            //play content according to content type
//          	            String type=holder.txt_itemType.getText().toString();
//          	            String description=holder.txt_itemDescription.getText().toString();
//          	            String uuid=holder.txt_itemUuid.getText().toString();
//          	            String puzzle_piece_id=holder.txt_itemPuzzlePieceId.getText().toString();
//          	            if(type.contentEquals("brandvideo") || type.contentEquals("advocacyvideo"))
//          	            {
//          	            	Video video=Videos.getById(uuid);
//          	            	if(video!=null)
//          	            	{
//              	            	ContentMenuActivity.getInstance().playVideo(video,type,puzzle_piece_id);
//          	            	}
//          	            	else
//          	            	{
//          	            		Log.e("CustomListBaseAdapter","Error playing video "+description);
//          	            	}
//          	            }
////          	            else
////          	            if(type.contentEquals("brochure"))
////          	            {
////          	            	ContentMenuActivity.getInstance().playBrochure(PuzzlePieces.getById(uuid));
////          	            }
//          	            else
//          	            if(type.contentEquals("app"))
//          	            {
//          	            	ContentMenuActivity.getInstance().playApp(Apps.getById(puzzle_piece_id));
//          	            }
//          	            else
//          	  			if(type.contentEquals("BrochureContent"))
//        	            {
//        	            	ContentMenuActivity.getInstance().playBrochureContent(Contents.getById(uuid));
//        	            }
//          	  			else
//          	  			if(type.contentEquals("ApkContent"))
//            	            {
//            	            	ContentMenuActivity.getInstance().playAppContent(Contents.getById(uuid));
//            	            }
//          	  			else
//          	  			if(
//          	  					//videocontent backward compatibility
//          	  					type.contentEquals("VideoContent")
//          	  					||
//          	  					type.contentEquals("BrandVideoContent")
//          	  					||
//          	  					type.contentEquals("AdvocacyVideoContent")
//      	  					)
//        	            {
//          	            	ContentMenuActivity.getInstance().playVideoContent(Contents.getById(uuid),type);
//        	            }
//          	  			else
//          	  			if(type.contentEquals("ImageContent"))
//        	            {
//        	            	//ContentMenuActivity.getInstance().playAppContent(Contents.getById(uuid));
//          	  				ContentMenuActivity.getInstance().playImageContent(Contents.getById(uuid));
//      	  				
//        	            }
//      	            }
//	  	        }  
//	        }); 		
//		
		
		return convertView;
	}

	static class ViewHolder {
		ImageView image;
		TextView text;
		EditText textbox;
	}
	private boolean checkboxClickable=true;
	public void setCheckboxClickable(boolean checkboxClickable) {
		this.checkboxClickable = checkboxClickable;
	}
	
}
