package notes.repetitionPeriod;

import notes.DateFacade;
import notes.repetitionPeriod.repetitionPeriodTypeFactory.AnnualPeriodFactory;
import notes.repetitionPeriod.repetitionPeriodTypeFactory.MonthlyByNumberPeriodFactory;
import notes.repetitionPeriod.repetitionPeriodTypeFactory.MonthlyByWeekdayPeriodFactory;
import notes.repetitionPeriod.repetitionPeriodTypeFactory.WeeklyPeriodFactory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public abstract class RepetitionPeriodFactory {

    final RepetitionPeriod createPeriod(Object[] args) {
        RepetitionPeriod period;
        byte weekDays;

        RepetitionPeriodEnum periodType = (RepetitionPeriodEnum) args[0];
        Date date = (Date) args[1];
        int repetitionOffset = (int) args[2];
        Date finishDate = (Date) args[3];

        if (args[4] != null) {
            weekDays = (byte) args[4];
        } else if(periodType != RepetitionPeriodEnum.DAILY_REPEATED){
            weekDays = DateFacade.getInstance().nullWeekDays(date);
        }
        else {
            return buildDaily(date, repetitionOffset, finishDate);
        }

        return periodTypeFactory(periodType).build(date,repetitionOffset, finishDate, weekDays);
    }

    final RepetitionPeriod buildDaily(Date startDate, int repetitionOffset,Date finishDate){
        ArrayList<Date> repetitionDates = new ArrayList<>();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Poland"));

        calendar.setTime(startDate);
        calendar.add(Calendar.YEAR,1);
        Date yearAddedDate = calendar.getTime();
        calendar.setTime(startDate);

        while(startDate.before(yearAddedDate)){
            repetitionDates.add(calendar.getTime());
            calendar.add(Calendar.DATE,repetitionOffset);
            if(finishDate!=null && startDate.before(finishDate)) break;
        }
        if(finishDate!=null) return new RepetitionPeriod(startDate,repetitionDates,finishDate);
        else return new RepetitionPeriod(startDate,repetitionDates);

    }

    final RepetitionPeriodFactory periodTypeFactory(RepetitionPeriodEnum periodType){
        switch (periodType){
            case ANNUAL:
                return new AnnualPeriodFactory();
            case WEEKLY_REPEATED:
                return new WeeklyPeriodFactory();
            case MONTHLY_REPEATED_BY_NUMBER:
                return new MonthlyByNumberPeriodFactory();
            case MONTHLY_REPEATED_BY_WORKDAY:
                return new MonthlyByWeekdayPeriodFactory();
        }
        return null;
    }

    protected abstract RepetitionPeriod build(Date date, int repetitionFrequency, Date finishDate, byte weekDays);
}

