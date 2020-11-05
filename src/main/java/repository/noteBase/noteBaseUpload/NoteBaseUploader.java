package repository.noteBase.noteBaseUpload;

import domain.notes.Note;

import java.util.List;

public interface NoteBaseUploader {

    void uploadNote(Note notes);
    void uploadNotes(List<Note> notes);
}
