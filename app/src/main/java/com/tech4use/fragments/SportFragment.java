package com.tech4use.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SportFragment extends Fragment {

    WebView w_top;
    //opening website in same app
    WebViewClient web_client;

    public SportFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sport, container, false);

        //setting id of webview
        w_top = (WebView)v.findViewById(R.id.web_top);

        //setting javascript
        w_top.getSettings().setJavaScriptEnabled(true);

        web_client = new WebViewClient();

        w_top.setWebViewClient(web_client);

        //setting the url
        w_top.loadUrl("https://www.tech4use.com/how-to-make-whatsapp-account-with-us-number/");
        return v;
    }



}