package storing;

import assessment.Assessment ;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException ;
import java.time.LocalDate ;
import java.util.ArrayList ;

public class wf {
    //plan is to write to ../../Files/data.txt from an array that needs to be sorted
    public static void writefile(ArrayList<Assessment> assessList){
        File file = filepath.getFilename() ;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                for (Assessment assess:assessList){
                    if ((assess.getDate()).isAfter(LocalDate.now())){
                        bw.write(assess.toString()) ; 
                        bw.newLine() ;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error writing file.") ;
            }
    }
}

