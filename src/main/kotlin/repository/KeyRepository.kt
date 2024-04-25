package org.example.repository

import org.example.entity.KeyEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface KeyRepository : CrudRepository<KeyEntity, Long>
