public class Ejercicio4 {
public static void main(String[] args) {

    Persona persona = new Persona();

    persona.setNombre("Alejandro");
    System.out.println("Mi nombre es " + persona.getNombre());

    persona.setEdad(28);
    System.out.println("Tengo " + persona.getEdad() + " años");

    persona.setTelefono(341233212);
    System.out.println("Mi telefono es " + persona.getTelefono());

}
}
class Persona{

    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}