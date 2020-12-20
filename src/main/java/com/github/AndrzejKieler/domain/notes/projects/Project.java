package com.github.AndrzejKieler.domain.notes.projects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import com.github.AndrzejKieler.domain.notes.Note;

import javax.persistence.*;
import java.util.List;

/*@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@Embeddable
@Entity
@Table(name = "PROJECT" )*/
public class Project extends Note {

   // @OneToMany
  //  protected List<String> simpleTasks;

    @Column
    protected boolean done;

    @OneToMany
    @JoinColumn(name = "noteId")
    protected List<Note> complexTasks;


}
