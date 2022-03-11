package time_conversion;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int [] horario = new int [3];
        String [] horarioString = s.split(":");

        horarioString[2] = horarioString[2].replace("PM", "");
        horarioString[2] = horarioString[2].replace("AM", "");

        for(int i = 0; i < 3; i++){
            horario[i] = Integer.parseInt(horarioString[i]);
        }

        String resultado = "";

        if(s.contains("AM")){
            if(horario[0] == 12){
                horario[0] = 00;
            }
        }

        if(s.contains("PM")){
            if(horario[0] == 12){
                horario[0] = 00;
            }else{
                horario[0] = horario[0] + 12;
            }
        }

        resultado = String.format("%02d", horario[0])+
                ":"+String.format("%02d", horario[1])+
                ":"+String.format("%02d", horario[2]);

        return resultado;
    }

}