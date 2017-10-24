package com.example.smartron.retrofitdemo.model;

import org.json.JSONObject;

/**
 * Created by smartron on 11/10/17.
 */

public class Response {
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    private String status;
    private Data data;

}
