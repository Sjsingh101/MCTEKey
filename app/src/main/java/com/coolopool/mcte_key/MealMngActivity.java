package com.coolopool.mcte_key;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MealMngActivity extends AppCompatActivity {

    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_mng);

       browser = (WebView) findViewById(R.id.webview);
        browser.loadUrl("https://github.com");
    }
}
