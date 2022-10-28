package com.example.listview22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayListInit();
        ListView listView = findViewById(R.id.main_list);

        listAdaptor ap = new listAdaptor(this, R.layout.listview_main,list);

        listView.setAdapter(ap);


    }

    private void ArrayListInit(){
        list = new ArrayList();
        list.add(new Pocker("학교","테스트","몰라"));
        list.add(new Pocker("학교","테스트","몰라"));
        list.add(new Pocker("학교","테스트","몰라"));
        list.add(new Pocker("학교","테스트","몰라"));
        list.add(new Pocker("학교","테스트","몰라"));
        list.add(new Pocker("학교","테스트","몰라"));
        list.add(new Pocker("학교","테스트","몰라"));
        list.add(new Pocker("학교","테스트","몰라"));
        list.add(new Pocker("학교","테스트","몰라"));





    }

}