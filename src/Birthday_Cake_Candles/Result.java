package Birthday_Cake_Candles;

import java.util.List;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maior = 0;
        int qntVelas = 0;
        for(int i =0; i < candles.size(); i++){
            if(maior < candles.get(i)){
                maior = candles.get(i);
                qntVelas = 1;
            }else if(maior == candles.get(i)){
                qntVelas++;
            }
        }
        return qntVelas;
    }

}
