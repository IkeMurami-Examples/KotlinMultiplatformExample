package com.ikemurami.service.domain

import com.ikemurami.service.MyService.domain.BaseEntity
import org.springframework.security.core.userdetails.UserDetails
import com.ikemurami.service.domain.dto.UserDto
import org.springframework.security.core.GrantedAuthority
import java.util.*
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.OneToMany
import javax.persistence.Table




@Entity
@Table(name = "user", schema = "auth")
class User : BaseEntity() {
    @Column(name = "user_name")
    private lateinit var username: String

    fun getUsername(): String {
        return username
    }

    fun setUsername(username: String) {
        this.username = username
    }
}

fun User.toDto(): UserDto {
    return UserDto(
        UUID.randomUUID(),
        getUsername()
    )
}
