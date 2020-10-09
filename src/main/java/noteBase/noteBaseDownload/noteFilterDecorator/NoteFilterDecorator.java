package noteBase.noteBaseDownload.noteFilterDecorator;

import notes.Note;

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