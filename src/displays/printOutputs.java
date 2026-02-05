package displays;
import assessment.Exam ;
import assessment.AssessedExercise ;

public class printOutputs{
    public static void main(String[] args){
        Exam ooseExam = new Exam("Final exam", 2026, 05, 25, 1.5, "[Link to page]", "OOSE2") ;
        System.out.println(ooseExam.getCourse()) ;
        System.out.println(ooseExam.getName()) ;
        System.out.println(ooseExam.getLink()) ;
        System.out.println(ooseExam.getDate()) ;
        System.out.println(ooseExam.getDuration()) ;

        System.out.println("") ;

        AssessedExercise twd = new AssessedExercise("Tango with Django", 2026, 3, 4, "[Link to git]","WAD2") ;
        System.out.println(twd.getCourse()) ;
        System.out.println(twd.getName()) ;
        System.out.println(twd.getLink()) ;
        System.out.println(twd.getDate()) ;
        System.out.println(twd.isCompleted()) ;
        twd.complete() ;
        System.out.println(twd.isCompleted()) ;
        
    }


}