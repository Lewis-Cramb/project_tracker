package displays;
import assessment.Exam ;
import javax.swing.* ;

public class examAdd {

    public static Exam add(){
        JOptionPane addCourse = new JOptionPane("Course Code") ;
        String course = JOptionPane.showInputDialog(addCourse,"What is the course code?") ;
        
        JOptionPane addDate = new JOptionPane("Date") ;
        int year ;
        int month ;
        int day ;
        while (true){
            String fullDate = JOptionPane.showInputDialog(addDate,"What date is the exam? DD/MM/YYYY format") ;
            String[] dateComps = fullDate.split("/") ;
            year = Integer.parseInt(dateComps[2]) ;
            month = Integer.parseInt(dateComps[1]) ;
            day = Integer.parseInt(dateComps[0]) ;
            if (!(month>12 || month<0 || day<0 || day>31)){
                break ;
            }
        }

        JOptionPane addDuration = new JOptionPane("Length") ;
        double dur = Double.parseDouble(JOptionPane.showInputDialog(addDuration,"How long is the exam (in hrs)?")) ;
        
        JOptionPane addURL = new JOptionPane("URL") ;
        String url = JOptionPane.showInputDialog(addURL,"Provide a link to a study page, click OK if none.") ;

        return new Exam(year, month, day, dur, url, course) ;
    
    }
}
