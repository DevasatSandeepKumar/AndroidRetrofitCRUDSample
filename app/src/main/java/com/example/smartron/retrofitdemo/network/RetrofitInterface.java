package com.example.smartron.retrofitdemo.network;

import com.example.smartron.retrofitdemo.model.Response;
import com.example.smartron.retrofitdemo.model.User;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by smartron on 11/10/17.
 */

public interface RetrofitInterface {
//    @POST("users")
//    Observable<Response> register(User user);

    @Headers({"Content-Type: application/json","X-DeviceId: T5511BJ31671401367"})
    @POST("/api/auth/register")
    Observable<Response> register(@Body User user);
}
