package com.mini;

/**
 * This is the main Activity that displays the current transfer session.
 */
import java.io.File;
//import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class BluetoothExplorer extends ListActivity {
 
 /**
 * @uml.property  name="item"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="java.lang.String"
 */
private List<String> item = null;
 /**
 * @uml.property  name="path"
 * @uml.associationEnd  multiplicity="(0 -1)" elementType="java.lang.String"
 */
private List<String> path = null;
 /**
 * @uml.property  name="root"
 */
private String root="/";
 /**
 * @uml.property  name="myPath"
 * @uml.associationEnd  
 */
private TextView myPath;
 /**
 * @uml.property  name="open_file"
 */
private File open_file;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explorer);
        myPath = (TextView)findViewById(R.id.path);
        getDir(root);
    }
    
    private void getDir(String dirPath)
    {
     myPath.setText("Location: " + dirPath);
     
     item = new ArrayList<String>();
     path = new ArrayList<String>();
     
     File f = new File(dirPath);
     File[] files = f.listFiles();
     
     if(!dirPath.equals(root))
     {
      item.add(root);
      path.add(root);
      item.add("../");
      path.add(f.getParent());
     }
     
     for(int i=0; i < files.length; i++)
     {
       File file = files[i];
       path.add(file.getPath());
       if(file.isDirectory())
        item.add(file.getName() + "/");
       else
        item.add(file.getName());
     }

     ArrayAdapter<String> fileList =
      new ArrayAdapter<String>(this, R.layout.row, item);
     setListAdapter(fileList);
    }

 @Override
 protected void onListItemClick(ListView l, View v, int position, long id) {
  
  File file = new File(path.get(position));
  
  if (file.isDirectory())
  {
   if(file.canRead())
    getDir(path.get(position));
   else
   {
    new AlertDialog.Builder(this)
    .setIcon(R.drawable.icon)
    .setTitle("[" + file.getName() + "] folder can't be read!")
    .setPositiveButton("OK", 
      new DialogInterface.OnClickListener() {
       
       @Override
       public void onClick(DialogInterface dialog, int which) {
        // TODO Auto-generated method stub
       }
      }).show();
   }
  }
  else
  {
	  String title="Send File";
		 String msg="Send File using Bluetooth";
		 String open_button="Open";
		 String send_button="Send";
		 open_file=file;
		 Context context=BluetoothExplorer.this;
		 //AlertDialog when File is clicked
		 AlertDialog.Builder ad=new AlertDialog.Builder(context);
		 ad.setTitle(title);
		 ad.setMessage(msg);
		 ad.setPositiveButton(send_button, new OnClickListener(){
			 public void onClick(DialogInterface dialog,int arg1){
				 send_dialog();
			 }
		 });
		 ad.setNegativeButton(open_button, new OnClickListener(){
			 public void onClick(DialogInterface dialog,int arg1){
				 open_dialog();
			 }
		 });
		 /*ad.setCancelable(true);
		ad.setOnCancelListener(new OnCancelListener(){
			public void onCancel(DialogInterface dialog){
				close_dialog();
			}
		});*/
		 ad.show();
  }
 }
 public void open_dialog(){
	 //   java.net.FileNameMap type=URLConnection.getFileNameMap();
	 	Intent i1=new Intent(getApplicationContext(),ImageViewer.class);
	 	Bundle b1=new Bundle();
	 	b1.putString("url",open_file.getAbsolutePath());
	 	i1.putExtras(b1);
	 	startActivity(i1);
	}
 public void  send_dialog(){
	 //type.getContentTypeFor(open_file.getAbsolutePath())
	//	java.net.FileNameMap type=URLConnection.getFileNameMap();
		Intent send_intent=new Intent(Intent.ACTION_SEND);
		//send_intent.setAction(Intent.ACTION_SEND);
		send_intent.setType("image/jpg");
		send_intent.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(open_file));
		//startActivity(Intent.createChooser(send_intent,"File Transfer"));
		startActivity(send_intent);
 }
}