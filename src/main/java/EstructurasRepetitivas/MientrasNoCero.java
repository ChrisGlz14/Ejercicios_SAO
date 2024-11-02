
import java.util.Scanner;

//Solicitar al usuario una cantidad indeterminada de números, teminar la solicitud cuando sea 0.
//Desplegar al final la suma de los números tecleados.

public void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int suma = 0;

    //System.out.println("Ingrese un numero o 0 para terminar: ");
    int numIngreso = scanner.nextInt();

    while (numIngreso != 0) {

        suma += numIngreso;

        //  System.out.println("Ingrese otro nuevo numero: ");
        numIngreso = scanner.nextInt();

    }
    System.out.println(suma);


}