package com.github.AndrzejKieler.service;

import com.github.AndrzejKieler.domain.notes.Note;
import org.springframework.stereotype.Service;
import com.github.AndrzejKieler.repository.NoteRepository;

import java.util.Optional;

@Service
public class NoteGetService {

    private NoteRepository noteRepository;

    NoteGetService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public String getById(String id){
        Optional<Note> note = noteRepository.findById(Long.parseLong(id));
        return note.get().getName();
    }
}
