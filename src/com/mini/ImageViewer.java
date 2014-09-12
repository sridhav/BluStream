package com.mini;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
/**
 * @author Sridhar
 * This is the Main Activity that describes All the three Available Options 
 * of Bluetooth
 *
 */
public class ImageViewer extends Activity {
	/**
	 * @uml.property  name="b1"
	 * @uml.associationEnd  
	 */
	private Bundle b1;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
//		if(true) Log.e("Bluetooth", "Instance Created");
		//requestWindowFeature(Window.FEATURE_CUSTOM_TITLE	
		setContentView(R.layout.image_viewer);
		ImageView k=(ImageView)findViewById(R.id.viewer1);
		b1=this.getIntent().getExtras();
		String m=b1.getString("url");
		k.setImageURI(Uri.parse(m));
	}
}