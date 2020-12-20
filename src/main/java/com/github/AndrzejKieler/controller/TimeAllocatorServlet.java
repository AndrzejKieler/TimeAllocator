package com.github.AndrzejKieler.controller;

import com.github.AndrzejKieler.service.NoteGetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class TimeAllocatorServlet {
    private Logger logger = LoggerFactory.getLogger(TimeAllocatorServlet.class);
    private NoteGetService noteGetService;

    TimeAllocatorServlet(NoteGetService noteGetService) {
        this.noteGetService = noteGetService;
    }

    @GetMapping(value = "/api")
    String getNote() {
       return getNote(null);
    }

    @GetMapping(value = "/api", params = {"note"})
    String getNote(@RequestParam("note") String noteId) {
        logger.info("Request got");
        String id = noteId;
        return noteGetService.getById(id);

    }
}
