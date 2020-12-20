package com.github.AndrzejKieler.domain.repetitionPeriod.repetitionPeriodTypeFactory;

import com.github.AndrzejKieler.domain.repetitionPeriod.RepetitionPeriod;
import com.github.AndrzejKieler.domain.repetitionPeriod.RepetitionPeriodFactory;

import java.util.Date;

public class WeeklyPeriodFactory extends RepetitionPeriodFactory {
    @Override
    protected RepetitionPeriod build(Date date, int repetitionFrequency, Date finishDate, byte weekDays) {
        //TODO
        return null;
    }
}
