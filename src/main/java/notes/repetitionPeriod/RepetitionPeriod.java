package notes.repetitionPeriod;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class RepetitionPeriod {
    ArrayList<Date> repetitionDates;
    Date startDate;
    Date finishDate;

    RepetitionPeriod(Date startDate, ArrayList<Date> repetitionDates) {
        this.startDate = startDate;
        this.repetitionDates = repetitionDates;
    }
    RepetitionPeriod(Date startDate, ArrayList<Date> repetitionDates,Date finishDate) {
        this.startDate = startDate;
        this.repetitionDates = repetitionDates;
        this.finishDate = finishDate;
    }
}
