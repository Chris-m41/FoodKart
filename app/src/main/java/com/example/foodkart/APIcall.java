package com.example.foodkart;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that is able to access the Wal-mart API and grab api key from file
 */
class APIcall {

    private static final String API_KEY_FILE = "ApiGoesHere";

    private String apiKey;
    private String apiCharset;

    /**
     * Uses hardcoded strings to make calls to Wal-mart api and uses Gson to serialize the json
     * response into an array of Wal-mart data items.
     */
    public String getApiData(String category, int count) {

        apiCharset = StandardCharsets.UTF_8.name();
        apiKey = API_KEY_FILE;


//        try {
//
//            //apiKey = loadApiFile();
//
//        } catch (IOException e) {
//            Log.e("Load API Key File", "Could not read API Key from file");
//            e.printStackTrace();
//        }
        String searchUrl = "http://api.walmartlabs.com/v1/search?apiKey="+ apiKey +"&query=butter";
        String ApiUrl = "http://api.walmartlabs.com/v1/items/12417832?apiKey="+ apiKey +"&format=json";
        String paginationUrl = "http://api.walmartlabs.com/v1/paginated/items?category="+ category +"&apiKey="+ apiKey +"&format=json&count="+count;
        String taxonomyUrl = "http://api.walmartlabs.com/v1/taxonomy?apiKey=" + apiKey + "&format=json";
        String returnData = "";
        try {
            returnData = CallAPI(paginationUrl);
        } catch (IOException e) {
            //Log.e("Return Data","Failed to Retrieve data from Walmart API");
            e.printStackTrace();
        }

        return returnData;
    }

    @TargetApi(Build.VERSION_CODES.O)
    private String loadApiFile() throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(API_KEY_FILE));
        return new String(encoded, Charset.defaultCharset());
    }

    public String CallAPI(String url) throws IOException {
        // Make a connection to the provided URL
        URLConnection connection = new URL(url).openConnection();

        // Open the response stream and get a reader for it.
        try(InputStream responseStream = connection.getInputStream()) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(responseStream));

            // Because this could happen multiple times, a StringBuilder is much more efficient.
            StringBuilder stringBuilder = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }

            return stringBuilder.toString();
        }

    }

    public void parseWalmartJson(String data) {
        Gson gson = new Gson();
        WalmartItemArray Items = gson.fromJson(data, WalmartItemArray.class);
        int i = 0;
        for (WalmartDataItem Item : Items.getWalmartItems()) {
//            if (Item.getStock().equals("Not available")){
//                continue;
//            }
//            else {
            double price = Item.getSalePrice();
            if(price == 0.0) {
                price = Item.getMsrp();
            }if (price == 0.0){
                continue;
            }

            System.out.println(i + " " + Item.getName() + " $" + price +
                    " UPC Code is: "
                    + Item.getUpc());
            i = i + 1;
            // }

        }



    }

}
