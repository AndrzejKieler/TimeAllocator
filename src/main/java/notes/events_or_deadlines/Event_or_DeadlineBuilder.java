package notes.events_or_deadlines;

import notes.Note;
import notes.NoteBuilder;
import notes.Reminder;
import notes.repetitionPeriod.RepetitionPeriod;
import notes.noteEnums.ActTimeType;
import notes.noteEnums.Label;
import notes.noteEnums.Owner;
import notes.tasks.Task;
import notes.tasks.TaskBuilder;

import java.util.ArrayList;

public class Event_or_DeadlineBuilder extends NoteBuilder {
    private short priority = 0;
    private Reminder reminder;
    private boolean critical = false;
    private short durationEstimated = 0;
    private short durationAverage = 0;
    private short durationReal = 0;
    private String memo;
    private String name;
    private Label label;
    private Owner owner;
    private ActTimeType actTimeType = ActTimeType.TO_PUT_INTO_CALENDAR;
    private ArrayList<Note> relatedNotes;
    private Event_or_DeadlineType event_or_deadlineType;
    private RepetitionPeriod repetitionPeriod;
    Event_or_DeadlineBuilder(String name) {
        super(name);
    }

    public Event_or_DeadlineBuilder relatedNotes(ArrayList<Note> relatedNotes) {
        this.relatedNotes = relatedNotes;
        return this;
    }
    public Event_or_DeadlineBuilder event_od_deadlineType(Event_or_DeadlineType event_or_deadlineType) {
        this.event_or_deadlineType = event_or_deadlineType;
        return this;
    }
    public Event_or_DeadlineBuilder repetitionPeriod(RepetitionPeriod period) {
        this.repetitionPeriod = period;
        return this;
    }

    public Event_or_Deadline build() {
        Event_or_Deadline event_or_deadline = (Event_or_Deadline) super.build();
        event_or_deadline.relatedNotes = this.relatedNotes;
        event_or_deadline.event_or_deadlineType = this.event_or_deadlineType;
        event_or_deadline.repetitionPeriod = this.repetitionPeriod;
        return event_or_deadline;
    }
    public Event_or_DeadlineBuilder fromNote(Note note) {
        NoteBuilder builder = super.fromNote(note);
        return (Event_or_DeadlineBuilder)builder;
    }
}
