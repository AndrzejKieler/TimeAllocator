package noteBase.noteBaseDownload;
import notes.Note;
import java.util.ArrayList;

public interface NoteBaseDownloadAdapter {
    ArrayList<Note> getNoteFromFilter(NoteBaseFilter filter);
    Note getNoteById(long id);
}
