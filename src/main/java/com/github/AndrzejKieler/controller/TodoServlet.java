package com.github.AndrzejKieler.controller;

import com.github.AndrzejKieler.domain.notes.Note;
import com.github.AndrzejKieler.repository.tools.DateFacade;
import lombok.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.github.AndrzejKieler.service.DTO.NoteDTO;
import com.github.AndrzejKieler.service.TodoTodayService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
class TodoServlet {
    private final Logger logger = LoggerFactory.getLogger(TimeAllocatorServlet.class);
    private final TodoTodayService todoTodayService;


    TodoServlet(TodoTodayService service) {
        this.todoTodayService = service;
    }

    @GetMapping
    ResponseEntity<List<NoteDTO>> findTodoToday(){
        logger.info("Request today got");
        var today = todoTodayService.findTodoToday();
        //if(today != null)
            return ResponseEntity.ok(today);
        //else return ResponseEntity.ok(new ArrayList<NoteDTO>());
    }
    @PostMapping
    ResponseEntity<Note> saveNote(@RequestBody Note note){
        note.setDate(DateFacade.getInstance().getToday());
        return ResponseEntity.ok(todoTodayService.addNote(note));
    }
}
