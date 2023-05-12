package ExercicioCinco;

import java.util.Scanner;

public class Ler20numeros {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 20 numeros: ");
        for (int i =0; i < numeros.length; i++) {
            numeros[i]= ler.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 0 && numeros[i] <= 100)
            {
                System.out.println("Os numeros entre 0 e 100 são " + numeros[i]);
            }
        }
    }
}


