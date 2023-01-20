public class Ejercicio2{
public static void main(String[] args){
    Coche miCoche = new Coche();
    miCoche.AgregarPuerta();
    miCoche.AgregarPuerta();
    miCoche.AgregarPuerta();
    miCoche.AgregarPuerta();
    System.out.println(miCoche.puertas);
}
}
class Coche {
    public int puertas = 0;

public void AgregarPuerta(){
    this.puertas++;
}
}