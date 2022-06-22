
public class Main {
    public static void main(String[] args) {
        //Instancia funcion Suma
        suma(10,20,30);

        //Instancia funcion añadir puerta coche
        Coche miCoche = new Coche();
        //Cada una aumenta en uno la funcion de addPuerta
        miCoche.addPuerta();
        miCoche.addPuerta();
        System.out.println(miCoche.numPuertas);
    }
    //Fucnion para sumar parametros
    public static void suma(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}