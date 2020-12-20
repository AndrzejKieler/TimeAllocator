package com.github.AndrzejKieler.repository.noteBase.noteBaseDownload;
import com.github.AndrzejKieler.repository.noteBase.noteBaseDownload.noteFilterDecorator.NoteFilter;
import com.github.AndrzejKieler.domain.notes.Note;
import java.util.ArrayList;

public interface NoteBaseDownloader {
    ArrayList<Note> getNotesFromFilter(NoteFilter filter);
    ArrayList<Note> getWholeNotes();
    Note getNoteById(long id);
}
