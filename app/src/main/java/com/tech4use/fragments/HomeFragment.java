package com.tech4use.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HomeFragment extends Fragment {

    WebView w_home;
    //opening website in same app
    WebViewClient web_client;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        //setting id of webview
        w_home = (WebView)v.findViewById(R.id.web_home);

        //setting javascript
        w_home.getSettings().setJavaScriptEnabled(true);

        web_client = new WebViewClient();

        w_home.setWebViewClient(web_client);

        //setting the url
        w_home.loadUrl("https://www.tech4use.com/");
        return v;
    }

}