package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.notes.Note;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repository.NoteRepository;
import service.TodoTodayService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class TodoServlet extends HttpServlet {
   /* private Logger logger = LoggerFactory.getLogger(TimeAllocatorServlet.class);
    private TodoTodayService todoTodayService;
    private ObjectMapper mapper;

    public TodoServlet() {
        this(new TodoTodayService(), new ObjectMapper());
    }

    public TodoServlet(TodoTodayService todoTodayService, ObjectMapper mapper) {
        this.todoTodayService = todoTodayService;
        this.mapper = mapper;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request got");
        resp.setContentType("application/json;charset=UTF-8");
        mapper.writeValue(resp.getOutputStream(),todoTodayService.findTodoToday());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var newNote = mapper.readValue(req.getInputStream(), Note.class);
        mapper.writeValue(resp.getOutputStream(),todoTodayService.addNote(newNote));

    }*/
}
