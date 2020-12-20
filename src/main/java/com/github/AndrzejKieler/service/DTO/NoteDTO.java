package com.github.AndrzejKieler.service.DTO;

import com.github.AndrzejKieler.domain.notes.Note;

import java.util.Date;

public class NoteDTO {
    private String name;
    private Date date;
    private Long noteId;

    public NoteDTO(Note note) {
        this.name = note.getName();
        this.date = note.getDate();
        this.noteId = note.getNoteId();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
