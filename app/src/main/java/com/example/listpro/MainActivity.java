package com.example.listpro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.listpro.Api.ApiServices;
import com.example.listpro.Api.RetrofitClient;
import com.example.listpro.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.setText("");
        ApiServices api = new  RetrofitClient().getRetrofit().create(ApiServices.class);
        Call<ResponseModel>call = api.getDate();
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                ResponseModel responseModel = response.body();
                ResponseModel.Data responseDate = responseModel.data;
                ResponseModel.Support responseSupport = responseModel.support;
                if (response.isSuccessful()){
                   textView.append("id:"+responseDate.getId()+"\nEmail: "+responseDate.getEmail()
                   +"\nFirstName: "+responseDate.getFirst_name()
                   +"\nLastName: "+responseDate.getLast_name()
                   +"\navatar: "+responseDate.getAvatar()+"\n\n\n"
                   +"url: "+responseSupport.getUrl()
                   +"\ntext: "+responseSupport.getText());
                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });
    }
}