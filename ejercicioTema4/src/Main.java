public class Main {
    public static void main(String[] args) {
        int numeroIf = 3;
        int numeroWhile = 0;

        //Condicional If
        if(numeroIf > 0) {
            System.out.println("Este numero es positivo");
        }else if(numeroIf == 0){
            System.out.println("Este numero es cer0");
        }else {
            System.out.println("Este numero es negativo");
        }
         //Bucle While inferior a 3
        while(numeroWhile <= 3) {

            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

    }
}