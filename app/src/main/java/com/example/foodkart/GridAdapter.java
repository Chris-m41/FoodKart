package com.example.foodkart;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private final String[] values;
    private final int[] images;
    public List<Food_Item> shopping_list;
    private View view;
    private LayoutInflater layoutInflater;
    RecyclerView.ViewHolder holder;

    public GridAdapter(Context context, String[] values, int[] images) {
        this.context = context;
        this.values = values;
        this.images = images;
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
        imageView.setImageResource(images[position]); // set item icons
        textView.setText(values[position]); // set text
        return view;
    }

//    public void addToList(View view, int position) {
//        Food_Item food_item = new Food_Item(values[position], images[position]);
//        shopping_list.add(food_item);
//        String toast = values[position] + "added to list";
//        //Toast.makeText( toast, Toast.LENGTH_SHORT).show();
//        //shopping_list;
//    }
}
