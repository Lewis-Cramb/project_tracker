package assessment ;
import java.time.LocalDate ;

public class Exam implements Assessments {
    private final String name ;
    private final LocalDate date ;
    private final double duration ;
    private final String link ;

    public Exam(String title, int year, int month, int date, double time, String url){
        this.name = title ;
        this.date = LocalDate.of(year, month, date) ;
        this.duration = (time)*60 ; //time in minutes (will ask to have hrs inputted by user)
        this.link = url ;
    }

    @Override
    public String getName() {
        return this.name ;
    }

    public double getDuration() {
        return this.duration ;
    }

    @Override
    public LocalDate getDate() {
        return this.date ;
    }

    @Override
    public String getLink(){
        return this.link ;
    }



}
