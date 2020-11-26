package domain.notes.tasks;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import domain.notes.Note;

import javax.persistence.*;

@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "TASK")
public class Task extends Note /*RepetitiveNote*/ {

    @Column
    protected TaskType taskType;

    @Column
    protected boolean done;

    @Override
    public Enum getEnum(){
        return taskType;
    }
}
