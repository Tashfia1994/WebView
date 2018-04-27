package com.tashfia.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


        web=(WebView)findViewById(R.id.web);

        //data received
        String getUrl = getIntent().getExtras().getString("url");
        //Webview Settings
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setBuiltInZoomControls(true);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://"+getUrl);




    }
}
