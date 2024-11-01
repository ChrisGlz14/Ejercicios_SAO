
import java.util.Scanner;


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