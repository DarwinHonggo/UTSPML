package com.darwin.utspml.service;

import com.darwin.utspml.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>>getUserList();
}
