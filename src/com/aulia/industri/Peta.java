package com.aulia.industri;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Context;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter; 
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;


import android.os.Bundle;
import android.os.Handler;


import android.location.LocationListener;
import android.location.Location;
import android.location.LocationManager;
import android.location.Criteria;
import android.net.Uri;
import android.provider.Settings;
import android.graphics.Color;
import android.view.Display;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Hashtable;

import org.w3c.dom.Document;

import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

import java.net.MalformedURLException;
import java.net.URL;
 



import com.google.android.gms.maps.model.UrlTileProvider;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;




import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.FIFOLimitedMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.assist.SimpleImageLoadingListener;


import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;

import org.w3c.dom.Document;

public class Peta extends ActionBarActivity implements OnClickListener, GoogleApiClient.ConnectionCallbacks,
GoogleApiClient.OnConnectionFailedListener {
	static final LatLng PtKopontrenNikmatulJwhrgas = new LatLng(-6.70601, 106.80306);
	static final LatLng PtAquaClub = new LatLng(-6.70619, 106.80437);
	static final LatLng PtSumberSuksesSentosa = new LatLng(-6.72125, 106.81991);
	static final LatLng PtKgFashionIndonesia = new LatLng(-6.76670, 106.79850);
	static final LatLng PtHitElectroMechanicsIndonesia = new LatLng(-6.76793, 106.79469);
	static final LatLng PtAquaMas = new LatLng(-6.69932, 106.79610);
	static final LatLng PtYungnamIndonesia = new LatLng(-6.75539, 106.79938);
	static final LatLng PtYongjinJavasukaGarmentFac1 = new LatLng(-6.76322, 106.80376);
	static final LatLng PtSunshineWorld = new LatLng(-6.76556, 106.80244);
	static final LatLng PtManitoWorldKawasanBerkat = new LatLng(-6.76566, 106.80235);
	static final LatLng PtGaleniumPharmasia = new LatLng(-6.540200, 106.826302);
	static final LatLng PtAstraOrtopart = new LatLng(-6.538100, 106.826500);
	static final LatLng PtAsaltaMandiriAgung = new LatLng(-6.519300, 106.830399);
	static final LatLng PtSutraKabel = new LatLng(-6.519900, 106.830002);
	static final LatLng PtKeramik = new LatLng(-6.519800, 106.830002);
	static final LatLng PtPutraBintangKharisma = new LatLng(-6.519800, 106.832001);
	static final LatLng PtToyotaGoseiSafetySystem = new LatLng(-6.513000, 106.840401);
	static final LatLng PtKartikaSinarTeknik = new LatLng(-6.511900, 106.841599);
	static final LatLng PtHariHikmahIndah = new LatLng(-6.508100, 106.842499);
	static final LatLng PtPerefettiVanMelleIndonesia = new LatLng(-6.507800, 106.842400);
	
	private LatLngBounds latlngBounds;
	private Polyline newPolyline;
	private boolean isTravelling = false;
	private int width, height;
	
	   
	Gmapv2Direction md;
	private GoogleMap map_skripsi;
	private LocationManager locationManager;
	private String provider;
	private Location location;
    private GoogleApiClient googleApiClient;
    private Marker marker;
	private Hashtable<String, String> markers;
	private ImageLoader imageLoader;
	private DisplayImageOptions options;
	
	private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private Button downButton;
    private ListView lv_menutab;
    TextView tvDistanceDuration;
    String[] menu = {"Tempat Industri","Jalur Menuju Lokasi","Bantuan","Tentang"};
    Integer[] imageId = { R.drawable.industri,R.drawable.navigasi,R.drawable.bantuan, R.drawable.about_me };
    
    public int currentimageindex=0;

    ImageView slidingimage;
  

	
private Toast mToast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testing);
//		setupMap();
		setupNavigasi();	
