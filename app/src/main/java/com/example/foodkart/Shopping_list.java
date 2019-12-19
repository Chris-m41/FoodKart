package com.example.foodkart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Shopping_list extends AppCompatActivity {
    ListView listView;
    String[] values = {
            "Broccoli Crowns: $1.88/lb",
            "Cantaloupe: $2.88/each",
            "Cauliflower: $2.97/each",
            "Fresh Strawberries: $4.24",
            "Fresh Seeded Red Grapes: $2.88/lb",
            "Green Seedless Grapes: $2.48/lb",
            "Hass Avacados: $1.18/each",
            "Iceberg Lettuce: $1.48/each",
            "Organic Fresh Blueberries: $3.86",
            "Organic Green Cabbage: $1.92",
            "Pineapple: $2.48/each",
            "Sweet Potatoes, 3lb Bag: $3.44",
            "Tomatoes on the Vine: $1.68/lb",
            "Yellow Onions: $0.54",
            "Zucchini: $0.70"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_list);

        //initiate the gridView
        listView = findViewById(R.id.list);
        // initiate the gridView
        ListAdapter listAdapter = new ListAdapter(this, values);
        listView.setAdapter(listAdapter);
    }
}