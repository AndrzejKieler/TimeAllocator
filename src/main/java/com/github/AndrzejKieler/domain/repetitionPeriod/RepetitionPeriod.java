package com.github.AndrzejKieler.domain.repetitionPeriod;

import com.github.AndrzejKieler.domain.notes.Note;
import com.github.AndrzejKieler.domain.notes.RepetitiveNote;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@NoArgsConstructor
@Entity
@Table(name = "RepetitionPeriod")
public class RepetitionPeriod {

    @Id
    Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    Note repeatedNote;

    private ArrayList<Date> repetitionDates;

    @Column
    Date startDate;

    @Column
    Date finishDate;

    RepetitionPeriod(Date startDate, ArrayList<Date> repetitionDates) {
        this.startDate = startDate;
        this.repetitionDates = repetitionDates;
    }
    RepetitionPeriod(Date startDate, ArrayList<Date> repetitionDates, Date finishDate) {
        this.startDate = startDate;
        this.repetitionDates = repetitionDates;
        this.finishDate = finishDate;
    }

    public ArrayList<Date> update(RepetitiveNote note) {
        ArrayList<Date> dates = new ArrayList<>();
        //TODO from dateFacade
        //TODO use strategy for Pertiod Type
        return dates;
    }

    public ArrayList<Date> update(RepetitiveNote note, Date date) {
        ArrayList<Date> dates = new ArrayList<>();
        //TODO from dateFacade
        //TODO use strategy for Pertiod Type
        return dates;
    }

}
