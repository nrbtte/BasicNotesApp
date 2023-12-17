package com.example.basicnotesapp.database

sealed interface NoteEvent {
    object SaveNewNote: NoteEvent
    data class SetTopic(val topic: String): NoteEvent
    data class SetNote(val note: String): NoteEvent
    object  ShowDialog: NoteEvent
    object  HideDialog: NoteEvent
    data class DeleteNote(val note: Note): NoteEvent
}