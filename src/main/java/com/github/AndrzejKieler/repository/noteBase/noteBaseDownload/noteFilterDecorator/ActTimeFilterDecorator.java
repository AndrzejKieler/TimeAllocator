package com.github.AndrzejKieler.repository.noteBase.noteBaseDownload.noteFilterDecorator;

import com.github.AndrzejKieler.domain.notes.Note;
import com.github.AndrzejKieler.domain.notes.noteEnums.ActTimeType;

import java.util.LinkedList;
import java.util.Set;

public class ActTimeFilterDecorator extends NoteFilterDecorator {
    private Set<ActTimeType> typeSet;
    private ActTimeType type;

    ActTimeFilterDecorator(NoteFilter noteFilter, ActTimeType type) {
        super(noteFilter);
        this.type = type;
    }

    ActTimeFilterDecorator(NoteFilter noteFilter, Set<ActTimeType> typeSet) {
        super(noteFilter);
        this.typeSet = typeSet;
    }

    public LinkedList<Note> getNotes(LinkedList<Note> notes) {
        LinkedList<Note> filteredNotes = new LinkedList<>();

        if(typeSet == null){
            for (Note note : notes) {
                if (note.getActTimeType() == type) filteredNotes.add(note);
            }
        }
        else {
            for (Note note : notes) {
                if (typeSet.contains(note.getActTimeType())) filteredNotes.add(note);
            }
        }

        return filteredNotes;
    }


}
