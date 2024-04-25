package org.example.repository

import org.example.entity.LockEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LockRepository : CrudRepository<LockEntity, Long>
