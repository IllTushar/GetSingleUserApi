package com.example.listpro.Api;

import com.example.listpro.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices
{
@GET("users/2")
Call<ResponseModel>getDate();
}
