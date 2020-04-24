package com.mouhsinbourqaiba.android.bakingapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Ingredients implements Serializable {
    @SerializedName("Ingredients")
    @Expose
    private List<Ingredient> ingredients;
    private List<Ingredient> getIngredients(){ return ingredients; }

    private void setIngredients(List<Ingredient> ingredients){this.ingredients = ingredients; }

    public class Ingredient implements Serializable{
        @SerializedName("quantity")
        @Expose
        private int quantity;
        @SerializedName("measure")
        @Expose
        private String measure ;
        @SerializedName("ingredient")
        @Expose
        private String ingredient;

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getMeasure() {
            return measure;
        }

        public void setMeasure(String measure) {
            this.measure = measure;
        }

        public String getIngredient() {
            return ingredient;
        }

        public void setIngredient(String ingredient) {
            this.ingredient = ingredient;
        }
    }
}
