package com.aulia.industri;



import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.NavUtils;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class Detail extends ActionBarActivity {
	ImageView Im;
	TextView isi_industri, isi_keterangan, isi_deskripsi, id;
	Gallery gallery;
	ImageSwitcher imageSwitcher;
	Integer[] imageIDs = new Integer[20];
	int msg_im;
	ImageButton back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail);
		
		back = (ImageButton) findViewById(R.id.back);
		back.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Detail.this.finish();
			}	
		});
		Intent iIdentifikasi = getIntent();
		msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
		
		String msg_nama = iIdentifikasi.getStringExtra("dataNama");
		String msg_keterangan = iIdentifikasi.getStringExtra("dataKeterangan");
		String msg_deskripsi = iIdentifikasi.getStringExtra("dataDeskripsi");
		
		Im = (ImageView) findViewById(R.id.iv_detail);
		isi_industri = (TextView) findViewById(R.id.isi_industri);
		isi_keterangan = (TextView) findViewById(R.id.isi_keterangan);
		isi_deskripsi = (TextView) findViewById(R.id.isi_deskripsi);
		
		Im.setImageResource(msg_im);
		isi_industri.setText(msg_nama);
		isi_keterangan.setText(msg_keterangan);
		isi_deskripsi.setText(msg_deskripsi);
	}
	
}
