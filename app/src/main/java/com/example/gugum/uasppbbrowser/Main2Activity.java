package com.example.gugum.uasppbbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView browser = (WebView) findViewById(R.id.webkit);        //Use same layout and manifest of previous example
        browser.loadData("" +
                "<html>" +
                "   <body>" +
                "  <title>About Aplikasi </title>" +
                "<p>" +
                "Aplikasi ini adalah aplikasi browser pemrograman perangkat bergerak<br/><br/><br/>" +
                "Aplikasi ini dibuat oleh :<br/>" +
                "Gugum Gumilar (1406060)<br/>" +
                "Muhammad Iqbal Nugraha (1406078)<br/>" +
                "Rahmat Ramdani (1406098)<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");

    }
}
