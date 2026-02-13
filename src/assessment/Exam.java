package assessment ;

public class Exam extends Assessment {

    public Exam(int year, int month, int date, String url, String course){
        super("Exam", year, month, date, url, course) ;
    }

    public String toString(){
        return this.__str__() ;
    }
    
    public String __str__(){
        return "Exam,"+this.getCourse()+","+this.getDate()+","+this.getLink() ;
    }
}
