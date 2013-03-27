package com.kab.channel66;

import android.app.Dialog;
import android.app.ListActivity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class BaseListActivity extends ListActivity {

	@Override
	public void onResume()
	{
		super.onResume();
		Dialog blockApp;
		if(isOnline(this.getApplicationContext()))
		{
			 blockApp = new Dialog(this.getApplicationContext());
			 blockApp.setTitle("No data connection, application can not work without data");
			 
		}
	}
	 public boolean isOnline(Context context) { 
		    ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);    
		    NetworkInfo netInfo = cm.getActiveNetworkInfo();    
		    return netInfo != null && netInfo.isConnected();
		}
}
