package com.example.abvm537.twitter;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_person_add_white_48dp);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("TWEETS");//assignig tab buttons
       
        tabSpec.setContent(R.id.TWEETS);
        tabSpec.setIndicator("");


        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("FOLLOWING");//assignig tab buttons
        tabSpec.setContent(R.id.FOLLOWING);
        tabSpec.setIndicator("");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("FOLLWERS");//assignig tab buttons
        tabSpec.setContent(R.id.FOLLOWERS);
        tabSpec.setIndicator("");
        tabHost.addTab(tabSpec);
        tabHost.getTabWidget().getChildAt(0).setBackground(getDrawable(R.drawable.tweets));
        tabHost.getTabWidget().getChildAt(1).setBackground(getDrawable(R.drawable.folowing));
        tabHost.getTabWidget().getChildAt(2).setBackground(getDrawable(R.drawable.followers));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
