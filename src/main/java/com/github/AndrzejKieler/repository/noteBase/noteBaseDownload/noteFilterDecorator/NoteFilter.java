package com.github.AndrzejKieler.repository.noteBase.noteBaseDownload.noteFilterDecorator;

import com.github.AndrzejKieler.domain.notes.Note;

import java.util.LinkedList;


public interface NoteFilter {
    LinkedList<Note> getNotes(LinkedList<Note> notes);
}
