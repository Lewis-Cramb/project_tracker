package storing;

import assessment.Assessment ;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList ;
import java.io.File ;

public class wf {
    //plan is to write to ../../Files/data.txt from an array that needs to be sorted
    public static void writefile(ArrayList<Assessment> assessList){
        File file = filepath.getFilename() ;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                for (Assessment assess:assessList){
                    bw.write(assess.toString()) ; 
                    bw.newLine() ;
                }
            } catch (IOException e) {
                System.out.println("Error writing file.") ;
            }
    }
}

