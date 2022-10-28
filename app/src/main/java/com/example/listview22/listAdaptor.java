package com.example.listview22;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.PointKt;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class listAdaptor extends ArrayAdapter {
    public static String TAG = "listAdaptor";

    ArrayList<Pocker> list ;
    public listAdaptor(@NonNull Context context, int resource,ArrayList<Pocker> pp) {
        super(context, resource);
        list =pp;
    }


    @Override
    public int getCount() {
        Log.d(TAG, "getCount: "+list.size());
        return list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Log.d(TAG, "getView: ");

        View view = LayoutInflater.from(getContext()).inflate(R.layout.listview_main,parent,false);

        Pocker po = (Pocker)list.get(position);
        TextView t1 = view.findViewById(R.id.t1);
        TextView t2 = view.findViewById(R.id.t2);
        TextView t3 = view.findViewById(R.id.t3);

        t1.setText(po.getImage());
        t2.setText(po.getName());
        t3.setText(po.getWork());

        return view;
    }
}
