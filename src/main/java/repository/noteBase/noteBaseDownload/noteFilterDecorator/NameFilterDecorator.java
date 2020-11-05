package repository.noteBase.noteBaseDownload.noteFilterDecorator;

import domain.notes.Note;

import java.util.LinkedList;

public class NameFilterDecorator extends NoteFilterDecorator{
    String name;

    NameFilterDecorator(NoteFilter noteFilter, String name) {
        super(noteFilter);
        this.name = name;
    }

    @Override
    public LinkedList<Note> getNotes(LinkedList<Note> notes) {
        LinkedList<Note> filteredNotes = super.getNotes(notes);

        for (Note note : notes) {
            if(note.getName().contains(name)) filteredNotes.add(note);
        }

        return super.getNotes(notes);
    }
}
