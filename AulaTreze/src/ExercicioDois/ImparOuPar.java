package ExercicioDois;

import java.util.Scanner;
public class ImparOuPar {
    public static void main(String[] args) {
        Scanner nmr = new Scanner(System.in);
        int A, resultado;
        System.out.println("Digite um valor: ");
        A = nmr.nextInt();

        if (A % 2 == 0) {
        resultado = A + 5;
        System.out.println("O resultado é "+resultado);}
        else { resultado = A+8;
        System.out.println("O resultado é "+ resultado);}

    }
}
