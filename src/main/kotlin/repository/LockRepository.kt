package org.example.repository

import org.example.entity.LockEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LockRepository : JpaRepository<LockEntity, Long>