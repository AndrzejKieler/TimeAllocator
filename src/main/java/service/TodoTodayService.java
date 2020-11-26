package service;

import domain.notes.Note;
import repository.NoteRepository;
import service.DTO.NoteDTO;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class TodoTodayService {
    public static TodoTodayService todoTodayService = new TodoTodayService();

    private NoteRepository noteRepository;
/*
    public TodoTodayService() {
        this(new NoteRepository());
    }

    public Note addNote(Note note) {
        return noteRepository.addNote(note);
    }

    public TodoTodayService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }
    public List<NoteDTO> findTodoToday() {
        return noteRepository
                .findTodoToday()
                .stream()
                .map(NoteDTO::new)
                .collect(toList());
    }*/
}
