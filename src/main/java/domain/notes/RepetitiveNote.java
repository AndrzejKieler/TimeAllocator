package domain.notes;

import domain.repetitionPeriod.RepetitionPeriod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;

@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "REPETITIVENOTE")
public class RepetitiveNote extends Note{
/*
    // @OneToOne(mappedBy = "EVENT_OR_DEADLINE", cascade = CascadeType.ALL)
    protected RepetitionPeriod repetitionPeriod;

    public ArrayList<Date> updateRepetitions(){
        return repetitionPeriod.update(this);
    }

    public ArrayList<Date> updateRepetitions(Date date){
        return repetitionPeriod.update(this, date);
    }*/
}
