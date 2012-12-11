package com.kab.channel66;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.apphance.android.Log;


import android.os.AsyncTask;

public class StreamAvailabilityChecker extends
		AsyncTask<String, Void, Boolean> {

	@Override
	protected Boolean doInBackground(String... params) {
		URLConnection cn = null;
		try {

			cn = new URL(params[0]).openConnection();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cn.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream stream = null;
		try {
			stream = cn.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (stream == null) {

		
		
		return false;
		}
		return true;
	}
	

}
