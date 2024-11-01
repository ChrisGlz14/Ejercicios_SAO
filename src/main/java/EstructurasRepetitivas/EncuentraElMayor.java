import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    //System.out.println("Ingrese un numero o un negativo para finalizar: ");
    int N = scanner.nextInt();

    int numMayor = 0;
    for (int i = 0; i < N; i++) {
        int numero = scanner.nextInt();

        if(numero > numMayor){
            numMayor = numero;
        }

    }
    System.out.println(numMayor);
}
