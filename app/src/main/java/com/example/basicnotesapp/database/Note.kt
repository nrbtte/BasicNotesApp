package com.example.basicnotesapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = 0,
    val summary: String,
    val note: String,
)
