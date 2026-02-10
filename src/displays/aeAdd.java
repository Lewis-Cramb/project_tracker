package displays;
import assessment.AssessedExercise;
import javax.swing.*;

public class aeAdd {

    public aeAdd(){

        JOptionPane addTitle = new JOptionPane("Title") ;
        String title = JOptionPane.showInputDialog(addTitle, "What is the title of the assessed exercise?") ;

        JOptionPane addCourse = new JOptionPane("Course Code") ;
        String course = JOptionPane.showInputDialog(addCourse,"What is the course code?") ;
        
        JOptionPane addDate = new JOptionPane("Date") ;
        int year ;
        int month ;
        int day ;
        while (true){
            String fullDate = JOptionPane.showInputDialog(addDate,"What is the due date? DD/MM/YYYY format") ;
            String[] dateComps = fullDate.split("/") ;
            year = Integer.parseInt(dateComps[2]) ;
            month = Integer.parseInt(dateComps[1]) ;
            day = Integer.parseInt(dateComps[0]) ;
            if (!(month>12 || month<0 || day<0 || day>31)){
                break ;
            }
        }
        
        JOptionPane addURL = new JOptionPane("URL") ;
        String url = JOptionPane.showInputDialog(addURL,"Provide a link to a study page, click OK if none.") ;

        new AssessedExercise(title, year, month, day, url, course) ;
    }

}
