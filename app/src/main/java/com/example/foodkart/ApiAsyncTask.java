package com.example.foodkart;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;

import static android.content.Context.MODE_PRIVATE;

public class ApiAsyncTask extends AsyncTask<String, Void, String> {
    private SharedPreferences prefs;
    String meatCategory = "976759_1071964_976796";
    int meatCount = 24;
    String produceCategory = "976759_1071964_976793";
    int produceCount = 45;
    String dairyCategory = "976759_1071964_976788";
    int dairyCount = 10;
    private APIcall meatCall = new APIcall();
    private APIcall produceCall = new APIcall();
    private APIcall dairyCall = new APIcall();
    private String meatData;
    private String produceData;
    private String dairyData;

public ApiAsyncTask(SharedPreferences sharedPreferences){
    this.prefs = sharedPreferences;
}

    /**
     * This function is called onCreate() of the Categories page.
     * Makes separate calls to Walmart api for each category.
     * Note: each api call returns json string
     * String param is so it can return a String
     * return value became a less valuable when function was extended
     * @param strings
     * @return
     */
    @Override
    protected String doInBackground(String... strings) {
        meatData = meatCall.getApiData(meatCategory, meatCount);
        produceData = produceCall.getApiData(produceCategory, produceCount);
        dairyData = dairyCall.getApiData(dairyCategory, dairyCount);
        Log.d("ApiData = ", produceData);
        String temp = "Bad Data";

        // may not be necessary but didn't want to delete it and break things
        return temp;
    }

    /**
     * Places each json string result into Shared Preferences
     * @param result
     */
    @Override
    protected void onPostExecute(String result) {
        //"PREFERENCES", Context.MODE_PRIVATE
        Editor editor = prefs.edit();
        editor.putString("walmartMeat", meatData);
        editor.putString("walmartProduce", produceData);
        editor.putString("walmartDairy", dairyData);
        editor.apply();

        // this code block checks to see if data was saved in Shared Preferences correctly
        // can be commented in at convenience 
//        String meatResult = prefs.getString("walmartMeat", "not set");
//        String produceResult = prefs.getString("walmartProduce", "not set");
//        String dairyResult = prefs.getString("walmartDairy", "not set");
//        Log.d("AsyncTask Meat: ", meatResult);
//        Log.d("AsyncTask Produce: ", produceResult);
//        Log.d("AsyncTask Dairy: ", dairyResult);

        // Not sure if I need this line, but things aren't breaking with it so I left it
        super.onPostExecute(result);

    }



}

