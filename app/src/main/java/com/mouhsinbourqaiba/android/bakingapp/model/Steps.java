package com.mouhsinbourqaiba.android.bakingapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Steps implements Serializable {

    @SerializedName("Steps")
    @Expose
    private List<Step> steps;

    private List<Step> getSteps(){
        return steps;
    }

    private void setSteps(List<Step> steps){
        this.steps = steps;
    }

    public class Step implements Serializable{
        @SerializedName("id")
        @Expose
        private int id;

        @SerializedName("shortDescription")
        @Expose
        private String shortDescription;

        @SerializedName("description")
        @Expose
        private String description;

        @SerializedName("videoURL")
        @Expose
        private String videoURL;

        @SerializedName("thumbnailURL")
        @Expose
        private String thumbnailURL;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getVideoURL() {
            return videoURL;
        }

        public void setVideoURL(String videoURL) {
            this.videoURL = videoURL;
        }

        public String getThumbnailURL() {
            return thumbnailURL;
        }

        public void setThumbnailURL(String thumbnailURL) {
            this.thumbnailURL = thumbnailURL;
        }
    }
}
