package notes.tasks;

import notes.Note;
import notes.NoteBuilder;
import notes.Reminder;
import notes.repetitionPeriod.RepetitionPeriod;
import notes.noteEnums.ActTimeType;
import notes.noteEnums.Label;
import notes.noteEnums.Owner;

public class TaskBuilder extends NoteBuilder {
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
    private TaskType taskType;
    private RepetitionPeriod repetitionPeriod;

    TaskBuilder(String name) {
        super(name);
    }

    public TaskBuilder taskType(TaskType taskType) {
        this.taskType = taskType;
        return this;
    }

    public TaskBuilder repetitionPeriod(RepetitionPeriod period) {
        this.repetitionPeriod = period;
        return this;
    }

    public Task build() {
        Task task = (Task) super.build();
        task.taskType = this.taskType;
        task.repetitionPeriod = this.repetitionPeriod;
        return task;
    }
    public TaskBuilder fromNote(Note note) {
        NoteBuilder builder = super.fromNote(note);
        return (TaskBuilder)builder;
    }


}
