public class Main {
    public static void main(String[] args) {

        Cliente clienteUno = new Cliente();
        Trabajador trabajadorUno = new Trabajador();

        clienteUno.edad = 50;
        clienteUno.nombre = "Tomás";
        clienteUno.telefono = 666995883;
        clienteUno.credito = 17500;

        trabajadorUno.edad = 37;
        trabajadorUno.nombre = "Lorenzo";
        trabajadorUno.telefono = 692038747;
        trabajadorUno.salario = 1500;

        System.out.println(clienteUno.nombre +" "+ clienteUno.edad +" años, con numero de telefono: "+  clienteUno.telefono +". Saldo: "+  clienteUno.credito +"€");
        System.out.println(trabajadorUno.nombre +" "+ trabajadorUno.edad +" años, con numero de telefono: "+  trabajadorUno.telefono +". Salario: "+  trabajadorUno.salario+"€");
    }
}
class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    float credito;
}

class Trabajador extends Persona {
    float salario;
}