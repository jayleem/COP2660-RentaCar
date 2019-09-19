package com.jayleem.rentacar;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends ListActivity {

    static final String[] webUrls = {
            "https://acerentacar.com",
            "https://enterprise.com",
            "https://alamo.com",
            "https://nationalcar.com",
            "https://hertz.com",
            "https://budget.com",
    };

    static final String[] rentalCompany = {
            "ACE RENT A CAR",
            "Enterprise",
            "Alamo",
            "National Car Rental",
            "Hertz",
            "Budget"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Bind array to our ListView layout
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_home, R.id.list, rentalCompany));
    }

    //Event listener
    protected void onListItemClick(ListView lv, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webUrls[position])));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webUrls[position])));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webUrls[position])));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webUrls[position])));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webUrls[position])));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webUrls[position])));
                break;
            default:
                break;
        }
    }
}