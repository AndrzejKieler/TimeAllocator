package com.github.AndrzejKieler.service;

import com.github.AndrzejKieler.domain.notes.Note;
import org.springframework.stereotype.Service;
import com.github.AndrzejKieler.repository.NoteRepository;
import com.github.AndrzejKieler.repository.tools.DateFacade;
import com.github.AndrzejKieler.service.DTO.NoteDTO;
import java.util.List;
import static java.util.stream.Collectors.toList;

@Service
public class TodoTodayService {

    private NoteRepository noteRepository;

    public TodoTodayService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<NoteDTO> findTodoToday() {
        return noteRepository
                .findByDate(DateFacade.getInstance().getToday())
                .stream()
                .map(NoteDTO::new)
                .collect(toList());
    }


    public Note addNote(Note note) {
        return noteRepository.save(note);
    }



}
