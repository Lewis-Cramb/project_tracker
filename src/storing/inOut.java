package storing;

import assessment.Assessment ;
import java.util.ArrayList ;

public class inOut {
    public static void output(ArrayList<Assessment> assessments){
        //first, sort assessments by date
        ArrayList<Assessment> assessList = sort.InsertionSort(assessments) ;
        //next, write to the txt file
        wf.writefile(assessments) ;
    }
}
