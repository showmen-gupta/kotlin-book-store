package org.example.kotlinbookstore.users

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "app_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val firsName: String,
    val lastName: String,
    val email: String,
    val address: String,
    val phone: String,
    val nationalIdentity: Number,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)