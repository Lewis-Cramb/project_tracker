package assessment;

public class AssessedExercise extends Assessment {
    private boolean completed ;

    public AssessedExercise(String title, int year, int month, int day, String url, String course){
        super(title,year,month,day,url,course) ;
        this.completed = false ;
    }

    public boolean isCompleted(){
        return this.completed ;
    }

    public void setComplete(boolean bool){
        this.completed = bool ;
    }
}
