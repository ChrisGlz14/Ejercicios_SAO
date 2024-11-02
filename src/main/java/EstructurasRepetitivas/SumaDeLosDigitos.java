
import java.util.Scanner;

//Escribe un programa que lea un entero positivo y regrese la suma de sus dígitos. Por ejemplo: si el entero es 123,
// el programa deberá producir 6, ya que 1 +2 + 3 = 6.
//Nota: Si tu programa usa una función recursiva, vale 50 puntos, si no usa una función recursiva vale 30 puntos.


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numero = sc.nextInt();
    int suma = 0;

    while (numero > 0) {
        suma += numero % 10;
        numero /= 10;
    }

    System.out.println(suma);

}
