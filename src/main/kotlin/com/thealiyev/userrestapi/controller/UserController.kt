package com.thealiyev.userrestapi.controller

import com.thealiyev.userrestapi.service.UserService
import com.thealiyev.userrestapi.model.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
class UserController(private val userService: UserService) {
    @GetMapping
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): ResponseEntity<User> {
        val user = userService.getUserById(id)
        return if (user != null) {
            ResponseEntity(user, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @PostMapping
    fun createUser(@RequestBody user: User): ResponseEntity<User> {
        val createdUser = userService.createUser(user)
        return ResponseEntity(createdUser, HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: Long, @RequestBody user: User): ResponseEntity<User> {
        val updatedUser = userService.updateUser(id, user)
        return if (updatedUser != null) {
            ResponseEntity(updatedUser, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long): ResponseEntity<Void> {
        userService.deleteUser(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}