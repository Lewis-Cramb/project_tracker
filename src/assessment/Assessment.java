package assessment;
import java.time.LocalDate ;

public abstract class Assessment {
    private final String name ;
    private final LocalDate date ;
    private final String link ;
    private final String course ;

    public Assessment(String title, int year, int month, int date, String url, String course){
        this.name = title ;
        this.date = LocalDate.of(year, month, date) ;
        this.link = url ;
        this.course = course ;
    }

    public String getName() {
        return this.name ;
    }

    public LocalDate getDate() {
        return this.date ;
    }

    public String getLink(){
        return this.link ;
    }

    public String getCourse(){
        return this.course ;
    }
}
