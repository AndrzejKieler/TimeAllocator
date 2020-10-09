package notes.tasks;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import notes.Note;
import notes.repetitionPeriod.RepetitionPeriod;

@Getter
@ToString
@SuperBuilder
public class Task extends Note {
    protected TaskType taskType;
    protected RepetitionPeriod repetitionPeriod;

    @Override
    public Enum getEnum(){
        return taskType;
    }
}
