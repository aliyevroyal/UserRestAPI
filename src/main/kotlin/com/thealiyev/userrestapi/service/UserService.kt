package com.thealiyev.userrestapi.service

import com.thealiyev.userrestapi.model.User

interface UserService {
    fun getAllUsers(): List<User>
    fun getUserById(id: Long): User?
    fun createUser(user: User): User
    fun updateUser(id: Long, user: User): User?
    fun deleteUser(id: Long)
}