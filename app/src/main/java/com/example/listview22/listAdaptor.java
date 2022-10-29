package com.example.listview22;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.PointKt;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class listAdaptor extends ArrayAdapter {

    private  ArrayList<Pocker>list;
    private String TAG = "listAdaptor";
    public listAdaptor(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.list = (ArrayList<Pocker>) objects;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.listview_main,parent,false);

        TextView t1 = view.findViewById(R.id.name);
        TextView t2 = view.findViewById(R.id.work);
        LinearLayout linearLayout = view.findViewById(R.id.name111);

        Pocker pocker = list.get(position);

        t1.setText(pocker.getName());
        t2.setText(pocker.getWork());

//        linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name = "이름: "+t1.getText()+" 직업:: "+t2.getText();
//                Toast toast = Toast.makeText(getContext(),name.toString(),Toast.LENGTH_SHORT);
//                toast.show();
//                Log.d(TAG, "onClick: "+t1.getText()+" "+t2.getText());
//            }
//        });

        return view;
    }
}
