package notes.events_or_deadlines;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import notes.Note;
import notes.repetitionPeriod.RepetitionPeriod;

import java.util.ArrayList;
@Getter
@ToString
public class Event_or_Deadline extends Note {
    protected ArrayList<Note> relatedNotes;
    protected Event_or_DeadlineType event_or_deadlineType;
    protected RepetitionPeriod repetitionPeriod;



}
