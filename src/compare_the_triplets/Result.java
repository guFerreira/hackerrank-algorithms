package compare_the_triplets;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int notaA = 0;
        int notaB = 0;
        List<Integer> response = new ArrayList<Integer>();
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                notaA++;
            }else if(b.get(i) > a.get(i)){
                notaB++;
            }
        }
        response.add(notaA);
        response.add(notaB);
        return response;

    }

}