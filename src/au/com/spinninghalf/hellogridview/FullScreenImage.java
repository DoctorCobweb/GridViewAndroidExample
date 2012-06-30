package au.com.spinninghalf.hellogridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


//
public class FullScreenImage extends Activity {
	public int thumbnailId;   
	
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fullscreenimage);
        
        ImageView mainImageView = (ImageView) findViewById(R.id.fullScreenImageView);
        
        Bundle extras = getIntent().getExtras();
        thumbnailId = extras.getInt("au.com.spinninghalf.hellogridview.theimageselected");
        
        mainImageView.setImageResource(thumbnailId);
        
    }

}
