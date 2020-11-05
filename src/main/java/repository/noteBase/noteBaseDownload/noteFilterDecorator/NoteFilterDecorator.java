package repository.noteBase.noteBaseDownload.noteFilterDecorator;

import domain.notes.Note;

import java.util.LinkedList;

public class NoteFilterDecorator implements NoteFilter {
    NoteFilter noteFilter;

    NoteFilterDecorator(NoteFilter noteFilter) {
        this.noteFilter = noteFilter;
    }

    @Override
    public LinkedList<Note> getNotes(LinkedList<Note> notes) {
        return noteFilter.getNotes(notes);
    }
}