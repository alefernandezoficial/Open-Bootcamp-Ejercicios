public class Ejercicio3{
public static void main(String[] args) {
    // if, else if & else
    int numeroIf = 0;
    if (numeroIf < 0){
        System.out.println("variable numeroIf " + numeroIf + " es negativo");
    }
    else if (numeroIf > 0){
        System.out.println("variable numero If " + numeroIf + " es positivo");
    } else {
        System.out.println("variable numeroIf es 0");
    }

    // While
    int numeroWhile = 1;
    while(numeroWhile < 3){
        numeroWhile++;
        System.out.println("variable numeroWhile es: " + numeroWhile);
    }

    // Do While
    int numeroDoWhile = 0;
    do{
        numeroDoWhile++;
        System.out.println("variable numeroDoWhile es: " + numeroDoWhile);
    }while(numeroDoWhile < 3);

    // For
    for(int numeroFor = 0; numeroFor <= 5; numeroFor++){
        System.out.println("La variable numeroFor es: " + numeroFor);
    }

    // Switch
    String estacion = "primavera";
    switch(estacion){
        case "verano":
            System.out.println("Es verano");
        break;
        case "invierno":
            System.out.println("Es invierno");
        break;
        case "primavera":
            System.out.println("Es primavera");
        break;
        case "otoño":
            System.out.println("Es otoño");
        break;
        default:
            System.out.println("No es una estacion del año");
    }
}
}