package com.example.foodkart;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodkart.R;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private final String[] values;
    private View view;
    private LayoutInflater layoutInflater;
    RecyclerView.ViewHolder holder;

    public ListAdapter(Context context, String[] values) {
        this.context = context;
        this.values = values;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return values[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.single_item, null); // inflate the layout
        ImageView imageView = view.findViewById(R.id.imageView3);
        TextView textView = view.findViewById(R.id.textView8);
        textView.setText(values[position]); // set logo images
        return view;
//        if(convertView == null){
//            view = new View(context);
//            // set the view using the single item xml.
//            view = layoutInflater.inflate(R.layout.single_item, null);
//            ImageView imageView = view.findViewById(R.id.imageView3);
//            TextView textView = view.findViewById(R.id.textView8);
//            imageView.setImageResource(images[position]);
//            textView.setText(values[position]);
//            //textView.setCompoundDrawablesWithIntrinsicBounds(0, images[position], 0, 0);
//        } else {
//            ImageView imageView = view.findViewById(R.id.imageView3);
//            TextView textView = view.findViewById(R.id.textView8);
//            imageView.setImageResource(images[position]);
//            textView.setText(values[position]);
//        }
//        return view;
    }


}