package com.example.gugum.uasppbbrowser;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
    String theUrl = "";
    public WebView webBrowserKu;
    private BottomNavigationView bottomNavigationView;
    Button btn1, btn2, btn3, btn4, btn5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                webBrowserKu.goBack(); //backward traverse
            }
        });
        btn3 = (Button) findViewById(R.id.btn33);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                webBrowserKu.goForward(); // Forward traverse

            }
        });
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                webBrowserKu.reload(); // To page reload
            }
        });
        btn5 = (Button) findViewById(R.id.button6);
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish(); // Exit from Applcation
            }
        });


        //loading setelah activity_main.xml terloading
        webBrowserKu = (WebView) findViewById(R.id.myWebView);
        //kita ingin supaya setiap link yang di click ditampilkan di WebView
        webBrowserKu.setWebViewClient(new WebViewClient());
        //enable kan Javascript
        WebSettings theWebSetting = webBrowserKu.getSettings();
        theWebSetting.setJavaScriptEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    public void gotoUrl(View view) {
        EditText theEditText = (EditText) findViewById(R.id.urlTxt);
        theUrl = theEditText.getText().toString();
        //
        webBrowserKu.loadUrl(theUrl);

    }

    public void Tentang(MenuItem item) {
        Intent i = null;
        i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }

    ;
}
