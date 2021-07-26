package com.aulia.industri;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ImageButton;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
//import android.util.Log;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.support.v7.widget.Toolbar;

import com.afollestad.materialdialogs.MaterialDialog;

import com.aulia.industri.fragment.HomeFragment;
import com.aulia.industri.fragment.ProductDetailFragment;


public class Menu_Utama extends ActionBarActivity implements OnClickListener {

	private Fragment contentFragment;
	HomeFragment homeFragment;
	ProductDetailFragment pdtDetailFragment;
	ImageButton Industri, Info, Keluar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu__utama);
		
		 
		 Industri = (ImageButton)findViewById(R.id.Peta);
		 Industri.setOnClickListener(this);
		 Info= (ImageButton)findViewById(R.id.Tentang);
		 Info.setOnClickListener(this);
		 Keluar= (ImageButton)findViewById(R.id.Keluar);
		 Keluar.setOnClickListener(this);
	}


	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      // MenuInflater inflater = getMenuInflater();
       //inflater.inflate(R.menu.menu_utama, menu);
		
        return true;
        }
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		 switch (item.getItemId()) {
		 case R.id.maplokasi:
			 startActivity(new Intent(this,MainActivity.class));
			 return true;
		 case R.id.info:
			 startActivity(new Intent(this,TentangIndustriBogor.class));
			 return true;
		 case R.id.home:
			 AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
				builder1.setMessage("Anda ingin keluar dari aplikasi ini?")
	    		.setCancelable(false)
	    		.setNegativeButton("Tidak",
	    		new DialogInterface.OnClickListener() {
    	    	@Override
    			public void onClick(DialogInterface dialog,
    	    	int id) {
    	    	dialog.cancel();
	    	    }
	    	    })
	    	    .setPositiveButton("Ya",
	    	    new DialogInterface.OnClickListener() {
		    	@Override
		    	public void onClick(DialogInterface dialog,int id) {
		    	Menu_Utama.this.finish();
	    	    		}
	    	    		}).show();
			 return true;
		
			 } 
		return super.onOptionsItemSelected(item);
		}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
		builder1.setMessage("  Anda ingin keluar dari aplikasi ini?")
		.setCancelable(false)
		.setNegativeButton("Tidak",
		new DialogInterface.OnClickListener() {
    	@Override
    	public void onClick(DialogInterface dialog,
    	int id) {
    	dialog.cancel();
	    		}
	    		})
	    .setPositiveButton("Ya",
	    new DialogInterface.OnClickListener() {
		@Override
		public void onClick(DialogInterface dialog,int id) {
		Menu_Utama.this.finish();
	    		}
	    		}).show();
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 switch(v.getId()) {
	        case R.id.Peta:
	          // it was the first button
	        	startActivity(new Intent(this,MainActivity.class));
	        	//startActivity(new Intent(this,Peta.class));
	          break;
	        case R.id.Tentang:
	          // it was the second button
	        	startActivity(new Intent(this,TentangIndustriBogor.class));
	          break;
	        case R.id.Keluar:
	        	 AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
					builder1.setMessage("Anda ingin keluar dari aplikasi ini?")
		    		.setCancelable(false)
		    		.setNegativeButton("Tidak",
		    		new DialogInterface.OnClickListener() {
	 	    	@Override
	 			public void onClick(DialogInterface dialog,
	 	    	int id) {
	 	    	dialog.cancel();
		    	    }
		    	    })
		    	    .setPositiveButton("Ya",
		    	    new DialogInterface.OnClickListener() {
			    	@Override
			    	public void onClick(DialogInterface dialog,int id) {
			    	Menu_Utama.this.finish();
		    	    		}
		    	    		}).show();
	        	
	        	break;
	      }
		
	}
}
