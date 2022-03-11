package plus_minus;

import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int qntPositivos = 0;
        int qntNegativos = 0;
        int qntZeros = 0;

        for (int i = 0; i < arr.size(); i++) {

            if(arr.get(i) >0){
                qntPositivos = qntPositivos+1;
            }else if (arr.get(i) < 0){
                qntNegativos++;
            }else{
                qntZeros++;
            }
        }
        int divisor = arr.size();
        float resultadoPositivo = (float)qntPositivos / arr.size();
        float resultadoNegativo = (float)qntNegativos/arr.size();
        float resultadoZero = (float)qntZeros/arr.size();

        System.out.println(resultadoPositivo);
        System.out.println(resultadoNegativo);
        System.out.println(resultadoZero);
    }

}