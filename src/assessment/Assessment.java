package assessment;
import java.time.LocalDate ;

public abstract class Assessment {
    protected final String name ;
    protected final LocalDate date ;
    protected final String link ;
    protected final String course ;

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

    public String getDateString(){
        return this.date.getDayOfMonth()+"-"+this.date.getMonth()+"-"+this.date.getYear() ;
    }

    public String getLink(){
        return this.link ;
    }

    public String getCourse(){
        return this.course ;
    }
}    
