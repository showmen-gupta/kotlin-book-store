package org.example.kotlinbookstore.repositories

import org.example.kotlinbookstore.models.user.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Long> {
}