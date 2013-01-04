package com.kab.channel66;

import java.io.IOException;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.IBinder;
import android.view.ViewDebug.FlagToString;

public class BackgroundPlayer extends Service {

	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) 
	{
		 
		//Uri uri = Uri.parse("http://icecast.kab.tv/heb.mp3");
    	//Intent player1 = new Intent(Intent.ACTION_VIEW,uri);
    	// player1.setDataAndType(uri, "audio/*");
    	
    	// player1.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
		//startActivity(player1);	
		
		
		String url = "http://icecast.kab.tv/heb.mp3"; // your URL here
		MediaPlayer mediaPlayer = new MediaPlayer();
		mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
		try {
			mediaPlayer.setDataSource(url);
			mediaPlayer.prepare(); // might take long! (for buffering, etc)
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mediaPlayer.start();
		return startId;
		
	}
	
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() {

	    super.onCreate();
	       
	}
	@Override
	public void onStart(Intent intent, int startId) {

	    super.onStart(intent, startId);
	    
	}
	public void onDestroy() {

	    super.onDestroy();
	}
}
