package com.ryuzen.tugas10120148.adapter;

import com.google.gson.annotations.SerializedName;

/**
 * 10121048-Ariyandi Julian Pratama-IF-4
 */

public class Location {
    @SerializedName("lat")
    private double lat;

    @SerializedName("lng")
    private double lng;

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
