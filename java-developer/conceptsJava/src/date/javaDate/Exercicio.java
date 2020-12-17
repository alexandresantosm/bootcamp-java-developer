package date.javaDate;

import java.util.Date;

public class Exercicio {
    public static void main(String[] args) {
        
        Long birthdayInMillis = 460004400000L;
        
        Date myBirthday = new Date(birthdayInMillis);
        
        System.out.println(myBirthday);
        
        Date date = new Date(2010, 05, 15);
        
        System.out.println(myBirthday.after(date));
    }
}
