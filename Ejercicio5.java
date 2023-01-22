public class Ejercicio5{

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "Alejandro";
        cliente.edad = 28;
        cliente.telefono = 412758775;
        cliente.credito = 800.99;

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "$");

        trabajador.nombre = "Marcelo";
        trabajador.edad = 60;
        trabajador.telefono = 1234567849;
        trabajador.salario = 1000.12;

        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "$");

    }
}

class PersonaX{
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends PersonaX{
    double credito;
}

class Trabajador extends PersonaX{
    double salario;
}