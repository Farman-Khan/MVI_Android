package com.fkhan.mvi_android.data.repository

import com.fkhan.mvi_android.data.api.ApiHelper
import com.fkhan.mvi_android.data.model.User

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers(): List<User> {
        return apiHelper.getUsers()
    }
}