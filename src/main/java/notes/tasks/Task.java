package notes.tasks;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import notes.Note;
import notes.repetitionPeriod.RepetitionPeriod;
@Getter
@ToString
public class Task extends Note {
    protected TaskType taskType;
    protected RepetitionPeriod repetitionPeriod;
}
