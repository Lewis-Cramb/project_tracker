package storing;

import assessment.Assessment ;
import java.util.ArrayList ;

public class inOut {
    public static void output(ArrayList<Assessment> assessments){
        //first, sort assessments by date
        sort.InsertionSort(assessments) ;
        //next, write to the txt file
        wf.writefile(assessments) ;
    }

    public static ArrayList<Assessment> input(){
        return rf.readfile() ;
    }
}
