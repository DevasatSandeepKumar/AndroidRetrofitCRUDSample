package com.example.smartron.retrofitdemo.utils;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by smartron on 11/10/17.
 */

public class Validation {

    public static boolean validateFields(String name){

        return !TextUtils.isEmpty(name);
    }

    public static boolean validateEmail(String string) {

        return !(TextUtils.isEmpty(string) || !Patterns.EMAIL_ADDRESS.matcher(string).matches());
    }
}
