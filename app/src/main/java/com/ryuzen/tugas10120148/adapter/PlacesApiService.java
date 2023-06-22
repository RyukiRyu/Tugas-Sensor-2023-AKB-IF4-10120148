package com.ryuzen.tugas10120148.adapter;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * 10121048-Ariyandi Julian Pratama-IF-4
 */

public interface PlacesApiService {
    @GET
    Call<NearbyPlacesResponse> getNearbyPlaces(@Url String url);
}
