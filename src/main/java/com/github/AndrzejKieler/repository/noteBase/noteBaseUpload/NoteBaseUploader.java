package com.github.AndrzejKieler.repository.noteBase.noteBaseUpload;

import com.github.AndrzejKieler.domain.notes.Note;

import java.util.List;

public interface NoteBaseUploader {

    void uploadNote(Note notes);
    void uploadNotes(List<Note> notes);
}
