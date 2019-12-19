package com.example.foodkart;

import android.util.Log;

import java.util.Map;

public class WalmartDataItem {
    private String name;
    private double itemId;
    private double salePrice;
    private double msrp;
    private String upc;
    private String thumbnailImage;
    private String stock;
    //private Map<String, String> items;



    public WalmartDataItem() {
        name = "default";
        salePrice = 0;
        msrp = 0;
        itemId = 0;
        thumbnailImage = "null";
        upc = "null";
        stock = "null";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getItemId() {
        return itemId;
    }

    public void setItemId(double itemId) {
        this.itemId = itemId;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getMsrp() {
        return msrp;
    }

    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
//    public Map<String, String> getItems() {
//        return items;
//    }
//
//    public void setItems(Map<String, String> items) {
//        this.items = items;
//    }
//    public String onClickJson(){
//        Log.d("item_click", "The button has been clicked");
//       String json = "{name: '" + name + "', upcCode: '" + upcCode + "'}";
//       return json;
//    }
}
// Need to be able to create an Item for each result returned and then be able ot iterate
// through them you display each item. Look at the weather data app to see an example.