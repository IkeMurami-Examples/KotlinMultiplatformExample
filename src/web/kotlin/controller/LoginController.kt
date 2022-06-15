package com.ikemurami.service.controller

import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

import com.ikemurami.service.interfaces.LoginService


@RequestMapping("/some")
@Tag(name = "User", description = "My description")
@ConditionalOnProperty(prefix = "ikemurami.security", value = arrayOf("allow-login"), havingValue = "true")
class LoginController(
    private val loginService: LoginService
) {

    @PostMapping("/signin")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "400", description = "Smt wrong"),
            ApiResponse(responseCode = "422", description = "Wrong user/pass")
        ])
        fun login(
        @Parameter(name = "Username") @RequestParam username: String,
        @Parameter(name = "Password") @RequestParam password: String
        ): String {
            return loginService!!.login(username, password)
        }

}