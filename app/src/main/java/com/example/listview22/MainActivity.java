package com.example.listview22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
    ArrayList<Pocker> pocker;
    Pocker p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();

        listInit();
        ListView listView = (ListView)findViewById(R.id.main_list);

        listAdaptor ap = new listAdaptor(this, R.layout.activity_main,pocker);

        listView.setAdapter(ap);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick: "+i);
                String nameAndWork = "이름:: "+pocker.get(i).getName()+" 배우:: "+pocker.get(i).getWork();
               Toast.makeText(MainActivity.this, nameAndWork, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void listInit(){
        pocker = new ArrayList<Pocker>();

        pocker.add(new Pocker("한효주","배우"));
        pocker.add(new Pocker("강동호","배우"));
        pocker.add(new Pocker("송강호","배우"));
        pocker.add(new Pocker("최지민","배우"));
        pocker.add(new Pocker("강수진","배우"));
        pocker.add(new Pocker("송혜교","배우"));

    }

}