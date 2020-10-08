package notes;

import notes.noteEnums.ActTimeType;
import notes.noteEnums.Label;
import notes.noteEnums.Owner;

public class NoteBuilder extends Note {

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

    public NoteBuilder(String name) {
        this.name = name;
    }

    public NoteBuilder priority(short priority){
        this.priority = priority;
        return this;
    }
    public NoteBuilder reminder(Reminder reminder){
        this.reminder = reminder;
        return this;
    }
    public NoteBuilder critical(){
        this.critical = true;
        return this;
    }
    public NoteBuilder durationEstimated(short durationEstimated){
        this.durationEstimated = durationEstimated;
        return this;
    }
    public NoteBuilder durationAverage(short durationAverage){
        this.durationAverage = durationAverage;
        return this;
    }
    public NoteBuilder memo(String memo){
        this.memo = memo;
        return this;
    }
    public NoteBuilder label(Label label){
        this.label = label;
        return this;
    }
    public NoteBuilder owner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public NoteBuilder actTimeType(ActTimeType actTimeType) {
        this.actTimeType = actTimeType;
        return this;
    }

    public  Note build() {
        Note note = new Note();
        note.name = this.name;
        note.priority = this.priority;
        note.reminder = this.reminder;
        note.critical = this.critical;
        note.durationEstimated = this.durationEstimated;
        note.durationAverage = this.durationAverage;
        note.memo = this.memo;
        note.label = this.label;
        note.owner = this.owner;
        note.noteId = ++noteId;
        return note;
    }
    public NoteBuilder fromNote(Note note) {
        NoteBuilder builder = new NoteBuilder(note.name)
                .priority(note.priority)
                .reminder(note.reminder)
                .actTimeType(note.actTimeType)
                .durationAverage(note.durationAverage)
                .durationEstimated(note.durationEstimated)
                .label(note.label)
                .owner(note.owner)
                .memo(note.memo);
        if(note.isCritical()) {
            builder = builder.critical();
        }
        return builder;
    }
}
