package domain.notes.projects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import domain.notes.Note;

import javax.persistence.*;
import java.util.List;

@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@Embeddable
@Entity
@Table(name = "PROJECT" )
public class Project extends Note {

   // @OneToMany
  //  protected List<String> simpleTasks;

    @OneToMany
    @JoinColumn(name = "noteId")
    protected List<Note> complexTasks;


}
