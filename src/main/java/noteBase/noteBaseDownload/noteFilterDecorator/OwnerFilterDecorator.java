package noteBase.noteBaseDownload.noteFilterDecorator;

import notes.Note;
import notes.noteEnums.Owner;

import java.util.LinkedList;
import java.util.Set;

public class OwnerFilterDecorator extends NoteFilterDecorator{
    private Set<Owner> ownerSet;
    private Owner owner;
    OwnerFilterDecorator(NoteFilter noteFilter, Set<Owner> owners) {
        super(noteFilter);
        this.ownerSet = owners;
    }

    OwnerFilterDecorator(NoteFilter noteFilter, Owner owner) {
        super(noteFilter);
        this.owner = owner;
    }

    @Override
    public LinkedList<Note> getNotes(LinkedList<Note> notes) {
        LinkedList<Note> filteredNotes = new LinkedList<>();

        if(owner == Owner.BOTH || ownerSet.contains(Owner.BOTH)) return notes;

        if(ownerSet == null){
            for (Note note : notes) {
                if (note.getOwner() == owner) filteredNotes.add(note);
            }
        }
        else {
            for (Note note : notes) {
                if (ownerSet.contains(note.getOwner())) filteredNotes.add(note);
            }
        }

        return filteredNotes;
    }
}
