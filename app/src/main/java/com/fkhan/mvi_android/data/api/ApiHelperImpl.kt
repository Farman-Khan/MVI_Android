package com.fkhan.mvi_android.data.api

import com.fkhan.mvi_android.data.model.User

class ApiHelperImpl(private val apiService: ApiService): ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}