package repository.noteBase.noteBaseDownload.noteFilterDecorator;

import domain.notes.Note;

import java.util.LinkedList;


public interface NoteFilter {
    LinkedList<Note> getNotes(LinkedList<Note> notes);
}
