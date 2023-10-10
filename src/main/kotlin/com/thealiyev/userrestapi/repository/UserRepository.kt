package com.thealiyev.userrestapi.repository

import com.thealiyev.userrestapi.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {

}