package au.com.spinninghalf.hellogridview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
//import android.widget.Toast;
//import android.widget.ImageView;

public class HelloGridViewActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            	//Class DisplayImage = getTargetActivityForPosition(position);
            	Intent fullScreenImageIntent = new Intent(HelloGridViewActivity.this, FullScreenImage.class);
            	
            	//put extra data into the Intent. Which is the id of the particular image selected in the GridView
            	fullScreenImageIntent.putExtra("au.com.spinninghalf.hellogridview.theimageselected", mThumbIds[position]);
                
            	//launch the activity
            	HelloGridViewActivity.this.startActivity(fullScreenImageIntent);
            	
            	
               // Toast.makeText(HelloGridViewActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
    
 // references to our images
    public Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };
    
}