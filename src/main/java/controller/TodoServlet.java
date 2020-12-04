package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.notes.Note;
import lombok.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DTO.NoteDTO;
import service.TodoTodayService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
class TodoServlet {
    private final Logger logger = LoggerFactory.getLogger(TimeAllocatorServlet.class);
    private TodoTodayService todoTodayService;

   // private TodoServlet() {}

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
    void doPost(HttpServletRequest req){
        //var newNote = mapper.readValue(req.getInputStream(), Note.class);
        //mapper.writeValue(resp.getOutputStream(),todoTodayService.addNote(newNote));
    }
/*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var newNote = mapper.readValue(req.getInputStream(), Note.class);
        mapper.writeValue(resp.getOutputStream(),todoTodayService.addNote(newNote));

    }*/
}
