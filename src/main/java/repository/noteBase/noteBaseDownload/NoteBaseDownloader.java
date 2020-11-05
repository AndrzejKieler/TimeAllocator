package repository.noteBase.noteBaseDownload;
import repository.noteBase.noteBaseDownload.noteFilterDecorator.NoteFilter;
import domain.notes.Note;
import java.util.ArrayList;

public interface NoteBaseDownloader {
    ArrayList<Note> getNotesFromFilter(NoteFilter filter);
    ArrayList<Note> getWholeNotes();
    Note getNoteById(long id);
}
