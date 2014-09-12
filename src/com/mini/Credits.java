package com.mini;

import com.mini.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;



public class Credits extends Activity{
	
	/**
	 * @uml.property  name="b1"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Bundle b1=new Bundle();
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.credits);
		clickable();
	}
	
	protected void clickable(){
		TextView mentor=(TextView)findViewById(R.id.textView2);
		TextView coder1=(TextView)findViewById(R.id.textView4);
		TextView coder2=(TextView)findViewById(R.id.textView5);
		TextView design1=(TextView)findViewById(R.id.textView7);
		TextView design2=(TextView)findViewById(R.id.textView8);
		
		mentor.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(arg0.getContext(),CreditsExplore.class);
				b1.putString("course_id","Designation");
				b1.putString("id_id","Staff ID");
				b1.putString("name","Beena Bethal");
				b1.putString("course","Lecturer");
				b1.putString("branch", "CSE");
				b1.putString("email", "gnbeenabethel@yahoo.co.in");
				b1.putString("phone","9849554879");
				b1.putString("id","");
				//b1.putString("pic", "Sridhar");
				i1.putExtras(b1);
				startActivity(i1);
			}
			
		});
		
		coder1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(arg0.getContext(),CreditsExplore.class);
				b1.putString("course_id","Course");
				b1.putString("id_id","Student ID");
				b1.putString("name","Sridhar Vemula");
				b1.putString("course","B.Tech");
				b1.putString("branch", "CSE");
				b1.putString("email", "sridhar.vemula2@gmail.com");
				b1.putString("phone","8897725824");
				b1.putString("id","08241A05A1");
				i1.putExtras(b1);
				startActivity(i1);

			}
			
		});
		
		coder2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(arg0.getContext(),CreditsExplore.class);
				b1.putString("course_id","Course");
				b1.putString("id_id","Student ID");
				b1.putString("name","Theja CHVRS");
				b1.putString("course","B.Tech");
				b1.putString("branch", "CSE");
				b1.putString("email", "theja.chvrs084@gmail.com");
				b1.putString("phone","8121284294");
				b1.putString("id","08241A05A7");
				i1.putExtras(b1);
				startActivity(i1);

			}
			
		});
		
		design1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(arg0.getContext(),CreditsExplore.class);
				b1.putString("course_id","Course");
				b1.putString("id_id","Student ID");
				b1.putString("name","Yashwanth");
				b1.putString("course","B.Tech");
				b1.putString("branch", "CSE");
				b1.putString("email", "yashwanthb.1991@gmail.com");
				b1.putString("phone","8686171161");
				b1.putString("id","08241A05B4");
				i1.putExtras(b1);
				startActivity(i1);

			}
			
		});
		
		design2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(arg0.getContext(),CreditsExplore.class);
				b1.putString("course_id","Course");
				b1.putString("id_id","Student ID");
				b1.putString("name","Avi Kumar");
				b1.putString("course","B.Tech");
				b1.putString("branch", "CSE");
				b1.putString("email", "avikumar62@yahoo.com");
				b1.putString("phone","9533808143");
				b1.putString("id","08241A0563");
				i1.putExtras(b1);
				startActivity(i1);

			}
			
		});
		
	}
}