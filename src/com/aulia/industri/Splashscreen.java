package com.aulia.industri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Splashscreen extends Activity {
	//ProgressBar bar;
	TextView txt;
	int total=0;
	Intent intent;
	boolean isRunning=false;
	Handler handler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			total=total+5;
			//String perc=String.valueOf(total).toString();
		
			//bar.incrementProgressBy(5);
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_splashscreen);
		//bar=(ProgressBar)findViewById(R.id.progressBar1);
	}
	@Override
	public void onStart() {
	// TODO Auto-generated method stub
	super.onStart();
//	bar.setProgress(0);
	final Splashscreen SplashScreen = this;
	Thread background=new Thread(new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try{
				for (int i=0;i<20 && isRunning;i++) {
					 
					// wait 1000ms between each update
					Thread.sleep(500);
					handler.sendMessage(handler.obtainMessage());
					}
					finish();
			}
			catch(Throwable t) {
			  }
			Intent intent = new Intent();
			intent.setClass(SplashScreen, Menu_Utama.class);
			startActivity(intent);
		}
	});
	isRunning=true;
	// start the background thread
	background.start();
	
}
@Override
	public void onStop() {
	// TODO Auto-generated method stub
	super.onStop();
	isRunning=false;
}
}
