package com.example.countryinfo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CountryApiService {
    @GET("countries/info/all.json")
    Call<CountryResponse> getCountries();
}

