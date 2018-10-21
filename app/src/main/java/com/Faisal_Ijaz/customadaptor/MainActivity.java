package com.Faisal_Ijaz.customadaptor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AndroidFlavor> androidFlavors = new ArrayList<AndroidFlavor>();

        androidFlavors.add(new AndroidFlavor("Cupcake",R.drawable.android1,1.5));
        androidFlavors.add(new AndroidFlavor("Donut",R.drawable.android2,1.6));
        androidFlavors.add(new AndroidFlavor("Eclair",R.drawable.android3,2.0));
        androidFlavors.add(new AndroidFlavor("Froyo",R.drawable.android4,2.2));
        androidFlavors.add(new AndroidFlavor("Gingerbread",R.drawable.android5,2.3));
        androidFlavors.add(new AndroidFlavor("Honeycomb",R.drawable.android6,3.0));
        androidFlavors.add(new AndroidFlavor("Ice Cream Sandwitch",R.drawable.android7,4.0));
        androidFlavors.add(new AndroidFlavor("jelly Bean",R.drawable.android8,4.1));
        androidFlavors.add(new AndroidFlavor("Kitkat",R.drawable.android9,4.4));
        androidFlavors.add(new AndroidFlavor("Lollipop",R.drawable.android10,5.0));

        AndroidFlavorAdaptor flavorAdaptor = new AndroidFlavorAdaptor(this,androidFlavors);

        ListView listView = findViewById(R.id.ListView_flavor);
        listView.setAdapter(flavorAdaptor);
    }


    }




