package org.example.kotlinbookstore.services

import org.example.kotlinbookstore.models.user.User
import org.example.kotlinbookstore.repositories.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun getAllUsers(): List<User> =
        userRepository.findAll().toList()

    fun createUser(user: User): User {
        val createdUser = userRepository.save(user)
        return createdUser
    }

    fun getUserById(userId: Int): User? {
        val user = userRepository.findById(userId.toLong()).orElse(null)
        return user
    }

    fun updateUserById(userId: Int, user: User): ResponseEntity<User> {
        val existingUser = userRepository.findById(userId.toLong()).orElse(null)
            ?: return ResponseEntity(HttpStatus.NOT_FOUND)

        val updatedUser = existingUser.copy(
            firstName = user.firstName,
            lastName = user.lastName,
            email = user.email,
            address = user.address,
            phone = user.phone,
            createdAt = user.createdAt,
            updatedAt = user.updatedAt
        )
        userRepository.save(updatedUser)
        return ResponseEntity(updatedUser, HttpStatus.OK)
    }

    fun deleteUserById(userId: Int): ResponseEntity<User> {
        if (!userRepository.existsById(userId.toLong())) {
            return ResponseEntity(HttpStatus.NOT_FOUND)
        }
        userRepository.deleteById(userId.toLong())
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}