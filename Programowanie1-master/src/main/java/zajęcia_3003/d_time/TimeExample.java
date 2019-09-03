package zajęcia_3003.d_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class TimeExample {

    public static void main(String[] args) {
        Date date = new Date();


        //  JODA TIME są takie biblioteki do Date żeby normalnie pracować na datach w javie wcześniejszej niż 8
        // LocalTime już jest spoko.

        // org.joda.time.LocalDate jadaData = new org.joda.time.LocalDate().toDate;
        // .toDate na końcu używać, zwraca nam to Javową datę


        // OD javy 8

        // czas godzinowy
        LocalTime localTime = LocalTime.now();

        //czas kalendarzowy
        LocalDate localDate  = LocalDate.now();

        //godzinowy i
        LocalDateTime localDateTime = LocalDateTime.now();
    }
}
