package Diagonal_Difference;

import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int esquerdaPraDireita = 0;
        int direitaPraEsquerda = 0;
        for(int i = 0; i < arr.size(); i++){
            esquerdaPraDireita+= arr.get(i).get(i);
        }

        int aux = 0;
        for(int i = arr.size()-1; i >= 0; i--){
            direitaPraEsquerda = direitaPraEsquerda + arr.get(i).get(aux);
            aux++;
        }

        int resultado = esquerdaPraDireita - direitaPraEsquerda;
        if(resultado < 0){
            resultado = resultado *-1;
        }
        return resultado;
    }

}
