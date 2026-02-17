package storing;

import java.io.File ;
import java.io.FileNotFoundException;
import java.util.ArrayList ;
import java.util.Scanner;

import assessment.* ;

public class rf {

    public static ArrayList<Assessment> readfile(){
        File file = filepath.getFilename() ;

        ArrayList<Assessment> fileOut = new ArrayList<Assessment>() ;

        try (Scanner myReader = new Scanner(file)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] dataSplit = data.split(",") ;
                String[] dateSplit = dataSplit[2].split("-") ;
                int year = Integer.parseInt(dateSplit[0]) ;
                int month = Integer.parseInt(dateSplit[1]) ;
                int day = Integer.parseInt(dateSplit[2]) ;
                if (dataSplit[0].equals("Exam")){
                    fileOut.add(new Exam(year, month, day, dataSplit[3],dataSplit[1])) ;
                } else {
                    AssessedExercise ae = new AssessedExercise(dataSplit[0], year, month, day, dataSplit[3], dataSplit[1]) ;
                    if (!Boolean.parseBoolean(dataSplit[4])){ //if completed == false
                        ae.setComplete(false) ;
                        fileOut.add(ae) ;
                    }
                }
            }
            return fileOut ; //added as vs-code giving me grief for the finally statement
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            return fileOut ;
        }
    }
}
