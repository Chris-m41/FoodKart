package com.example.foodkart;


import android.content.Context;
import android.content.SharedPreferences;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApiDataRetrievalTest {

    @Test
    public void gettingSomeDateFromApi(){
       APIcall testCall = new APIcall();
       String ApiData = testCall.getApiData();
       testCall.parseWalmartJson(ApiData);

      // System.out.println(ApiData);
    }
/* Commented out test because I need to figure out how to
   mock Shared Preferences
 */
//    @Test
//    public void saveRetrieveToSharedPref() {
//        Context context;
//        APIcall testCall = new APIcall();
//        String ApiData = testCall.APIcall();
//        SharedPreferences prefs = context.getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = prefs.edit();
//        editor.putString("walmart", ApiData);
//        editor.apply();
//    }
}
