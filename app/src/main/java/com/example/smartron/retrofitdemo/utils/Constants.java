package com.example.smartron.retrofitdemo.utils;

/**
 * Created by smartron on 11/10/17.
 */

public class Constants {

    public class TCloud {
        public static final String BASE_URL = "https://tcloud2.smartron.com";
        public static final String LOGIN_URL = "/api/auth/login";
        public static final String REGISTER_URL = "/api/auth/register";
        public static final String FORGOT_PASSWORD_API = "/api/auth/forgotpassword";
        public static final String CHANGE_PASSWORD_API =  "/api/auth/resetpassword";
    }

    public class Params {
        public static final String EMAIL = "email";
        public static final String PASSWORD = "password";
        public static final String REALM = "realm";
        public static final String SERIAL_NO = "serialNumber";
        public static final String SMARTRON = "Smartron";
        public static final String FIRSTNAME = "firstName";
        public static final String LASTNAME = "lastName";
        public static final String OLDPASSWORD = "oldPassword";
        public static final String NEWPASSWORD = "newPassword";
    }

    public class Headers {
        public static final String CONTENT_TYPE = "Content-Type";
        public static final String X_DEVICEID = "X-DeviceId";
        public static final String APPLICATION_JSON = "application/json";
        public static final String NOSERIALNUMBER = "NOSERIALNUMBER";
        public static final String DUMMY_SERIAL_NO = "T5511BJ31671401367";
        public static final String X_AUTHORISATION = "X-Authorization";
        public static final String HEADERS = "headers";
        public static final String DATA = "data";

    }
}
