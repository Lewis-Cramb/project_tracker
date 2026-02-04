package displays;
import assessment.Exam ;
import assessment.AssessedExercise ;

public class printOutputs{
    public static void main(String[] args){
        Exam oose2 = new Exam("OOSE2", 2026, 05, 25, 1.5, "[Link to page]") ;
        System.out.println(oose2.getName()) ;
        System.out.println(oose2.getLink()) ;
        System.out.println(oose2.getDate()) ;
        System.out.println(oose2.getDuration()) ;

        AssessedExercise twd = new AssessedExercise("Tango with Django: WAD2", 2026, 3, 4, "[Link to git]") ;
        System.out.println(twd.getName()) ;
        System.out.println(twd.getLink()) ;
        System.out.println(twd.getDate()) ;
        System.out.println(twd.isCompleted()) ;
        twd.complete() ;
        System.out.println(twd.isCompleted()) ;
        
    }


}