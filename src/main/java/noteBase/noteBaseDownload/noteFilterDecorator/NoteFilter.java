package noteBase.noteBaseDownload.noteFilterDecorator;

import lombok.Builder;
import notes.Note;

import java.util.LinkedList;


public interface NoteFilter {
    LinkedList<Note> getNotes(LinkedList<Note> notes);
}
