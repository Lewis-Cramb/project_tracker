package assessment ;

public class Exam extends Assessment {
    private final double duration ;

    public Exam(int year, int month, int date, double time, String url, String course){
        super("Exam", year, month, date, url, course) ;
        this.duration = (time)*60 ; //time in minutes (will ask to have hrs inputted by user)
    }
    
    public double getDuration() {
        return this.duration ;
    }
}
