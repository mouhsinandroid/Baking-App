package com.mouhsinbourqaiba.android.bakingapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Recipes implements Serializable {
    @SerializedName("")
    @Expose
    private List<Recipe> recipes = null ;
    private List<Recipe> getRecipes(){ return  recipes; }
    private void setRecipes(List<Recipe> recipes){ this.recipes = recipes ;}

    public class Recipe implements Serializable{

        @SerializedName("id")
        @Expose
        private int id;

        @SerializedName("name")
        @Expose
        private String name;

        @SerializedName("ingredients")
        @Expose
        private Ingredients ingredients;

        @SerializedName("steps")
        @Expose
        private Steps steps;

        @SerializedName("servings")
        @Expose
        private String servings;

        @SerializedName("image")
        @Expose
        private String image;

    }
}
