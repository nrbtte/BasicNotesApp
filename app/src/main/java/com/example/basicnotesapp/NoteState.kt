package com.example.basicnotesapp

import com.example.basicnotesapp.database.Note

data class NoteState(
    val notes: List<Note> = emptyList(),
    val topic: String = "",
    val note: String = "",
    val isAddingNewNote: Boolean = false,
)
