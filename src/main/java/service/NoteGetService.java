package service;

import domain.notes.Note;
import repository.NoteRepository;

import java.util.Optional;

public class NoteGetService {

    public static NoteGetService noteGetService = new NoteGetService();
    private NoteRepository noteRepository;

    NoteGetService() {
        noteRepository = new NoteRepository();
    }
/*
    public String getById(String id){
        Optional<Note> note = noteRepository.findById(Long.parseLong(id));
        return note.get().getName();
    }*/
}
