package repository;

import controller.HibernateUtil;
import repository.noteBase.noteBaseDownload.NoteBaseDownloader;
import repository.noteBase.noteBaseDownload.noteFilterDecorator.MainNoteFilter;
import repository.noteBase.noteBaseDownload.noteFilterDecorator.NoteFilter;
import repository.noteBase.noteBaseUpload.NoteBaseUploader;
import domain.notes.Note;
import repository.tools.DateFacade;

import java.util.*;

public class NoteRepository {
    private List<Note> notes;
    private NoteBaseDownloader noteBaseDownloader;
    private NoteBaseUploader noteBaseUploader;
    private NoteFilter noteFilter;

    public NoteRepository() {
        notes = new LinkedList<Note>();
    }
    NoteRepository(List<Note> notes) {
        this.notes = notes ;
    }
    NoteRepository(Note... notes) {
       this.notes = new ArrayList<Note>();
        for (Note note : notes) {
            this.notes.add(note);
        }
    }
/*
    public Optional<Note> findById(Long id){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.get(Note.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }

    public List<Note> findTodoToday(){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.createQuery("from Note where  date =:today", Note.class)
                .setParameter("today",DateFacade.getInstance().getToday())
                .list();
        transaction.commit();
        session.close();
        return result;
    }

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

    Optional<List<Note>> getNotesFromRepository() {
        Optional<List<Note>> notes = Optional.ofNullable(this.notes);
        return notes;
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
