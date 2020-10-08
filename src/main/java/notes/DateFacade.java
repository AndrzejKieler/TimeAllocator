package notes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateFacade {
    public static DateFacade dateFacade = new DateFacade();
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Poland"));
    private byte[] weekDaysList =
                    {(byte)0b01000000,
                     (byte)0b00100000,
                     (byte)0b00010000,
                     (byte)0b00001000,
                     (byte)0b00000100,
                     (byte)0b00000010,
                     (byte)0b00000001};

    private DateFacade() {

    }

    public byte nullWeekDays(Date date) {
        byte weekDays = (byte) 0b0100_0000;
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Poland"));
        calendar.setTime(date);
        int weekDayNum = calendar.get(Calendar.DAY_OF_WEEK)-2;
        if(weekDayNum == -1) weekDayNum = 6;
        weekDays >>= weekDayNum;
        return weekDays;
    }

    public ArrayList<Integer> weekDaysParser(byte weekDays) {
        int dayNum=1;
        ArrayList<Integer> weekDayList = new ArrayList<>();
        for (dayNum, dayNum<8, dayNum++) {
            if((weekDaysList[dayNum-1]&weekDays)>0)weekDayList.add(Integer.valueOf(dayNum));
        }
    }



    public Date addToDate(Date date, int typeOfRepetition, int repetitionOffset) {
        calendar.setTime(date);
        calendar.add(typeOfRepetition,repetitionOffset);
        return calendar.getTime();
    }


}
