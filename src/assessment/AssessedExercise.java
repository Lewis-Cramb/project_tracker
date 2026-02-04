package assessment;
import java.time.LocalDate ;

public class AssessedExercise {
    private final String name ;
    private final LocalDate date ;
    private final String link ;
    private boolean completed ;

    public AssessedExercise(String title, int year, int month, int day, String url){
        this.name = title ;
        this.date = LocalDate.of(year, month, day) ;
        this.link = url ;
        this.completed = false ;
    }

    public String getName(){
        return this.name ;
    }

    public LocalDate getDate(){
        return this.date ;
    }

    public String getLink(){
        return this.link ;
    }

    public boolean isCompleted(){
        return this.completed ;
    }

    public void complete(){
        this.completed = true ;
    }
}
