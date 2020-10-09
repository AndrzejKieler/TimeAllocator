package notes.events_or_deadlines;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import notes.Note;
import notes.repetitionPeriod.RepetitionPeriod;

import java.util.ArrayList;

@Getter
@ToString
@SuperBuilder
public class Event_or_Deadline extends Note {
    protected ArrayList<Note> relatedNotes;
    protected Event_or_DeadlineType event_or_deadlineType;
    protected RepetitionPeriod repetitionPeriod;

    @Override
    public Enum getEnum() {
        return event_or_deadlineType;
    }
}
