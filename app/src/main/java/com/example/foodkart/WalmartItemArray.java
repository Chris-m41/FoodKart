package com.example.foodkart;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WalmartItemArray {

    @SerializedName("items")
    private List<WalmartDataItem> WalmartItems;

    public List<WalmartDataItem> getWalmartItems() {
        return WalmartItems;
    }

    public void setWalmartItems(List<WalmartDataItem> walmartItems) {
        WalmartItems = walmartItems;
    }
}
