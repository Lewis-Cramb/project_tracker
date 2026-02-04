package assessment ;
import java.time.LocalDate ;

public class Exam {
    private final String name ;
    private final LocalDate date ;
    private final int duration ;

    public Exam(String title, int year, int month, int date, int time){
        this.name = title ;
        this.date = LocalDate.of(year, month, date) ;
        this.duration = (time)*60 ; //time in minutes (will ask to have hrs inputted by user)
    }

    public String getName() {
        return this.name ;
    }

    public int getDuration() {
        return this.duration ;
    }

    public LocalDate getDate() {
        return this.date ;
    }



}
