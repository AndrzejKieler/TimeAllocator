package domain.notes;


import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;
import domain.notes.noteEnums.ActTimeType;
import domain.notes.noteEnums.Label;
import domain.notes.noteEnums.Owner;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "NOTE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Note implements Comparable, Cloneable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "noteId", updatable = false, nullable = false)
    protected Long noteId;

    @NotNull
    @Column
    protected String name;

    @Column
    protected Short priority;

    //@Column
    //protected Reminder reminder;

    @Column
    protected Boolean critical;

    @Column
    protected Short durationEstimated;

    @Column
    protected Short durationAverage;

    @Column
    protected Short durationReal;

    @Column
    protected String memo;

    @Column
    protected Label label;

    @Column
    protected Owner owner;

    @Column
    protected ActTimeType actTimeType;

    @Column
    @Temporal(TemporalType.DATE)
    protected Date date;

    @Override
    public int compareTo(@NotNull Object o) {
        Note note = (Note) o;

        if (this.getDate().before(note.getDate())) {
            return -1;
        }
        else if (this.getDate().after(note.getDate())) {
            return 1;
        }
        else {  if (this.getPriority() > note.getPriority()) {
                return -1;
                }
                else if (this.getPriority() < note.getPriority()) {
                return 1;
                }
        }

        return 0;
    }

    public Enum getEnum() {
        return label;
    }
}
