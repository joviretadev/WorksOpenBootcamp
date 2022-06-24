public class Main {
    public static void main(String[] args) {
        Persona PersonaUno = new Persona();
        PersonaUno.setEdad(119);
        PersonaUno.setNombre("Kane Tanaka");
        PersonaUno.setTelefono(626622873);

        System.out.println("Me llamo " + PersonaUno.getNombre() + ", tengo " + PersonaUno.getEdad() + " años" + " y mi número de telefono es: " + PersonaUno.getTelefono());
    }
}