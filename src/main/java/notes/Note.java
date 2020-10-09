package notes;


import lombok.*;
import lombok.experimental.SuperBuilder;
import notes.noteEnums.ActTimeType;
import notes.noteEnums.Label;
import notes.noteEnums.Owner;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Getter
@ToString
@EqualsAndHashCode
@SuperBuilder
public class Note implements Comparable, Cloneable {

    protected static long noteId;
    @NotNull
    protected String name;
    protected short priority;
    protected Reminder reminder;
    protected boolean critical;
    protected short durationEstimated;
    protected short durationAverage;
    protected short durationReal;
    protected String memo;
    protected Label label;
    protected Owner owner;
    protected ActTimeType actTimeType;
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
