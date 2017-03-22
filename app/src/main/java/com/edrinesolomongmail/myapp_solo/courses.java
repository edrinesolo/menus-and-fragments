package com.edrinesolomongmail.myapp_solo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

import static com.edrinesolomongmail.myapp_solo.R.id.list;

public class courses extends Activity {
    String[] values = new String[]{"Android programming", "database programming", "software engineering",
            "research", "Dvs", "client server", "graphics"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

         ListView listview = (ListView) findViewById(list);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview,values);
        listview.setAdapter(adapter);
    }


}