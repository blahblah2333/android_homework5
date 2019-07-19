package com.bytedance.androidcamp.network.dou.api;

import com.google.gson.annotations.SerializedName;

public class PostVideoResponse {
    @SerializedName("url")
    private String url;

    @SerializedName("success")
    private boolean success;

//    @SerializedName("result")
//    private Result result;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "PostVideoResponse{" +
                "url = '" + url + '\'' +
                ", success = " + success +
                '}';
    }
}
