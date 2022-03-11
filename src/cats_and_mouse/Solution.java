package cats_and_mouse;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int distanciaGatoA = z - x;
        int distanciaGatoB = z - y;

        if (distanciaGatoA < 0) {
            distanciaGatoA = distanciaGatoA * -1;
        }

        if (distanciaGatoB < 0) {
            distanciaGatoB = distanciaGatoB * -1;
        }
        System.out.println(distanciaGatoA);
        System.out.println(distanciaGatoB);

        if (distanciaGatoA == distanciaGatoB) {
            return "Mouse C";
        }


        if (distanciaGatoA < distanciaGatoB) {
            return "Cat A";
        } else {
            return "Cat B";
        }


    }
}