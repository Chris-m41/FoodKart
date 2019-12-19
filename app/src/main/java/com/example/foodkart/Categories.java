package com.example.foodkart;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Categories extends AppCompatActivity {
    SharedPreferences preferences;
    private String data;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
        preferences = getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE);
        ApiAsyncTask apiAsync = new ApiAsyncTask(preferences);
        apiAsync.execute();
        //saveApiToSharedPrefs();


    }

    public void continueToMeat(View view) {

        Intent intent = new Intent(this, ItemDisplay.class);
        startActivity(intent);

    }

    public void continueToDairy(View view) {
        Intent intent = new Intent(this, ItemDisplay.class);
        startActivity(intent);

    }

    public void continueToProduce(View view) {
        Intent intent = new Intent(this, ItemDisplay.class);
        startActivity(intent);

    }

    public void goToCheckout(View view) {
        Intent intent = new Intent(this, Shopping_list.class);
        startActivity(intent);
    }

    /**
     * Places a call to the API. Places the API response json string into
     * shared preferences.
     */
    public void saveApiToSharedPrefs() {
        APIcall dairyData = new APIcall();
      // String ApiData = dairyData.getApiData();
//        String ApiData = "test string";
        // Initilizes Shared Preferences
        //SharedPreferences prefs = getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = prefs.edit();

        // Saves data to with key --> walmart
//        editor.putString("walmart", ApiData);
//        editor.apply();

        // This code is to test if the data was saved in Shared Pref
       // String result = prefs.getString("walmart", null);
        //Log.d("Shared Pref Results: ", result);
    }



}