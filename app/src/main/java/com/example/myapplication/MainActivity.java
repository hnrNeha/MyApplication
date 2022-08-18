package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListView listView2;
    ArrayAdapter<String> arrayAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String matter[]={"7,Michael lawson,michael.lawson@reqres.in" ,"8,Lindsay ferguson,lindsay.ferguson@reqres.in","9,Tobias funke,tobias.funke@reqres.in","10,Byron fields,byron.fields@reqres.in","11,George edwards,george.edwards@reqres.in","12,Rachel howell,rachel.howell@reqres.in"};
        int imgs[]={R.drawable.avt1,R.drawable.avt2,R.drawable.avt3,R.drawable.avt4,R.drawable.avt5,R.drawable.avt6};
        String idd[]={"7","8","9","10","11","12"};
        String fname[]={"Michael" ,"Lindsay","Tobias","Byron","George","Rachel"};
        String lname[]={"Lawson","Ferguson","Funke","Fields","Edwards","Howell"};
        String email[]={"michael.lawson@reqres.in","lindsay.ferguson@reqres.in","tobias.funke@reqres.in","byron.fields@reqres.in","george.edwards@reqres.in","rachel.howell@reqres.in"};
        listView=(ListView)findViewById(R.id.myapplication);
        custombaseadapter custombaseadapter=new custombaseadapter(getApplicationContext(),matter,imgs);
        listView.setAdapter(custombaseadapter);
        listView.setTextFilterEnabled(true);


    }

    @Override
    public  boolean  onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        MenuItem menuItem=menu.findItem(R.id.searchview);
        SearchView sv=(SearchView) MenuItemCompat.getActionView(menuItem);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);



                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


    }
