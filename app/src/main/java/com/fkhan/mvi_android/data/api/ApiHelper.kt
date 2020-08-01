package com.fkhan.mvi_android.data.api

import com.fkhan.mvi_android.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>
}