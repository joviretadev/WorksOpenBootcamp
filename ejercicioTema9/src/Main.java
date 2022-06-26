public class Main {
    public static void main(String[] args) {
        Cliente clienteUno = new Cliente();
        Trabajador trabajadorUno = new Trabajador();
        clienteUno.setEdad(50);
        clienteUno.setNombre("Tomás");
        clienteUno.setTelefono(666995883);
        clienteUno.setCredito(17500);

        trabajadorUno.setEdad(37);
        trabajadorUno.setNombre("Lorenzo");
        trabajadorUno.setTelefono(692038747);
        trabajadorUno.setSalario(1500);

        System.out.println(clienteUno.getNombre() +" "+ clienteUno.getEdad() +" "+  clienteUno.getTelefono() +" "+  clienteUno.getCredito());
        System.out.println(trabajadorUno.getNombre() +" "+ trabajadorUno.getEdad() +" "+  trabajadorUno.getTelefono() +" "+  trabajadorUno.getSalario());
    }
}
   abstract class Persona {
        int edad;
        String nombre;
        int telefono;

        abstract public void  setEdad(int edad);
        abstract public void setNombre(String nombre);
        abstract public void setTelefono(int telefono);

        abstract public int getEdad();
        abstract public String getNombre();
        abstract public int getTelefono();
    }
    class Cliente extends Persona {
        int credito;
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public int getEdad() {
            return this.edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return this.nombre;
        }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
        public int getTelefono() {
            return this.telefono;
        }
        public void setCredito(int credito) {
            this.credito = credito;
        }
        public int getCredito() {
            return this.credito;
        }

    }
    class Trabajador extends Persona {
        float salario;

        public void setSalario(float salario) {
            this.salario = salario;
        }
        public float getSalario() {
            return this.salario;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public int getEdad() {
            return this.edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return this.nombre;
        }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
        public int getTelefono() {
            return this.telefono;
        }
    }