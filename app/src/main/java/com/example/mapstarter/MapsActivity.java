package com.example.mapstarter;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng home = new LatLng(-0.8312381674730953, 119.88544849418344);
        LatLng kelurahan = new LatLng(-0.8433428252447268, 119.88566232005087);
        mMap.addMarker(new MarkerOptions().position(home).title("Starting Marker").
                snippet("Akbar's Boarding House").icon(BitmapFromVector(getApplicationContext(),R.mipmap.ic_start)));
        mMap.addMarker(new MarkerOptions().position(kelurahan).title("Mantikulore Urban Village Office").
                snippet("Tondo Urban Village Office, Tondo, Mantikulore, Palu City, Central Sulawesi 94148").icon(BitmapFromVector(getApplicationContext(),R.drawable.ic_finish)));
        mMap.addPolyline(new PolylineOptions().add(
                home,
                /** Lorong Kos **/
                new LatLng(-0.8313096063717802, 119.8854594444391),
                new LatLng(-0.8312697392934396, 119.88571063346062),
                new LatLng(-0.8308545337229063, 119.88570983642197),
                new LatLng(-0.8304884506699501, 119.8856528394796),
                new LatLng(-0.8304509036880857, 119.88563674622422),
                new LatLng(-0.8304113452612418, 119.88561595910558),
                new LatLng(-0.8303838555067684, 119.88558913701696),
                new LatLng(-0.8303638896258352, 119.88553494819531),
                new LatLng(-0.8303598667349475, 119.88548130401354),
                new LatLng(-0.8303372478159291, 119.88443813353823),
                new LatLng(-0.8303513279342714, 119.88438515991324),
                new LatLng(-0.8303519984161009, 119.88432078690059),
                new LatLng(-0.8303571710256247, 119.88428698923856),
                new LatLng(-0.8303699101800918, 119.88425949659515),
                new LatLng(-0.830386001743757, 119.8842387094765),
                new LatLng(-0.8304168439072888, 119.88422731008883),
                new LatLng(-0.8305428944873847, 119.88419512357825),
                new LatLng(-0.830924704553154, 119.88414697218039),
                new LatLng(-0.8309917527252859, 119.88413222003167),
                new LatLng(-0.8310252768109321, 119.88411880898735),
                new LatLng(-0.8310561189694639, 119.88409668076424),
                new LatLng(-0.8310782448656631, 119.8840711997801),
                new LatLng(-0.8311050641336126, 119.88401688505067),
                new LatLng(-0.8311164623224361, 119.8839873807532),
                new LatLng(-0.8311184737695148, 119.88390020896026),
                new LatLng(-0.8311064050987346, 119.88382443654757),
                new LatLng(-0.8311164623241664, 119.88376073408715),
                new LatLng(-0.8311318834031015, 119.88372117150647),
                new LatLng(-0.8311935677201652, 119.88360784817354),
                new LatLng(-0.831205636390411, 119.88356761504065),
                new LatLng(-0.8312076478354541, 119.8835387812954),
                new LatLng(-0.8310916545014126, 119.88302312660939),
                new LatLng(-0.8310748924589076, 119.88292522598597),
                new LatLng(-0.8310695286052897, 119.88289169837522),
                new LatLng(-0.8310695286055696, 119.88281592596353),
                new LatLng(-0.8310869611298023, 119.88274551798094),
                /** Jl. Trans Sulawesi **/
                new LatLng(-0.831132553885109, 119.88267175723729),
                new LatLng(-0.8312752096006298, 119.88268830730189),
                new LatLng(-0.8319752048094875, 119.882853661674),
                new LatLng(-0.8335141106665869, 119.88312069164411),
                new LatLng(-0.8360297798032917, 119.88340105823008),
                new LatLng(-0.8361236471251328, 119.88340508154411),
                new LatLng(-0.836209468673328, 119.8834117870669),
                new LatLng(-0.8368075033180777, 119.88346094620236),
                new LatLng(-0.8372284337733903, 119.88346627832959),
                new LatLng(-0.837588760607137, 119.88345882826144),
                new LatLng(-0.8381649068410901, 119.8834211356148),
                new LatLng(-0.8387711011001507, 119.88336971822504),
                new LatLng(-0.8387871926294533, 119.88336837712062),
                new LatLng(-0.8390473390134496, 119.88334490779),
                new LatLng(-0.8406126528414185, 119.88331267885444),
                new LatLng(-0.8406595864462659, 119.88330597333226),
                new LatLng(-0.841541226672036, 119.8832646474342),
                new LatLng(-0.8421511898027737, 119.88321898693626),
                new LatLng(-0.8429176132824222, 119.88313282756762),
                /** Jl. Untad I **/
                new LatLng(-0.8429839907712173, 119.88369810311346),
                new LatLng(-0.8430805398427614, 119.88423253327082),
                new LatLng(-0.8431531685905148, 119.88483121783267),
                new LatLng(-0.8432003469538536, 119.88567047762069),
                kelurahan
                ).width(20)
                .color(Color.rgb(102, 157, 246))
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home, 14.5f));
        UiSettings uiSettings = googleMap.getUiSettings();
        uiSettings.setCompassEnabled(true);
        uiSettings.setZoomControlsEnabled(true);
        uiSettings.setMyLocationButtonEnabled(true);
    }

    private BitmapDescriptor BitmapFromVector(Context context, int vectorResId) {
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);

        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight());

        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bitmap);

        vectorDrawable.draw(canvas);

        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }
}