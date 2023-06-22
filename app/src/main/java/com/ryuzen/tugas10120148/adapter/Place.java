package com.ryuzen.tugas10120148.adapter;

import com.google.gson.annotations.SerializedName;

/**
 * 10121048-Ariyandi Julian Pratama-IF-4
 */

public class Place {
    @SerializedName("name")
    private String name;

    @SerializedName("geometry")
    private Geometry geometry;

    public String getName() {
        return name;
    }

    public Geometry getGeometry() {
        return geometry;
    }
}
