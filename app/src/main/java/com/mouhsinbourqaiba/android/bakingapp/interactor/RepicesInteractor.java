package com.mouhsinbourqaiba.android.bakingapp.interactor;

import com.mouhsinbourqaiba.android.bakingapp.api.RecipesApi;
import com.mouhsinbourqaiba.android.bakingapp.api.RecipesClient;

public class RepicesInteractor {

    public static RecipesApi getListRecipes() {
        return RecipesClient.getRecipesClient().create(RecipesApi.class);
    }

}
