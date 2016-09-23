package kata1v2alberto;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KATA1v2Alberto {
    public static void main(String[] args) {
        Calendar date=GregorianCalendar.getInstance();
        date.set(1993,3,8);
        Person person=new Person("Alberto",date);
        System.out.println(person.getName()+" tiene "
                +person.getAge()+" años");
    }
    
}
