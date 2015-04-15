package com.ajapps.climatecars;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ajapps.climatecars.slidingtabscolors.R;


public class Ios extends Fragment {
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
	        View ios = inflater.inflate(R.layout.ios_frag, container, false);
	        ((TextView)ios.findViewById(R.id.textView)).setText("iOS");
	        return ios;
}}
