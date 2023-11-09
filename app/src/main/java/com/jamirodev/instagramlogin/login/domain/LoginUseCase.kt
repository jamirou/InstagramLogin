package com.jamirodev.instagramlogin.login.domain

import com.jamirodev.instagramlogin.login.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String):Boolean{
        return repository.doLogin(user, password)
    }
}