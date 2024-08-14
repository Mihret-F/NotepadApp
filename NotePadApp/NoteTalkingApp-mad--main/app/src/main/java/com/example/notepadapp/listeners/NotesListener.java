package com.example.notepadapp.listeners;

import com.example.notepadapp.entities.Note;

public interface NotesListener {
    void onNoteCLicked(Note note, int position);

}
