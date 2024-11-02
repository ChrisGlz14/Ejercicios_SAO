
import java.util.Scanner;

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n1,n2, multiplo, contador = 0;

    n1 = sc.nextInt();
    n2 = sc.nextInt();
    multiplo = sc.nextInt();


    while(n1 !=n2 ){
        if ((n2 % multiplo) == 0) {
            contador++;
        }
        n2--;
    }

    System.out.println(contador);
}
