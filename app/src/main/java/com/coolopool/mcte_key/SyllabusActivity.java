package com.coolopool.mcte_key;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SyllabusActivity extends AppCompatActivity {
    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        browser = (WebView) findViewById(R.id.webview);
        browser.loadUrl("http://192.168.43.124/MMM/");
    }
}
