package com.example.lenovo.coustomlistviewinpopup;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;


    ArrayList arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button clickButton = (Button) findViewById(R.id.clickButton);
        clickButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


             /*   final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.before_submit);
                dialog.setTitle("Title...");
                myNames= (ListView) dialog.findViewById(R.id.List);
                adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.answer_view,arrayList);
                myNames.setAdapter(adapter);
                dialog.show();*/


                Log.d("MYLOG", "MainActivity: " + "onClick: " + "setOnClickListener: ");


                dataModels = new ArrayList<>();
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.before_submit);
                dialog.setTitle("Title...");
                listView = (ListView) dialog.findViewById(R.id.List);
                dataModels.add(new DataModel("Apple Pie", "Android 1.0", "1", "September 23, 2008"));
                dataModels.add(new DataModel("Banana Bread", "Android 1.1", "2", "February 9, 2009"));
                dataModels.add(new DataModel("Cupcake", "Android 1.5", "3", "April 27, 2009"));
                dataModels.add(new DataModel("Donut", "Android 1.6", "4", "September 15, 2009"));
                dataModels.add(new DataModel("Eclair", "Android 2.0", "5", "October 26, 2009"));
                dataModels.add(new DataModel("Froyo", "Android 2.2", "8", "May 20, 2010"));
                dataModels.add(new DataModel("Gingerbread", "Android 2.3", "9", "December 6, 2010"));
                dataModels.add(new DataModel("Honeycomb", "Android 3.0", "11", "February 22, 2011"));
                dataModels.add(new DataModel("Ice Cream Sandwich", "Android 4.0", "14", "October 18, 2011"));
                dataModels.add(new DataModel("Jelly Bean", "Android 4.2", "16", "July 9, 2012"));
                dataModels.add(new DataModel("Kitkat", "Android 4.4", "19", "October 31, 2013"));
                dataModels.add(new DataModel("Lollipop", "Android 5.0", "21", "November 12, 2014"));
                dataModels.add(new DataModel("Marshmallow", "Android 6.0", "23", "October 5, 2015"));

                adapter = new CustomAdapter(dataModels, getApplicationContext());

                listView.setAdapter(adapter);
                Log.d("MYLOG", "MainActivity: " + "onClick1: " + "setOnClickListener1: ");

            }
        });


    }
}
