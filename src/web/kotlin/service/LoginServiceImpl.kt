package com.ikemurami.service

import org.springframework.stereotype.Service
import com.ikemurami.service.repository.UserRepository
import com.ikemurami.service.interfaces.LoginService
import ike.murami.shared.HelloWorld

@Service
class LoginServiceImpl(
    private val userRepository: UserRepository
) : LoginService {

    override fun login(username: String, password: String): String {
        val response = HelloWorld().hello()

        return response
        TODO("not implemented")
    }

    override fun logout() {
        TODO("not implemented")
    }
}