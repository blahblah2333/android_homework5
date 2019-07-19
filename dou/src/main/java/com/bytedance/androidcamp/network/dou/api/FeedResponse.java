package com.bytedance.androidcamp.network.dou.api;

import com.google.gson.annotations.SerializedName;
import com.bytedance.androidcamp.network.dou.model.Video;

import java.util.List;

public class FeedResponse {
    @SerializedName("feeds")
    List<Video> videos;

    @SerializedName("success")
    boolean success;

    public List<Video> getVideos() {
        return videos;
    }

    public boolean getSuccess() {
        return success;
    }
}
