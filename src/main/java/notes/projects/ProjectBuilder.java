package notes.projects;

import notes.Note;
import notes.NoteBuilder;
import notes.Reminder;
import notes.noteEnums.ActTimeType;
import notes.noteEnums.Label;
import notes.noteEnums.Owner;

import java.util.ArrayList;

public class ProjectBuilder extends NoteBuilder {

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
    private ArrayList<String> simpleTasks;
    private ArrayList<Note> complexTasks;

    public ProjectBuilder(String name) {
        super(name);
    }

    public ProjectBuilder simpleTasks(ArrayList<String> simpleTasks) {
        this.simpleTasks = simpleTasks;
        return this;
    }
    public ProjectBuilder complexTasks(ArrayList<Note> complexTasks) {
        this.complexTasks = complexTasks;
        return this;
    }
    public Project build() {
        Project project = (Project) super.build();
        project.simpleTasks = this.simpleTasks;
        project.complexTasks = this.complexTasks;
        return project;
    }
    public ProjectBuilder fromNote(Note note) {
        NoteBuilder builder = super.fromNote(note);
        return (ProjectBuilder)builder;
    }

}
