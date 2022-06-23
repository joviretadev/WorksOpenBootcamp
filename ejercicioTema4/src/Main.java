public class Main {
    public static void main(String[] args) {
        int numeroIf = 3;
        int numeroWhile = 0;
        int numeroDo = 3;
        var estacion = "sfs";

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

        System.out.println("Finaliza el While");
        //Bucle doWhile
        do{
            System.out.println(numeroDo);
            numeroDo = numeroDo -1;
        }while(numeroDo > 3);

        System.out.println("Finaliza el doWhile");
        //Bucle For
        for (var numeroFor = 0;numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("Finaliza el For");
        //Switch
        switch (estacion){
            case "Primavera":
                System.out.println("Primavera");
                break;
            case "Verano":
                System.out.println("Verano");
                break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Invierno":
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Esto no es una estación");
                break;
        }
    }
}