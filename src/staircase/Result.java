package staircase;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        int altura = n;
        List<String> escada = new ArrayList<>();
        String degrau ="";

        int alturaDegrau = 0;

        for(int i = 0; i < altura; i++){
            int qntEspacoVazio = altura-alturaDegrau-1;

            for(int j = 0; j < qntEspacoVazio; j++){
                degrau+=" ";
            }

            for(int j = 0 ; j <= alturaDegrau; j++){
                degrau += "#";
            }

            alturaDegrau++;
            System.out.println(degrau);
            degrau = "";
        }
    }

}