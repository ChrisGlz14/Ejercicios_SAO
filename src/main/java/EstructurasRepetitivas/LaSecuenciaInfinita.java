
import java.util.Scanner;

//Escribe los primeros enteros de la secuencia infinita 1 2 3 4 5 4 3 2 1 2 3 4 5 4 3 2 1 2 3 4 5 . . .

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int num = scanner.nextInt();
    int contador = 1;
     //Variable que usaremos para incrementar en 1
    int incremento  = 1;

    for (int i = 0; i < num; i++) {
    System.out.println(contador);
        contador += incremento;

    if (contador == 5)incremento+=-1; //Si llega a 5 empieza a disminuir

    if (contador ==1)incremento=1; //Si llega a 1 empieza a aumentar
    }

}
