package domain.repetitionPeriod.repetitionPeriodTypeFactory;

import domain.repetitionPeriod.RepetitionPeriod;
import domain.repetitionPeriod.RepetitionPeriodFactory;

import java.util.Date;

public class MonthlyByWeekdayPeriodFactory extends RepetitionPeriodFactory {
    @Override
    protected RepetitionPeriod build(Date date, int repetitionFrequency, Date finishDate, byte weekDays) {
        //TODO
        return null;
    }
}
