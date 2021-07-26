package com.aulia.industri;


import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseIndustriBogor extends SQLiteOpenHelper {
	final static String DB_NAME = "DB_IndustriBogor";

public DatabaseIndustriBogor(Context context) {
	super(context, DB_NAME, null, 1);
	// TODO Auto-generated constructor stub
}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String TBL_Industri = "CREATE TABLE IF NOT EXISTS IndustriBogor(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
				"nama TEXT, keterangan TEXTs, deskripsi TEXT, image BLOB, koordinat TEXT)";		
		
		db.execSQL(TBL_Industri);
		
		
		
		ContentValues values = new ContentValues();
		
		values.put("_id", "1");
		values.put("nama", "Pt Kopontren Nikmatul Jwhrgas");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "Pt ini bertanggung jawab terhadap operasional SPBE, mengontrol operator filling pengisian elpiji ke tabung 3 kg hingga dimuat ke truk agen penyalur.");
		values.put("image", R.drawable.ic_launcher);
		values.put("koordinat","-6.70601 , 106.80306");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "2");
		values.put("image", R.drawable.ptaquaclub);
		values.put("nama", "Pt Aqua Club");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "Club adalah merek air minum dalam kemasan atau air mineral di indonesia, merek ini berasal dari Surabaya dan Pandaan, Pasuruan< Jawa Timur, Club diproduksi oleh Pt Tirta Sukses Perkasa dahulu Pt Tirta Bahagia sejak tahun 1986, pada bulan november 2013 merek club di akuisisi oleh Pt Indofood CBP Sukses Makmur Tbk.");
		values.put("koordinat","-6.70619 , 106.80437");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "3");
		values.put("image", R.drawable.ptsumbersukses);
		values.put("nama", "Pt Sumber Sukses Sentosa");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "Pt Sumber Sukses Sentosa Mengelola air minum dalam kemasan yang bermerek v.");
		values.put("koordinat","-6.72125 , 106.81991");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "4");
		values.put("image", R.drawable.ptkgfashion);
		values.put("nama", "Pt Kg Fashion Indonesia");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "Pt Kg Fashion Indonesia adalah kelompok industri pakaian jadi dari tekstil.");
		values.put("koordinat","-6.76670 , 106.79850");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "5");
		values.put("image", R.drawable.pthitelectro);
		values.put("nama", "Pt Hit Electro Mechanics Indonesia");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "Pt Hit Electro Mechanics Indonesia adalah alat alat elektronik untuk keperluan kelistrikan.");
		values.put("koordinat","-6.76793 , 106.79469");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "6");
		values.put("image", R.drawable.ptaquaclub);
		values.put("nama", "Pt Aqua Mas");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "Aqua adalah sebuah merek air minum dalam kemasan yang di produksi oleh Pt Aqua Golden Mississippi Tbk di indonesia sejak tahun 1973.");
		values.put("koordinat","-6.69932 , 106.79610");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "7");
		values.put("image", R.drawable.ptyungnam);
		values.put("nama", "Pt Yungnam Indonesia");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "Badan usaha dengan produk pakaian jadi, adalah pakaian jadi dari tekstil.");
		values.put("koordinat","-6.75539 , 106.79938");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "8");
		values.put("image", R.drawable.ptyongjin);
		values.put("nama", "Pt Yongjin Javasuka Garment Fac 1");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.76322 , 106.80376");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "9");
		values.put("image", R.drawable.ic_launcher);
		values.put("nama", "Pt Sunshine World");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "Pt Sunshine World adalah industri pakaian jadi berupa konveksi.");
		values.put("koordinat","-6.76556 , 106.80244");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "10");
		values.put("image", R.drawable.ptmanito);
		values.put("nama", "Pt Manito World Kawasan Berkat");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "Adalah produsen merajut ekspor dan impor yang memiliki bisnis dalam memproduksi dan mengekspor pakaian modis dan aksesoris.");
		values.put("koordinat","-6.76566 , 106.80235");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "11");
		values.put("image", R.drawable.ptgalenium);
		values.put("nama", "Pt Galenium Pharmasia");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.540200 , 106.826302");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "12");
		values.put("image", R.drawable.ptastraortopart);
		values.put("nama", "Pt Astra Ortopart");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.538100 , 106.826500");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "13");
		values.put("image", R.drawable.ic_launcher);
		values.put("nama", "Pt Asalta Mandiri Agung");
		values.put("keterangan", "Industri");
		values.put("deskripsi", "");
		values.put("koordinat","-6.519300 , 106.830399");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "14");
		values.put("image", R.drawable.ptsutrakabel);
		values.put("nama", "Pt Sutra Kabel");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.519900 , 106.830002");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "15");
		values.put("image", R.drawable.ptkeramik);
		values.put("nama", "Pt Keramik");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.519800 , 106.830002");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "16");
		values.put("image", R.drawable.ptputrabintang);
		values.put("nama", "Pt Putra Bintang Kharisma");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.519800 , 106.832001");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "17");
		values.put("image", R.drawable.pttoyotagosei);
		values.put("nama", "Pt Toyota Gosei Safety System");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.513000 , 106.840401");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "18");
		values.put("image", R.drawable.ptkartikasinar);
		values.put("nama", "Pt Kartika Sinar Teknik");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.511900 , 106.841599");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "19");
		values.put("image", R.drawable.ptharihikmah);
		values.put("nama", "Pt Hari Hikmah Indah");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.508100 , 106.842499");
		db.insert("IndustriBogor", "_id", values);
		
		values.put("_id", "20");
		values.put("image", R.drawable.ptperefetti);
		values.put("nama", "Pt Perefetti Van Melle Indonesia");
		values.put("keterangan", "Industri");
		values.put("deskripsi", ".");
		values.put("koordinat","-6.507800 , 106.842400");
		db.insert("IndustriBogor", "_id", values);
			}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//TODO Auto-generated method stub

	}
}
