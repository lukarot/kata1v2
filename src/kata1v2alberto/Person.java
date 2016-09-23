package kata1v2alberto;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private static final long MILLISECONDS_PER_YEAR=(long)(1000*60*60*24*365.25);

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    private long milliSecondsToYear(long milles){
        return milles/MILLISECONDS_PER_YEAR;
    }
    public int getAge(){
        Calendar today=GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis()
                -birthdate.getTimeInMillis()));
    }
}
