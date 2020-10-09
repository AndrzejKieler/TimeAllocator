package notes.projects;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import notes.Note;

import java.util.ArrayList;

@Getter
@ToString
@SuperBuilder
public class Project extends Note {
    protected ArrayList<String> simpleTasks;
    protected ArrayList<Note> complexTasks;


}
