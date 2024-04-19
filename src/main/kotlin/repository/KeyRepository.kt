package org.example.repository

import org.example.entity.KeyEntity
import org.springframework.data.jpa.repository.JpaRepository

interface KeyRepository : JpaRepository<KeyEntity, Long>