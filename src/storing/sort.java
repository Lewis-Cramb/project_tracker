package storing;

import assessment.Assessment ;
import java.time.LocalDate ;
import java.util.ArrayList ;

public class sort {
    public static ArrayList<Assessment> InsertionSort(ArrayList<Assessment> A){ 
        int n = A.size() ; 
        for (int j=1;j<n;j++){
            Assessment keyClass = A.get(j) ;
            LocalDate key = A.get(j).getDate() ; 
            int i = j-1 ; 
            while (i>=0 && A.get(i).getDate().isAfter(key)){ 
                A.set(i+1,A.get(i)) ; 
                i -- ; 
            }
            A.set(i+1,keyClass) ;
        }
        return A ; 
    }
}
