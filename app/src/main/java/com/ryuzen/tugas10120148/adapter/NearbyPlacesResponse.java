package com.ryuzen.tugas10120148.adapter;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 10121048-Ariyandi Julian Pratama-IF-4
 */

public class NearbyPlacesResponse {
    @SerializedName("results")
    private List<Place> results;

    public List<Place> getResults() {
        return results;
    }
}
