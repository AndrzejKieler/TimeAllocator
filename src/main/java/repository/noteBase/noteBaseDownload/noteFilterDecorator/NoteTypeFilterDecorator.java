package repository.noteBase.noteBaseDownload.noteFilterDecorator;

import domain.notes.Note;

import java.util.LinkedList;
import java.util.Set;

public class NoteTypeFilterDecorator extends NoteFilterDecorator {
    private Note noteType;
    private Set<Note> noteSet;

    NoteTypeFilterDecorator(NoteFilter noteFilter, Note note) {
        super(noteFilter);
        this.noteType = note;
    }

    NoteTypeFilterDecorator(NoteFilter noteFilter, Set<Note> notes) {
        super(noteFilter);
        this.noteSet = notes;
    }
    public LinkedList<Note> getNotes(LinkedList<Note> notes) {
        LinkedList<Note> filteredNotes = new LinkedList<>();
        if(noteSet == null){
            for (Note note : notes) {
                if (note.getClass() == noteType.getClass()) filteredNotes.add(note);
            }
        }
        else {
            for (Note note : notes) {
                for(Note noteFromSet: noteSet) {
                    if (note.getClass() == noteFromSet.getClass()) filteredNotes.add(note);
                }
            }
        }

        return filteredNotes;
    }
}
