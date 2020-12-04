package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.NoteRepository;
import repository.tools.DateFacade;
import service.DTO.NoteDTO;
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
/*

    public Note addNote(Note note) {
        return noteRepository.addNote(note);
    }


    */
}
