package com.github.AndrzejKieler.repository.noteBase.noteBaseDownload.noteFilterDecorator;

import com.github.AndrzejKieler.domain.notes.Note;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class EnumFilterDecorator<E extends Enum<E>> extends NoteFilterDecorator {
    private E e;
    private Set<E> enumSet = new HashSet<>();



    EnumFilterDecorator(NoteFilter noteFilter, Set<E> enumSet) {
        super(noteFilter);
        this.enumSet = enumSet;
    }

    EnumFilterDecorator(NoteFilter noteFilter, E e) {
        super(noteFilter);
        this.e = e;
    }
    @Override
    public LinkedList<Note> getNotes(LinkedList<Note> notes) {
        LinkedList<Note> filteredNotes = new LinkedList<>();

        if(enumSet == null){
            for (Note note : notes) {
                if (note.getLabel() == e) filteredNotes.add(note);
            }
        }
        else {
            for (Note note : notes) {
                if (enumSet.contains(note.getEnum())) filteredNotes.add(note);
            }
        }

        return filteredNotes;
    }
}
