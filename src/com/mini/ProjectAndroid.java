package com.mini;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
/**
 * @author Sridhar
 * This is the Main Activity that describes All the three Available Options 
 * of Bluetooth
 *
 */
public class ProjectAndroid extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
//		if(true) Log.e("Bluetooth", "Instance Created");
		//requestWindowFeature(Window.FEATURE_CUSTOM_TITLE	
		setContentView(R.layout.main);
		//getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_title);
	//	if(true) Log.e("Bluetooth", "Content");
		ImageView bluetooth_transfer=(ImageView)findViewById(R.id.transfer2);
		bluetooth_transfer.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(arg0.getContext(),BluetoothExplorer.class));
			}
			
		});
		ImageView bluetooth_remote=(ImageView)findViewById(R.id.remote2);
		bluetooth_remote.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(arg0.getContext(),BluetoothRemote.class));
			}
			
		});
		
		ImageView bluetooth_chat=(ImageView)findViewById(R.id.chat2);
		bluetooth_chat.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(arg0.getContext(),BluetoothChat.class);
				startActivity(i1);
			}
			
		});
		ImageView credits_chat=(ImageView)findViewById(R.id.credits2);
		credits_chat.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(arg0.getContext(),Credits.class);
				startActivity(i1);
			}
			
		});
	}
}