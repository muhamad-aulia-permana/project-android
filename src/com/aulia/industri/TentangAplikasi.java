package com.aulia.industri;

import com.afollestad.materialdialogs.MaterialDialog;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;

public class TentangAplikasi extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_tentang_aplikasi);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.tentangaplikasi,  menu);
		
        return true;
        }
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		 switch (item.getItemId()) {
		 case R.id.TentangAplikasi:
			 new MaterialDialog.Builder(TentangAplikasi.this)
		        .title(R.string.action_about_developer)
		        .positiveText("OK")
		        .content(Html.fromHtml(getString(R.string.action_about_developer_body)))
		        .contentLineSpacing(1.6f)
		        .callback(new MaterialDialog.SimpleCallback() {
		            @Override
		            public void onPositive(MaterialDialog dialog) {
		            }
		        }).build().show();
			 return true;
		
			 } 
		return super.onOptionsItemSelected(item);
		}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
	
		TentangAplikasi.this.finish();
	    	
	}

}
