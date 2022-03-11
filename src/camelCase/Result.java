package camelCase;

class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        // Write your code here
        int qntPalavras = s.split("[A-Z]").length;
        return qntPalavras;
    }

}