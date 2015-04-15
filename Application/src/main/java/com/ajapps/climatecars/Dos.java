package com.ajapps.climatecars;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ajapps.climatecars.slidingtabscolors.R;


public class Dos extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View android = inflater.inflate(R.layout.fragment_dos, container, false);
        ((TextView)android.findViewById(R.id.textView)).setText("DOS");
        return android;
    }}