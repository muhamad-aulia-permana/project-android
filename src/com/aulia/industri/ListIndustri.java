package com.aulia.industri;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AdapterView.OnItemClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
@SuppressWarnings("deprecation")


public class ListIndustri extends ActionBarActivity {
	protected ListView lv;
	protected ListAdapter adapter;
	SQLiteDatabase db;
	Cursor cursor;
	EditText et_db;
	Intent notfound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_list_industri);
		
		
		db = (new DatabaseIndustriBogor(this)).getWritableDatabase();
		lv = (ListView) findViewById(R.id.lv);
		et_db = (EditText) findViewById(R.id.et);
		et_db.addTextChangedListener(new TextWatcher() {
	        public void onTextChanged(CharSequence s, int start, int before, int count) {
	        }

	        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
	        }

	        public void afterTextChanged(Editable s) {
	        	String edit_db = et_db.getText().toString();
	    		if(!edit_db.equals("")){
	    			try{
	    				cursor = db.rawQuery("SELECT * FROM IndustriBogor WHERE nama LIKE ?", new String[] {"%" +edit_db+ "%"});
	    				adapter = new SimpleCursorAdapter(ListIndustri.this, R.layout.isi_lv, cursor, new String[] {"image", "nama", "keterangan"}, 
	    						new int[] {R.id.img, R.id.tv_nama, R.id.keteranganobyek});
	    				if(adapter.getCount() == 0){
	    					Toast.makeText(ListIndustri.this, "Industri "+edit_db+" Tidak Ditemukan", Toast.LENGTH_LONG).show();
	    					}else{
	    						lv.setAdapter(adapter);
	    						}
	    				}catch(Exception e){
	    					e.printStackTrace();
	    					}
	    			}else{
	    				try{
	    					cursor = db.rawQuery("SELECT * FROM IndustriBogor ORDER BY nama ASC", null);
	    					adapter = new SimpleCursorAdapter(ListIndustri.this, R.layout.isi_lv, cursor, new String[] {"image", "nama", "keterangan"}, 
	    							new int[] {R.id.img, R.id.tv_nama, R.id.keteranganobyek});
	    					lv.setAdapter(adapter);
	    					lv.setTextFilterEnabled(true);
	    					}catch(Exception e){
	    						e.printStackTrace();
	    						}
	    				}
	        }
	    });
		

	   

		try {
			cursor = db.rawQuery("SELECT * FROM IndustriBogor ORDER BY nama ASC", null);
			adapter = new SimpleCursorAdapter(this, R.layout.isi_lv, cursor, 
					new String[] {"image", "nama", "keterangan"},
					new int[] {R.id.img, R.id.tv_nama, R.id.keteranganobyek});
			lv.setAdapter(adapter);
			lv.setTextFilterEnabled(true);
			lv.setOnItemClickListener(new OnItemClickListener() {
				
				@Override
				public void onItemClick(AdapterView<?> parent, View v,
						int position, long id) {
					detail(position);
					}
				});
			}catch(Exception e){
				e.printStackTrace();
				}
	}
	
	public void detail(int position){
		int im = 0;
		String nama = "";
		String keterangan = "";
		String deskripsi = "";
		String koordinat = "";
		
		if(cursor.moveToFirst()){
			cursor.moveToPosition(position);
			im = cursor.getInt(cursor.getColumnIndex("image"));
			nama = cursor.getString(cursor.getColumnIndex("nama"));
			keterangan = cursor.getString(cursor.getColumnIndex("keterangan"));
			deskripsi = cursor.getString(cursor.getColumnIndex("deskripsi"));
			koordinat = cursor.getString(cursor.getColumnIndex("koordinat"));
			}
		
		Intent iIntent = new Intent(this, Detail.class);
		iIntent.putExtra("dataIM", im);
		iIntent.putExtra("dataNama", nama);
		iIntent.putExtra("dataKeterangan", keterangan);
		iIntent.putExtra("dataDeskripsi", deskripsi);
		iIntent.putExtra("dataCoordinate", koordinat);
		setResult(RESULT_OK, iIntent);
		startActivityForResult(iIntent, 99);
		}
}

