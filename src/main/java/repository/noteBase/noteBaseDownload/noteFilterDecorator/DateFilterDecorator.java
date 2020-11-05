package repository.noteBase.noteBaseDownload.noteFilterDecorator;

import repository.tools.DateFacade;
import domain.notes.Note;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class DateFilterDecorator extends NoteFilterDecorator {
Date startDate, endDate;

    public DateFilterDecorator(NoteFilter noteFilter, Date startDate, Date endDate) {
        super(noteFilter);
        this.startDate = DateFacade.getInstance().addToDate(startDate, Calendar.DATE, -1);
        this.endDate = DateFacade.getInstance().addToDate(endDate, Calendar.DATE, 1);
    }

    public DateFilterDecorator(NoteFilter noteFilter, Date date) {
        super(noteFilter);
        this.startDate = date;
    }

    @Override
    public LinkedList<Note> getNotes(LinkedList<Note> notes) {

        LinkedList<Note> filteredNotes = super.getNotes(notes);

        if(endDate == null){
            for (Note note : notes) {
                if(note.getDate() == startDate) filteredNotes.add(note);
            }
        }
        else{
            for (Note note : notes) {
                if(note.getDate().after(startDate) && note.getDate().before(endDate)) {
                    filteredNotes.add(note);
                }
            }
        }

        return filteredNotes;
    }
}
