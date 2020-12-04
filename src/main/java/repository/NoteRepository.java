package repository;

import controller.HibernateUtil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import repository.noteBase.noteBaseDownload.NoteBaseDownloader;
import repository.noteBase.noteBaseDownload.noteFilterDecorator.MainNoteFilter;
import repository.noteBase.noteBaseDownload.noteFilterDecorator.NoteFilter;
import repository.noteBase.noteBaseUpload.NoteBaseUploader;
import domain.notes.Note;
import repository.tools.DateFacade;

import java.util.*;

@Repository
//@RepositoryRestResource
public interface NoteRepository extends JpaRepository<Note, Long> {

    List<Note> findByNoteId(Long id);

    List<Note> findByDate(Date date);

    /*


    public Note addNote(Note note){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        if (note.getDate() == null) {
            note.setDate(DateFacade.getInstance().getToday());
        }

        session.persist(note);
        transaction.commit();
        session.close();
        return note;
    }

    public List<Note> filterNotes() {
        List<Note> notes = new ArrayList<Note>();
        /* TODO
        Możliwa zmiana gdy filter będzie działał od strony bazy danych

        notes = noteFilter.getNotes((LinkedList<Note>)this.notes);
        return notes;
    }

    public void uploadNotes(NoteBaseUploader uploader) {
        uploader.uploadNotes(notes);
    }
    public void uploadNote(NoteBaseUploader uploader,Note note) {
        uploader.uploadNote(note);
    }
    public void downloadNotes(NoteBaseDownloader downloader) {
        notes = downloader.getWholeNotes();
    }

    Note createNote(Map<String,String[]> noteParams) {
        Note note;
        note = Note.builder().name("").build();
        /* TODO Parsing Params method

        return note;
    }

    NoteFilter createNoteFilter(Map<String,String[]> filterParams) {
        NoteFilter noteFilter;
        noteFilter = new MainNoteFilter((LinkedList<Note>) notes);
        /* TODO Parsing Params method

        return noteFilter;
    }*/
}
