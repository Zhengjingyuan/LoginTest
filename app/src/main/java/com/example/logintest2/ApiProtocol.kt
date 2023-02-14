package com.example.logintest2

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiProtocol {
    @POST("http://192.168.3.148:8080/")
    @FormUrlEncoded
    fun submitLogin(@Field("userId") userId: String?, @Field("password") password: String?): Call<ResponseBody>
}