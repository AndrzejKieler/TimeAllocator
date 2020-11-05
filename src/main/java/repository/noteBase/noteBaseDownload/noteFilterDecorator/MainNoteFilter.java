package repository.noteBase.noteBaseDownload.noteFilterDecorator;

import domain.notes.Note;

import java.util.LinkedList;

public class MainNoteFilter implements NoteFilter {
    LinkedList<Note> notes;
    public MainNoteFilter(LinkedList<Note> notes) {
        this.notes = notes;
    }
    @Override
    public LinkedList<Note> getNotes(LinkedList<Note> notes) {
        return notes;
    }
}
