public class Ejercicio2{
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
    System.out.println(miCoche.puertas);
    }
}
class Coche{
    int puertas = 0;
public void AgregarPuertas(){
    this.puertas++;
}
}