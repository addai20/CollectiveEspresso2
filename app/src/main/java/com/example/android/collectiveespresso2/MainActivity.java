package com.example.android.collectiveespresso2;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] coffees = {"Americana", "Caffè Mocha", "Cappuccino", "Latte", "Flat White", "Espresso", "Iced Coffee"};
    String[] teas = {"Black Tea", "Green Tea", "Herbal Tea", "White Tea", "Oolong Tea"};
    String[] pastries = {"Apricot Turnover", "Blueberry Scone", "Blueberry Muffin", "Fudge Brownie"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/**
 * The following Array is a a list of the different types of coffee available
 */

        ListView coffee_list_view = (ListView) findViewById(R.id.coffee_list_view);
        ListAdapter coffeeListAdapter =  new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, coffees);
        coffee_list_view.setAdapter(coffeeListAdapter);



    }

}
