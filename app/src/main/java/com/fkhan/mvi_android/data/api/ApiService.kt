package com.fkhan.mvi_android.data.api

import com.fkhan.mvi_android.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET
    suspend fun getUsers(): List<User>
}