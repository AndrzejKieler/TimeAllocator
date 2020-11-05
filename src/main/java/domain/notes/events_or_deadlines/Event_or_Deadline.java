package domain.notes.events_or_deadlines;

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
@Table (name = "EVENT_OR_DEADLINE" )
public class Event_or_Deadline extends Note /*RepetitiveNote*/ {

    @OneToMany
    @JoinColumn(name = "noteId")
    protected List<Note> relatedNotes;

    @Column
    protected Event_or_DeadlineType event_or_deadlineType;

    @Override
    public Enum getEnum() {
        return event_or_deadlineType;
    }
}
