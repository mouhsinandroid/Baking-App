package com.mouhsinbourqaiba.android.bakingapp.api;

import com.mouhsinbourqaiba.android.bakingapp.model.Recipes;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecipesApi {

    @GET
    Call<Recipes> getRecipes();
}
