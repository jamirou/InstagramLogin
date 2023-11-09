package com.jamirodev.instagramlogin.login.data

import com.jamirodev.instagramlogin.login.data.network.LoginService

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user: String, password: String): Boolean {
        return api.doLogin(user, password)
    }
}