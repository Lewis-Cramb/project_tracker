package displays;
import assessment.Exam ;
import assessment.AssessedExercise ;
import assessment.Assessment ;

import java.util.Scanner ;

public class enterAssessment {
    public static void main(String[] args){
        Assessment nA ; //nA stands for newAssessment
        Scanner scans = new Scanner(System.in) ;
        System.out.println("Do you want to enter an exam or an assessed exercise? \nType '0' for an exam, '1' for an AE, or '2' to quit. ") ;
        String response = scans.nextLine() ;
        switch(response){
            case "0": nA = enterExam(scans) ; break ;
            case "1": nA = enterAE(scans) ; break ;
            case "2": System.out.println("Exiting program") ; return ;
            default: System.out.println("Invalid, exiting program.") ; return ;
        }
        System.out.println(nA.getName() + " for " + nA.getCourse() +" on " + nA.getDate() +" - revise at " + nA.getLink()) ;
    }

    public static Assessment enterExam(Scanner scans){ //I would use a function for the joined stuff but txt is different
        System.out.println("What course is the exam for?") ;
        String course = scans.nextLine() ;

        System.out.println("What is the date of the exam? Please enter in format dd-mm-yyyy") ;
        String date = scans.nextLine() ;
        int year ;
        int month ;
        int day ;
        while (true) {
            try{
                String[] dateComp = date.split("-") ;
                year = Integer.parseInt(dateComp[2]) ;
                month = Integer.parseInt(dateComp[1]) ;
                day = Integer.parseInt(dateComp[0]) ;
                if (month>12 || month<0 || day<0 || day>31){
                    throw new NumberFormatException("Wrong date or month") ;
                }
                break ;
            } catch (NumberFormatException e) {
                System.out.println("Date not in the correct format: dd-mm-yyyy. Enter agan: ") ;
                date = scans.nextLine() ;

            }
        }

        System.out.println("What is the duration of the exam in hours? (e.g 1, 1.5 etc)") ;
        double dur ;
        while (true) {
            try{
                dur = Double.parseDouble(scans.nextLine()) ;
                break ;
            } catch (NumberFormatException e){
                System.out.println("Duration not a number") ;
            }
        }

        System.out.println("Please provide the url to one study resource, if none leave blank: ") ;
        String url = scans.nextLine() ;

        Exam newExam = new Exam(year, month, day, dur, url, course) ;

        return newExam ;


    }

    public static Assessment enterAE(Scanner scans){
        System.out.println("What is the name of the AE? ") ;
        String title = scans.nextLine() ;

        System.out.println("What course is the AE for?") ;
        String course = scans.nextLine() ;

        System.out.println("What is the due date of the AE? Please enter in format dd-mm-yyyy") ;
        String date = scans.nextLine() ;
        int year ;
        int month ;
        int day ;
        while (true) {
            try{
                String[] dateComp = date.split("-") ;
                year = Integer.parseInt(dateComp[2]) ;
                month = Integer.parseInt(dateComp[1]) ;
                day = Integer.parseInt(dateComp[0]) ;
                if (month>12 || month<0 || day<0 || day>31){
                    throw new NumberFormatException("Wrong date or month") ;
                }
                break ;
            } catch (NumberFormatException e) {
                System.out.println("Date not in the correct format: dd-mm-yyyy. Enter agan: ") ;
                date = scans.nextLine() ;

            }
        }

        System.out.println("Please provide the url to one study resource, if none leave blank: ") ;
        String url = scans.nextLine() ;

        AssessedExercise newAE = new AssessedExercise(title, year, month, day, url, course) ;

        return newAE ;
    }
}
