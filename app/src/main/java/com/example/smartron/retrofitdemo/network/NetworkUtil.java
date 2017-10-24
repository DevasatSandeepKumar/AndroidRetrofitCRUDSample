package com.example.smartron.retrofitdemo.network;

import com.example.smartron.retrofitdemo.utils.Constants;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by smartron on 11/10/17.
 */

public class NetworkUtil {


    public static RetrofitInterface getRetrofit() {
        RxJavaCallAdapterFactory rxJavaCallAdapterFactory =
                RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io());

        return new Retrofit.Builder()
                .baseUrl(Constants.TCloud.BASE_URL)
//                .addConverterFactory(StringConverterFactory.create())
                .addCallAdapterFactory(rxJavaCallAdapterFactory)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(RetrofitInterface.class);


    }
}
