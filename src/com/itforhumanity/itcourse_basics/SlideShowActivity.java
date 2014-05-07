package com.itforhumanity.itcourse_basics;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class SlideShowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide_show);

//		TextView text = (TextView) findViewById(R.id.text);
//		text.setText(this.getIntent().getAction());
	
        this.txtStatus=(TextView)this.findViewById(R.id.textView1);
        this.imageView=(ImageView)this.findViewById(R.id.imageView);

        String imgprefix=this.getIntent().getAction();
        
        String[] segments=imgprefix.split("p");
        imgprefix=segments[0]+"p";
        String lastslide=segments[1];
        Integer slidecount=Integer.parseInt(lastslide);
        
        imgid=new Integer[slidecount];
        
        for (int j = 0; j < slidecount; j++) {
        	   imgid[j]=getResources()
 	                  .getIdentifier(imgprefix+String.format("%02d", j), "drawable", getPackageName());
        }
        
        
        updateUI();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.slide_show, menu);
		return true;
	}

	
    private TextView txtStatus;
    private ImageView imageView;
    int i=0;
    Integer[] imgid;
//    int imgid[]={R.drawable.01,R.drawable.02,R.drawable.03,R.drawable.04,R.drawable.05,
  //          R.drawable.06,R.drawable.07,R.drawable.08};
    RefreshHandler refreshHandler=new RefreshHandler();
    
    class RefreshHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            SlideShowActivity.this.updateUI();
        }
        public void sleep(long delayMillis){
            this.removeMessages(0);
            sendMessageDelayed(obtainMessage(0), delayMillis);
        }
    };
    public void updateUI(){
        int currentInt=Integer.parseInt((String)txtStatus.getText())+10;
        if(currentInt<=100){
            refreshHandler.sleep(2000);
            txtStatus.setText(String.valueOf(currentInt));
            if(i<imgid.length){
                imageView.setImageResource(imgid[i]);
                
                // imageView.setPadding(left, top, right, bottom);
                i++;
            }
        }
    }
}
