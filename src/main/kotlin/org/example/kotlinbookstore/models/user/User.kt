package org.example.kotlinbookstore.models.user

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "app_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "firstname", nullable = false)
    val firstName: String,
    @Column(name = "lastname", nullable = false)
    val lastName: String,
    @Column(name = "email", nullable = false)
    val email: String,
    @Column(name = "address", nullable = false)
    val address: String,
    @Column(name = "phone", nullable = false)
    val phone: String,
    @Column(name = "national_identity", nullable = false)
    val nationalIdentity: Int,
    @Column(name = "created_at", nullable = true)
    val createdAt: LocalDateTime = LocalDateTime.now(),
    @Column(name = "updated_at", nullable = true)
    val updatedAt: LocalDateTime = LocalDateTime.now()
)