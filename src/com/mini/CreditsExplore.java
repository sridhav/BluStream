package com.mini;


import android.app.Activity;
import android.os.Bundle;
//import android.widget.ImageView;
import android.widget.TextView;

public class CreditsExplore extends Activity{
	
	/**
	 * @uml.property  name="b1"
	 * @uml.associationEnd  
	 */
	private Bundle b1;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.credit_explore);
		b1=this.getIntent().getExtras();
		//ImageView pic=(ImageView)findViewById(R.id.imageView1);
		TextView tinput1=(TextView)findViewById(R.id.textView1);
		TextView tinput2=(TextView)findViewById(R.id.textView2);
		TextView tinput10=(TextView)findViewById(R.id.textView10);
		TextView tinput3=(TextView)findViewById(R.id.textView3);
		TextView tinput5=(TextView)findViewById(R.id.textView5);
		TextView tinput7=(TextView)findViewById(R.id.textView7);
		TextView tinput9=(TextView)findViewById(R.id.textView9);
		TextView tinput11=(TextView)findViewById(R.id.textView11);
		tinput1.setText(b1.getString("name"));
		tinput3.setText(b1.getString("course"));
		tinput5.setText(b1.getString("branch"));
		tinput7.setText(b1.getString("email"));
		tinput9.setText(b1.getString("phone"));
		tinput11.setText(b1.getString("id"));	
		tinput2.setText(b1.getString("course_id"));
		tinput10.setText(b1.getString("id_id"));
	//	pic.setImageResource(R.drawable.sridhar);
		}
}