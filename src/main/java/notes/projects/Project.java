package notes.projects;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import notes.Note;
import java.util.ArrayList;
@Getter
@ToString
public class Project extends Note {
    protected ArrayList<String> simpleTasks;
    protected ArrayList<Note> complexTasks;
}
