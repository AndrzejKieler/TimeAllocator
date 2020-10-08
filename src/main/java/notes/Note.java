package notes;


import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import notes.noteEnums.ActTimeType;
import notes.noteEnums.Label;
import notes.noteEnums.Owner;
import org.jetbrains.annotations.NotNull;

@Getter
@ToString
public class Note implements Comparable, Cloneable{

    protected static long noteId;
    @NotNull
    protected String name;
    protected short priority = 0;
    protected Reminder reminder;
    protected boolean critical = false;
    protected short durationEstimated = 0;
    protected short durationAverage = 0;
    protected short durationReal = 0;
    protected String memo;
    protected Label label;
    protected Owner owner;
    protected ActTimeType actTimeType = ActTimeType.TO_PUT_INTO_CALENDAR;

    protected boolean isCritical() {
        return critical;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        Note note = (Note) o;
        //TODO
        return 0;
    }

}