//		listviewnavigasi();
//		getSreenDimanstions();
	}

	private void setupMap(){
//		if (map_skripsi == null){
//			map_skripsi = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
//		        
//		if (map_skripsi != null){
//			
//			AddMarker();			
//			GPS_Skripsi();
//			}
//		}

	}
	private void AddMarker(){
		
		final Marker MPtKopontrenNikmatulJwhrgas = map_skripsi.addMarker(new MarkerOptions()
		.position(PtKopontrenNikmatulJwhrgas)
		.title("Industri")
		.snippet("Perumahan Bogor Nirwana Residence.")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtAquaClub = map_skripsi.addMarker(new MarkerOptions()
		.position(PtAquaClub)
		.title("Industri")
		.snippet("Jl. Kapten Muslihat No.51")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtSumberSuksesSentosa = map_skripsi.addMarker(new MarkerOptions()
		.position(PtSumberSuksesSentosa)
		.title("Industri")
		.snippet("Jalan Raya Veteran.")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtKgFashionIndonesia = map_skripsi.addMarker(new MarkerOptions()
		.position(PtKgFashionIndonesia)
		.title("Industri")
		.snippet("Jl. Raya Baru I Kompleks Bukit Cimanggu City.")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtHitElectroMechanicsIndonesia = map_skripsi.addMarker(new MarkerOptions()
		.position(PtHitElectroMechanicsIndonesia)
		.title("Industri")
		.snippet("Jl. Raya Katulampa No.6.")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtAquaMas = map_skripsi.addMarker(new MarkerOptions()
		.position(PtAquaMas)
		.title("Industri")
		.snippet("Jl. Ir. H. Juanda No.13.")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtYungnamIndonesia = map_skripsi.addMarker(new MarkerOptions()
		.position(PtYungnamIndonesia)
		.title("Industri")
		.snippet("Jl. Tanah sareal no. 2.")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtYongjinJavasukaGarmentFac1 = map_skripsi.addMarker(new MarkerOptions()
		.position(PtYongjinJavasukaGarmentFac1)
		.title("Industri")
		.snippet("Jl. Pemuda No. 4 Kota Bogor ")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtSunshineWorld = map_skripsi.addMarker(new MarkerOptions()
		.position(PtSunshineWorld)
		.title("Industri")
		.snippet("Perumahan Bogor Nirwana Residence")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtManitoWorldKawasanBerkat = map_skripsi.addMarker(new MarkerOptions()
		.position(PtManitoWorldKawasanBerkat)
		.title("Industri")
		.snippet("Jalan Parung Benteng RT 04/01 No 120 Kelurahan Katulampa, Bogor Timur")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
			
		final Marker MPtGaleniumPharmasia = map_skripsi.addMarker(new MarkerOptions()
		.position(PtGaleniumPharmasia)
		.title("Industri")
		.snippet("Jl. Pajajaran Komplek V Point No. 1 Bantarjati Bogor Utara ")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtAstraOrtopart = map_skripsi.addMarker(new MarkerOptions()
		.position(PtAstraOrtopart)
		.title("Industri")
		.snippet("JL. Bina marga raya.")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtAsaltaMandiriAgung = map_skripsi.addMarker(new MarkerOptions()
		.position(PtAsaltaMandiriAgung)
		.title("Industri")
		.snippet("Jl. Citarum, BXI/6, Komp. Bogor Baru Taman")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtSutraKabel = map_skripsi.addMarker(new MarkerOptions()
		.position(PtSutraKabel)
		.title("Industri")
		.snippet("JL.Siliwangi No.27C")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtKeramik = map_skripsi.addMarker(new MarkerOptions()
		.position(PtKeramik)
		.title("Industri")
		.snippet("JL. Raya Pajajaran, (Depan Gedung Bale Binarum)")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
		final Marker MPtPutraBintangKharisma = map_skripsi.addMarker(new MarkerOptions()
		.position(PtPutraBintangKharisma)
		.title("Industri")
		.snippet("Jl. Ir.H.Juanda 22-24, Pusat Penelitian Biologi – LIPI, Bogor")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
		
		final Marker MPtToyotaGoseiSafetySystem = map_skripsi.addMarker(new MarkerOptions()
		.position(PtToyotaGoseiSafetySystem)
		.title("Industri")
		.snippet("Jl.Jenderal Sudirman N0.35 Bogor ")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
		
		final Marker MPtKartikaSinarTeknik = map_skripsi.addMarker(new MarkerOptions()
		.position(PtKartikaSinarTeknik)
		.title("Industri")
		.snippet("Jl.Ir. H. Juanda No. 9 Bogor ")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
		
		final Marker MPtHariHikmahIndah = map_skripsi.addMarker(new MarkerOptions()
		.position(PtHariHikmahIndah)
		.title("Industri")
		.snippet("Jl. Medan Merdeka no.56 kel.cibogor, kec.bogor tengah, Bogor ")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
		
		final Marker MPtPerefettiVanMelleIndonesia = map_skripsi.addMarker(new MarkerOptions()
		.position(PtPerefettiVanMelleIndonesia)
		.title("Industri")
		.snippet("Jl. Batu Tulis, kel.Batu tulis, Bogor")
		.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
		
		final String[] mPin = { "Industri", "Industri","Industri"};

        final ListView lvDrawer3 = (ListView) findViewById(R.id.lv_maps_drawer3);

        ArrayAdapter<String> adapterDrawer3 = new ArrayAdapter<String>(this, R.layout.simple_list_item_multiple_choice, mPin);
        lvDrawer3.setAdapter(adapterDrawer3);
        lvDrawer3.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lvDrawer3.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 6; i++) {
					ListView lv = (ListView) parent;
					if (lv.isItemChecked(position)) {
                        // Toast.makeText(getBaseContext(), "You checked " + mPin[position], Toast.LENGTH_SHORT).show();
                        if (mPin[position].equals("Industri")) {
                        	MPtKopontrenNikmatulJwhrgas.setVisible(true);
                        	MPtAquaClub.setVisible(true);
                        	MPtSumberSuksesSentosa.setVisible(true);
                    		MPtKgFashionIndonesia.setVisible(true);	
                        
                        } else if (mPin[position].equals("Industri")) {
                        	MPtHitElectroMechanicsIndonesia.setVisible(true);
                        	MPtAquaMas.setVisible(true);
                    		MPtYungnamIndonesia.setVisible(true);
                    		MPtYongjinJavasukaGarmentFac1.setVisible(true);
                    		MPtSunshineWorld.setVisible(true);
                    		MPtManitoWorldKawasanBerkat.setVisible(true);
                    		MPtGaleniumPharmasia.setVisible(true);
                    		MPtAstraOrtopart.setVisible(true);
                    		MPtAsaltaMandiriAgung.setVisible(true);
                    		MPtSutraKabel.setVisible(true);
                    		MPtKeramik.setVisible(true);
                    		MPtPutraBintangKharisma.setVisible(true);
                    		MPtToyotaGoseiSafetySystem.setVisible(true);
                    		MPtKartikaSinarTeknik.setVisible(true);
                    		MPtHariHikmahIndah.setVisible(true);
                    		
                        } else if (mPin[position].equals("Industri")) {
                    		MPtPerefettiVanMelleIndonesia.setVisible(true);
                        	
                        } 
                       
                    } else {
                        // Toast.makeText(getBaseContext(), "You unchecked " + mPin[position], Toast.LENGTH_SHORT).show();
                    	if (mPin[position].equals("Industri")) {
                    		MPtKopontrenNikmatulJwhrgas.setVisible(false);
                        	MPtAquaClub.setVisible(false);
                        	MPtSumberSuksesSentosa.setVisible(false);
                    		MPtKgFashionIndonesia.setVisible(false);

                        } else if (mPin[position].equals("Industri")) {
                        	MPtHitElectroMechanicsIndonesia.setVisible(false);
                        	MPtAquaMas.setVisible(false);
                    		MPtYungnamIndonesia.setVisible(false);
                    		MPtYongjinJavasukaGarmentFac1.setVisible(false);
                    		MPtSunshineWorld.setVisible(false);
                    		MPtManitoWorldKawasanBerkat.setVisible(false);
                    		MPtGaleniumPharmasia.setVisible(false);
                    		MPtAstraOrtopart.setVisible(false);
                    		MPtAsaltaMandiriAgung.setVisible(false);
                    		MPtSutraKabel.setVisible(false);
                    		MPtKeramik.setVisible(false);
                    		MPtPutraBintangKharisma.setVisible(false);
                    		MPtToyotaGoseiSafetySystem.setVisible(false);
                    		MPtKartikaSinarTeknik.setVisible(false);
                    		MPtHariHikmahIndah.setVisible(false);
                        	
                        } else if (mPin[position].equals("Industri")) {
                        	MPtPerefettiVanMelleIndonesia.setVisible(false);
                        	
                        } 
                       
                        }
					}
				}
			});

	}
	private void GPS_Skripsi(){
		map_skripsi.setMyLocationEnabled(true);
		map_skripsi.setBuildingsEnabled(true);
		map_skripsi.setTrafficEnabled(false);
		map_skripsi.getUiSettings().setZoomControlsEnabled(true);
		map_skripsi.getUiSettings().setMyLocationButtonEnabled(true);
		
		googleApiClient = new GoogleApiClient.Builder(this)
	     .addConnectionCallbacks(this) 
	     .addOnConnectionFailedListener(this)
	     .addApi(LocationServices.API)
	     .build();
		LocationManager service = (LocationManager) getSystemService(LOCATION_SERVICE);
		boolean enabledGPS = service.isProviderEnabled(LocationManager.GPS_PROVIDER);
	       if (!enabledGPS) {
	           Toast.makeText(this, "Aktifkan GPS Terlebih Dahulu", Toast.LENGTH_LONG).show();
	            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
	            startActivity(intent);
	        }
	
	}
	private void setupNavigasi(){
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
       
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.drawable.ic_launcher, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.setDrawerListener(mDrawerToggle); 
         
        mDrawerLayout.setStatusBarBackgroundColor(
                getResources().getColor(R.color.holo_blue_dark));

	}
	
	private void listviewnavigasi(){
		KonfigListView adapter = new
				KonfigListView(Peta.this, menu, imageId);
		        //get Id List
		lv_menutab=(ListView)findViewById(R.id.lv_menutab);
		        //Set adapter to list
		lv_menutab.setAdapter(adapter);
		        //Set ketika salah satu list di pilih(klik)
		lv_menutab.setOnItemClickListener(new AdapterView.OnItemClickListener() {
		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
		               
		            	if (position == 0) {
		            		Intent intent = new Intent(Peta.this, ListIndustri.class);
		            		startActivity(intent);
		            		} 
		            	
		            
		            if(position ==1){
		            	 new MaterialDialog.Builder(Peta.this)
		 		        .title(R.string.action_header_choice)
		 		        .positiveText("Ya")
		 		        .negativeText("Tidak")
		 		        .items(R.array.list_goto)
		 		        .itemsCallbackSingleChoice(0,new MaterialDialog.ListCallback() {
							
							@Override
							public void onSelection(MaterialDialog dialog, View itemView, int which,
									CharSequence text) {
								// TODO Auto-generated method stub
								if(which==0){
									findDirections( location.getLatitude(), location.getLongitude(),PtSutraKabel.latitude, PtSutraKabel.longitude, Gmapv2Direction.MODE_WALKING );
									
								}
								if(which==1){
									findDirections(location.getLatitude(), location.getLongitude(),PtYungnamIndonesia.latitude, PtYungnamIndonesia.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==2){
									findDirections(location.getLatitude(), location.getLongitude(),PtAsaltaMandiriAgung.latitude, PtAsaltaMandiriAgung.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==6){
									findDirections(location.getLatitude(), location.getLongitude(),PtSunshineWorld.latitude, PtSunshineWorld.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==7){
									findDirections(location.getLatitude(), location.getLongitude(),PtAquaMas.latitude, PtAquaMas.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==9){
									findDirections(location.getLatitude(), location.getLongitude(),PtKeramik.latitude, PtKeramik.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==10){
									findDirections(location.getLatitude(), location.getLongitude(),PtKgFashionIndonesia.latitude, PtKgFashionIndonesia.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==11){
									findDirections(location.getLatitude(), location.getLongitude(),PtPutraBintangKharisma.latitude, PtPutraBintangKharisma.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==12){
									findDirections(location.getLatitude(), location.getLongitude(),PtHariHikmahIndah.latitude, PtHariHikmahIndah.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==13){
									findDirections(location.getLatitude(), location.getLongitude(),PtToyotaGoseiSafetySystem.latitude, PtToyotaGoseiSafetySystem.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==14){
									findDirections(location.getLatitude(), location.getLongitude(),PtKartikaSinarTeknik.latitude, PtKartikaSinarTeknik.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==15){
									findDirections(location.getLatitude(), location.getLongitude(),PtSumberSuksesSentosa.latitude, PtSumberSuksesSentosa.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==16){
									findDirections(location.getLatitude(), location.getLongitude(),PtManitoWorldKawasanBerkat.latitude, PtManitoWorldKawasanBerkat.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==17){
									findDirections(location.getLatitude(), location.getLongitude(),PtPerefettiVanMelleIndonesia.latitude, PtPerefettiVanMelleIndonesia.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==18){
									findDirections(location.getLatitude(), location.getLongitude(),PtAstraOrtopart.latitude, PtAstraOrtopart.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==19){
									findDirections(location.getLatitude(), location.getLongitude(),PtGaleniumPharmasia.latitude, PtGaleniumPharmasia.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==20){
									findDirections(location.getLatitude(), location.getLongitude(),PtHitElectroMechanicsIndonesia.latitude, PtHitElectroMechanicsIndonesia.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==21){
									findDirections(location.getLatitude(), location.getLongitude(),PtYongjinJavasukaGarmentFac1.latitude, PtYongjinJavasukaGarmentFac1.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==22){
									findDirections(location.getLatitude(), location.getLongitude(),PtAquaClub.latitude, PtAquaClub.longitude, Gmapv2Direction.MODE_WALKING );
								}
								if(which==23){
									findDirections(location.getLatitude(), location.getLongitude(),PtKopontrenNikmatulJwhrgas.latitude, PtKopontrenNikmatulJwhrgas.longitude, Gmapv2Direction.MODE_WALKING );
								}
							}
								
							
						})
							
		            	
						.build()
		 		        .show();
		            	 
		            
		            
		            }
		            if(position ==2){
		            	 new MaterialDialog.Builder(Peta.this)
			 		        .title("Bantuan")
			 		        .positiveText("OK")
			 		        .content(Html.fromHtml(getString(R.string.action_body_bantuan)))
			 		        .contentLineSpacing(1.6f)
			 		        .callback(new MaterialDialog.SimpleCallback() {
			 		            @Override
			 		            public void onPositive(MaterialDialog dialog) {
			 		            }
			 		        })
			 		        .build()
			 		        .show();
		            }
		            if(position ==3){
		            	Intent intent = new Intent(Peta.this, TentangAplikasi.class);
	            		startActivity(intent);
		            }
		            }
		            });
	
	}
	
	
	
	
	

	@Override
		public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
	}
		 
		
	@Override
		public void onBackPressed() {
		// TODO Auto-generated method stub
		/* Intent backIntent = new Intent(this, MenuUtama.class);
		  startActivity(backIntent); */
		finish();
		super.onBackPressed();
		
	}
	@Override
		public void onClick(View v) {
		// TODO Auto-generated method stub
		

	}

	
	 /* Request updates at startup */
    @Override
    protected void onResume() {
        super.onResume();
        //locationManager.requestLocationUpdates(provider, 1000, 1, this);
        latlngBounds = createLatLngBoundsObject(PtKopontrenNikmatulJwhrgas, PtAquaClub);
        map_skripsi.moveCamera(CameraUpdateFactory.newLatLngBounds(latlngBounds, width, height, 150));

    }

    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	googleApiClient.connect();

    }
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	 if (googleApiClient.isConnected()) {
             googleApiClient.disconnect();
         }

    }
    /* Remove the locationlistener updates when Activity is paused */
    @Override
    protected void onPause() {
        super.onPause();
    
    }


	
	
	public void handleGetDirectionsResult(ArrayList<LatLng> directionPoints) {
		PolylineOptions rectLine = new PolylineOptions().width(5).color(Color.BLUE);

		for(int i = 0 ; i < directionPoints.size() ; i++) 
		{          
			rectLine.add(directionPoints.get(i));
		}
		if (newPolyline != null)
		{
			newPolyline.remove();
		}
		newPolyline = map_skripsi.addPolyline(rectLine);
		
	
		
	}
	
	private void getSreenDimanstions()
	{
		Display display = getWindowManager().getDefaultDisplay();
		width = display.getWidth(); 
		height = display.getHeight(); 
	}
	
	private LatLngBounds createLatLngBoundsObject(LatLng firstLocation, LatLng secondLocation)
	{
		if (firstLocation != null && secondLocation != null)
		{
			LatLngBounds.Builder builder = new LatLngBounds.Builder();    
			builder.include(firstLocation).include(secondLocation);
			return builder.build();
		}
		return null;
	}
	
	public void findDirections(double fromPositionDoubleLat, double fromPositionDoubleLong, double toPositionDoubleLat, double toPositionDoubleLong, String mode)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put(Asyntask.USER_CURRENT_LAT, String.valueOf(fromPositionDoubleLat));
		map.put(Asyntask.USER_CURRENT_LONG, String.valueOf(fromPositionDoubleLong));
		map.put(Asyntask.DESTINATION_LAT, String.valueOf(toPositionDoubleLat));
		map.put(Asyntask.DESTINATION_LONG, String.valueOf(toPositionDoubleLong));
		map.put(Asyntask.DIRECTIONS_MODE, mode);
		
		//Asyntask asyncTask = new Asyntask(this);
		//asyncTask.execute(map);	
	}

	@Override
	public void onConnectionFailed(ConnectionResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onConnected(Bundle arg0) {
		// TODO Auto-generated method stub
		 if (location == null) {
	            // get last location device
	            location = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
	         }

	}

	@Override
	public void onConnectionSuspended(int arg0) {
		// TODO Auto-generated method stub
		
	}
	/*private class CustomInfoWindowAdapter implements InfoWindowAdapter {  
	    private View view;
	    public CustomInfoWindowAdapter() {
	      view = getLayoutInflater().inflate(R.layout.info_window, null);
	     }
	     @Override
	     public View getInfoContents(final Marker marker) {
	    	 if (Peta.this.marker != null
						&& MapLokasi.this.marker.isInfoWindowShown()) {
	    		 MapLokasi.this.marker.hideInfoWindow();
	    		 MapLokasi.this.marker.showInfoWindow();
				}
				return null;
			}
	 
	     @Override
	     public View getInfoWindow(final Marker marker) {
	    	 MapLokasi.this.marker = marker;

				String url = null;

				if (marker.getId() != null && markers != null && markers.size() > 0) {
					if ( markers.get(marker.getId()) != null &&
							markers.get(marker.getId()) != null) {
						url = markers.get(marker.getId());
					}
				}
				final ImageView image = ((ImageView) view.findViewById(R.id.badge));

				if (url != null && !url.equalsIgnoreCase("null")
						&& !url.equalsIgnoreCase("")) {
					imageLoader.displayImage(url, image, options,
							new SimpleImageLoadingListener() {
								@Override
								public void onLoadingComplete(String imageUri,
										View view, Bitmap loadedImage) {
									super.onLoadingComplete(imageUri, view,
											loadedImage);
									getInfoContents(marker);
								}
							});
				} else {
					image.setImageResource(R.drawable.ic_launcher);
				}

				final String title = marker.getTitle();
				final TextView titleUi = ((TextView) view.findViewById(R.id.title));
				if (title != null) {
					titleUi.setText(title);
				} else {
					titleUi.setText("");
				}

				final String snippet = marker.getSnippet();
				final TextView snippetUi = ((TextView) view
						.findViewById(R.id.snippet));
				if (snippet != null) {
					snippetUi.setText(snippet);
				} else {
					snippetUi.setText("");
				}

				return view;
			} */
		}


