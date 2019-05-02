package com.tech4use.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Fragment7 extends Fragment {

    WebView w_frag7;
    //opening website in same app
    WebViewClient web_client;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment7, container, false);

        //setting id of webview
        w_frag7 = (WebView)v.findViewById(R.id.web_frag7);

        //setting javascript
        w_frag7.getSettings().setJavaScriptEnabled(true);

        web_client = new WebViewClient();

        w_frag7.setWebViewClient(web_client);

        //setting the url
        w_frag7.loadUrl("https://www.tech4use.com/top-10-fastest-bikes-of-the-world-2018/");

        return v;
    }
}
