package noteBase.noteBaseDownload;
import noteBase.noteBaseDownload.noteFilterDecorator.NoteFilter;
import notes.Note;
import java.util.ArrayList;

public interface NoteBaseDownloadAdapter {
    ArrayList<Note> getNoteFromFilter(NoteFilter filter);
    Note getNoteById(long id);
}
