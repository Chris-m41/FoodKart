package com.example.foodkart;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class ItemDisplay extends AppCompatActivity {

    GridView gridView;
    GridLayout grid;
    SharedPreferences prefs;
    public List<Food_Item> shopping_list;
   //SharedPreferences preferences;
    //SharedPreferences sharedPreferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);


    // create an array of strings
    String[] values = {
            "Broccoli Crowns",
            "Cantaloupe",
            "Cauliflower",
            "Fresh Strawberries",
            "Fresh Seeded Red Grapes",
            "Green Seedless Grapes",
            "Hass Avacados", // 6
            "Iceberg Lettuce",
            "Organic Bananas",
            "Organic Fresh Blueberries",
            "Organic Green Cabbage",
            "Pineapple",
            "Sweet Potatoes, 3lb Bag",
            "Tomatoes on the Vine",
            "Yellow Onions",
            "Zucchini"
    };
    //Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(images[0]);
    // create an array of images
    int[] images = {
            R.drawable.broccoli_crowns,
            R.drawable.cantaloupe,
            R.drawable.cauliflower,
            R.drawable.fresh_strawberries,
            R.drawable.fress_seeded_red_grapes,
            R.drawable.green_seedless_grapes,
            R.drawable.hass_avacados,
            R.drawable.iceberg_lettuce,
            R.drawable.organic_bananas,
            R.drawable.organic_fresh_blueberries,
            R.drawable.organic_green_cabbage,
            R.drawable.pineapple,
            R.drawable.sweet_potatoes,
            R.drawable.tomatoes_on_the_vine,
            R.drawable.yellow_onions,
            R.drawable.zucchini
    };
//Button newButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //String result = sharedPreferences.getString("walmart", null);
        //Log.d("Shared Pref Results: ", result);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_display);
        prefs = getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE);
        String apiResult = prefs.getString("walmartProduce", "not set");
        Log.d("Shared Pref Results: ", apiResult);

        //initiate the gridView
        gridView = findViewById(R.id.grid);
        // initiate the gridView
        GridAdapter gridAdapter = new GridAdapter(this, values, images);
        gridView.setAdapter(gridAdapter);

        try {
            getJSONItems();
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


    void getJSONItems() throws JSONException {
        SharedPreferences.Editor editor = prefs.edit();
        String wMeat = prefs.getString("walmartMeat", " NO MEAT");
        String wProduce = prefs.getString("walmartProduce", " NO PRODUCE ");
        String wDairy = prefs.getString("walmartDairy", " NO DAIRY ");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je1 = jp.parse(wMeat);
        String prettyJsonStringMeat = gson.toJson(je1);

        JsonElement je2 = jp.parse(wProduce);
        String prettyJsonStringProduce = gson.toJson(je2);


        JsonElement je3 = jp.parse(wDairy);
        String prettyJsonStringDairy = gson.toJson(je3);

        System.out.println("MEAT" + prettyJsonStringMeat + "\n\n");
        System.out.println("PRODUCE" + prettyJsonStringProduce + "\n\n");
        System.out.println("DAIRY" + prettyJsonStringDairy + "\n\n");


        // Will locate msrp, upc and name and store it as a string.
        String walmartMeatMSRP = null;
        String walmartMeatUPC = null;
        String walmartMeatName = null;
        JSONArray jsonarray1 = new JSONArray(je1);
        for (int i = 0; i < jsonarray1.length(); i++) {
            JSONObject jsonobject = jsonarray1.getJSONObject(i);
             walmartMeatMSRP = jsonobject.getString("msrp");
             walmartMeatUPC = jsonobject.getString("upc");
             walmartMeatName = jsonobject.getString("name");
        }

        System.out.println("MEAT MSRP: " + walmartMeatMSRP);
        System.out.println("MEAT UPC: " + walmartMeatUPC);
        System.out.println("MEAT NAME: " + walmartMeatName);

        //
        String walmartProduceMSRP = null;
        String walmartProduceUPC = null;
        String walmartProduceName = null;
        JSONArray jsonarray2 = new JSONArray(je2);
        for (int i = 0; i < jsonarray2.length(); i++) {
            JSONObject jsonobject = jsonarray2.getJSONObject(i);
            walmartProduceMSRP = jsonobject.getString("msrp");
            walmartProduceUPC = jsonobject.getString("upc");
            walmartProduceName = jsonobject.getString("name");
        }

        System.out.println("PRODUCE MSRP: " + walmartProduceMSRP);
        System.out.println("PRODUCE UPC: " + walmartProduceUPC);
        System.out.println("PRODUCE UPC: " + walmartProduceName);

        String walmartDairyMSRP = null;
        String walmartDairyUPC = null;
        String walmartDairyName = null;
        JSONArray jsonarray3 = new JSONArray(je2);
        for (int i = 0; i < jsonarray3.length(); i++) {
            JSONObject jsonobject = jsonarray3.getJSONObject(i);
            walmartDairyMSRP = jsonobject.getString("msrp");
            walmartDairyUPC = jsonobject.getString("upc");
            walmartDairyName = jsonobject.getString("name");
        }

        System.out.println("DAIRY MSRP: " + walmartDairyMSRP);
        System.out.println("DAIRY UPC: " + walmartDairyUPC);
        System.out.println("DAIRY NAME: " + walmartDairyName);

    }

    public void addToList(View view) {
//        Food_Item food_item = new Food_Item(values[position], images[position]);
//        shopping_list.add(food_item);
        String toast = "Item added to list";
        Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();
        //shopping_list;
    }

}
