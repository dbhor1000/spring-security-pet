package org.example.repository

import org.example.entity.KeyEntity
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface KeyRepository : CrudRepository<KeyEntity, Long>