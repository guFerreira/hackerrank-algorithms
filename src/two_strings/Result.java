package two_strings;

import java.util.HashSet;
import java.util.Set;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // referencia - https://www.youtube.com/watch?v=TqzbP_3AUR8&ab_channel=StudyAlgorithms
        // Write your code here

        if(s1.equals(s2)){
            return "YES";
        }
        Set<Character> string1Set = new HashSet<>();
        Set<Character>string2Set = new HashSet<>();

        for (char c : s1.toCharArray()) {
            string1Set.add(c);
        }

        for (char c : s2.toCharArray()) {
            string2Set.add(c);
        }

        /*
        for(int i = 0; i < s1.length(); i++){
            for(int j = 0; j < s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    return "YES";
                }
            }
            char c = s1.charAt(i);
            s2 = s2.replace(c, Character.MIN_VALUE);
        }*/

        string1Set.retainAll(string2Set);
        if(string1Set.isEmpty()){
            return "NO";
        }
        return "YES";

    }

}