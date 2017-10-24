package com.example.smartron.retrofitdemo.ui;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smartron.retrofitdemo.R;
import com.example.smartron.retrofitdemo.model.Response;
import com.example.smartron.retrofitdemo.model.User;
import com.example.smartron.retrofitdemo.network.NetworkUtil;
import com.example.smartron.retrofitdemo.parent.BaseActivity;
import com.example.smartron.retrofitdemo.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.adapter.rxjava.HttpException;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

import static com.example.smartron.retrofitdemo.utils.Validation.validateEmail;
import static com.example.smartron.retrofitdemo.utils.Validation.validateFields;

public class RegistrationActivity extends BaseActivity {

    @BindView(R.id.et_first_name)
    EditText etFirstname;

    @BindView(R.id.et_login_last_name)
    EditText etLastName;

    @BindView(R.id.et_emial_id)
    EditText etEmailId;

    @BindView(R.id.et_password)
    EditText etPassword;

    @BindView(R.id.et_comfirm_password)
    EditText etConfirmpassword;

    @BindView(R.id.bt_login)
    Button mBtLogin;

    private String mToken;
    private String mEmail;

    CompositeSubscription compositeSubscription;

    SharedPreferences mSharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        compositeSubscription=new CompositeSubscription();
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        etEmailId.setText("nithin.nan@gmail.com");
    }

    @OnClick(R.id.bt_login)
    public void registerandloginUser(){
        register();
    }

    private void register() {

//        setError();

        etPassword.setText(etEmailId.getText().toString());
        String name = etFirstname.getText().toString();
        String lastName = etLastName.getText().toString();
        String emailID = etEmailId.getText().toString();
        String password= etPassword.getText().toString();
        String confirmpassword =etConfirmpassword.getText().toString();

        int err = 0;

        /*if (!validateFields(name)) {

            err++;
            etFirstname.setError("Name should not be empty !");
        }

        if (!validateFields(lastName)) {

            err++;
            etLastName.setError("Name should not be empty !");
        }


        if (!validateFields(password)) {

            err++;
            etPassword.setError("password should not be empty !");
        }


        if (!validateFields(confirmpassword)) {

            err++;
            etConfirmpassword.setError("password should not be empty !");
        }

        if (!validateFields(emailID)) {

            err++;
            etEmailId.setError("Email should not be empty !");
        }*/

//        if (err == 0) {

            User user = new User(emailID,emailID);
//            user.setName(name);
//            user.setEmail(emailID);
//            user.setPassword(password);

           showProgressDialog();
            registerUser(user);

//        } else {
//
//            Toast.makeText(this, "Enter Valid Details!", Toast.LENGTH_SHORT).show();
//        }
    }

    private void setError() {

        etFirstname.setError(null);
        etLastName.setError(null);
        etPassword.setError(null);
        etEmailId.setError(null);
        etConfirmpassword.setError(null);
    }

    private void registerUser(User user) {

        compositeSubscription.add(NetworkUtil.getRetrofit().register(user)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse,this::handleError));

    }

    private void handleResponse(Response response) {

        showProgressDialog();
    }


    private void handleError(Throwable error) {

       hideProgressDialog();

        if (error instanceof HttpException) {

            Gson gson = new GsonBuilder().create();

            try {

                String errorBody = ((HttpException) error).response().errorBody().string();
                Response response = gson.fromJson(errorBody,Response.class);
                Toast.makeText(this,""+response.getStatus(),Toast.LENGTH_SHORT).show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Toast.makeText(this, "Network Error!", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        compositeSubscription.unsubscribe();
    }
}
